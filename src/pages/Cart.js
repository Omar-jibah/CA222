import CartOrder from "../components/CartOrder";
import Payments from "../components/Payments";

const Cart = () => {
    return (
        <div className="cart_container">
            <CartOrder/>
            <Payments/>
        </div>
    );
}

export default Cart;