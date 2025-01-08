import { createContext, useContext, useReducer, useEffect } from "react";
import { initialState, OrderReducer } from "./OrderReducer";

const OrderContext = createContext(initialState);

export const OrderProvider = ({ children }) => {
    const [state, dispatch] = useReducer(OrderReducer, initialState);

    // Load data from localStorage on component mount
    useEffect(() => {
        const savedProducts = JSON.parse(localStorage.getItem('cartProducts')) || [];
        const savedTotal = JSON.parse(localStorage.getItem('cartTotal')) || 0;

        if (savedProducts.length > 0) {
            dispatch({
                type: "ADD_PRODUCT",
                payload: { products: savedProducts }
            });
            dispatch({
                type: "CALCULATE_TOTAL",
                payload: { total: savedTotal }
            });
        }
    }, []);

    const addToCart = (product) => {
        const updatedOrder = state.products.concat(product);
        dispatch({
            type: "ADD_PRODUCT",
            payload: {
                products: updatedOrder
            }
        });
        calculateTotal(updatedOrder);
    };

    const removeFromCart = (product) => {
        const updatedOrder = state.products.filter(item => item.id !== product.id);
        dispatch({
            type: "REMOVE_PRODUCT",
            payload: {
                products: updatedOrder
            }
        });
        calculateTotal(updatedOrder);
    };

    const calculateTotal = (products) => {
        let total = products.reduce((sum, product) => sum + Number(product.price), 0);
        total = parseFloat(total.toFixed(3));

        // Dispatch the total update
        dispatch({
            type: "CALCULATE_TOTAL",
            payload: {
                total: total
            }
        });

        // Save products and total to localStorage
        localStorage.setItem('cartProducts', JSON.stringify(products));
        localStorage.setItem('cartTotal', JSON.stringify(total));
    };

    const values = {
        products: state.products,
        total: state.total,
        addToCart,
        removeFromCart,
    };

    return (
        <OrderContext.Provider value={values}>
            {children}
        </OrderContext.Provider>
    );
};

const useOrder = () => {
    const order = useContext(OrderContext);
    if (order === undefined) {
        throw new Error("useOrder must be used within OrderProvider");
    }
    return order;
};

export default useOrder;
