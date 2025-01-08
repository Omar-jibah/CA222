export const initialState = {
    products: [],
    total: 0,
}
export const OrderReducer = (state, action) => {
    const {type, payload} = action;
    switch (type) {
        case 'ADD_PRODUCT':
            return {
                ...state,
                products: payload.products,
            
                
            }
        case 'REMOVE_PRODUCT':
            return {
                ...state,
                products: payload.products,
            
                
            }
            
        case 'CALCULATE_TOTAL':
            return {
                ...state,
                total: payload.total,
            
                
            }
            

        default:
           throw new Error(`Invalid action ${action}`);
    }

 }