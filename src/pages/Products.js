import Product from "../components/Product";
import {ProductList} from "../components/ProductList";
const Products = () => {

    return (
        <div className="products">
            <div className="product-info">
                <span>"Your Gateway Catting-Edge Computing. "</span>
                <h2>Product Name</h2>
                <p>Explore Our Range of Premium Computers </p>
            </div>
            <div className="product-list">
               {
                ProductList.map((product) => {
                    return(
                        <div className="product-list-item">
                            <Product key={product.id} product={product} />
                        </div>
                    )
                })
               }
               <div>
                <button className="btn-wiew">View All</button>
               </div>
               <div className="view-product">
               <div className="customer-view">
                <h3>Reviev From Our Costumers</h3>
                <div className="customer-view-item">
                <div className="stars">⭐⭐⭐⭐⭐</div>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sodales, metus vel elementum semper, mauris ligula ullamcorper lectus, in auctor purus ligula vel tellus. Donec vel velit at mauris fermentum pellentesque.</p>
                    <span>__Hakiimi M.</span>
                
                </div>
                <div className="customer-view-item-2">
                <div className="stars">⭐⭐⭐⭐⭐</div>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sodales, metus vel elementum semper, mauris ligula ullamcorper lectus, in auctor purus ligula vel tellus. Donec vel velit at mauris fermentum pellentesque.</p>
                    <span>__Rashka R.</span>
                </div>
                </div>

               </div>
                
          
                
              
            </div>
           
        </div>
        
    )
}

export default Products ;