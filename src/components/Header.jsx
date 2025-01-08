import { Link } from "react-router-dom";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faSearch, faShoppingCart } from "@fortawesome/free-solid-svg-icons";
import "../style.css";
import useOrder from "../OrderContext";

const Header = () => {
  const {products} = useOrder()
  return (
    <div className="main-header">
    
    <div className="header">
    
      {/* Logo */}
      <div className="header-logo-main">
      <Link to="/" className="header-logo">Logo</Link>
      </div>

      {/* Navigation Links */}
      <div className="header-links">
        <Link to="/">Home</Link>
        <Link to="/about">About Us</Link>
        <Link to="/products">Products</Link>
        <Link to="/Contact">Contact Us</Link>
      
        
      </div>

      {/* Search and Cart Icons */}
      <div className="header-icons">
        <Link to="/search"> <FontAwesomeIcon icon={faSearch} className="header-icon" /></Link>
       
      
        <span className={`cart-1 ${products.length > 0 ? 'active' : ''}`}>
        <Link to="/cart"> <FontAwesomeIcon icon={faShoppingCart} className="header-icon" /></Link>
 
  {products.length}
</span>
      </div>
    </div>
    </div>
  );
}

export default Header;
