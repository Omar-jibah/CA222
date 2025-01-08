import Header from './components/Header';
import {Route, Routes} from "react-router-dom";
import Home from './pages/Home';
import About from './pages/About';
import Products from './pages/Products';
import Contact from './pages/Contact';
import Cart from './pages/Cart';
import SearchRes from './pages/SearchRes';
const App = () => {
    return (
        <div className='container'>
            <Header/>
            <Routes>
            <Route path="/" element={<Home/>}/>
            <Route path="/about" element={<About/>}/>
            <Route path="/products" element={<Products/>}/>
            <Route path="/cart" element={<Cart/>}/>
            <Route path="/contact" element={<Contact/>}/>
            {/* <Route path="/search" element={<SearchRes/>}/> */}

            </Routes>
        </div>
    );
}
export default App;