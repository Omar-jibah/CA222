import useOrder from "../OrderContext";
import '@fortawesome/fontawesome-free/css/all.min.css';


const CartOrder = () => {
    const { products, removeFromCart, total } = useOrder();
    return (
        <div className="cart_products">
            <h3>Cart Products</h3>
            {products.map((product) => (
                <div key={product.id} className="cart__product">
                    <div className="cart__tittle_image">
                        <img src={product.image} alt={product.name} />
                        <span>{product.name}</span>
                    </div>
                    <div className="cart__price_quantity">
                        <p>{product.price}</p>
                        <button className="remove" onClick={() => removeFromCart(product)}>
                            <i className="fas fa-trash"></i> {/* Trash icon */}
                        </button>
                    </div>
                </div>
            ))}
            <div className="total_price">
                <h2>Total Price: ${total}</h2>
            </div>
        </div>
    );
};

export default CartOrder;
