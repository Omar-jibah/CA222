import { useEffect, useState } from "react"
import useOrder from "../OrderContext"

const Product = ({product}) => {
    const [isInOrder, setIsInOrder] = useState(false)
    const {addToCart,removeFromCart, products} = useOrder()
    useEffect(()=> {
        const isUpdateInOrder = products.filter(pro => pro.id === product.id)
        if (isUpdateInOrder.length > 0) {
            setIsInOrder(true)
        }
        else {
            setIsInOrder(false)
        }
    },[products])
    
    const handleOrderUpdate = () => {
        if(isInOrder) {
            removeFromCart(product)

           

        }
        else {
            addToCart(product)
        }
      

       
    }
   
    return (
        <div className="grid">
             <img src={product.image} alt={product.name} />
             <div className="grid-info">
             <span>{product.name}</span>
             <span>${product.price}</span>
             <button className={`${isInOrder ? "btn btn-secondary" : "btn btn-primary" }`}
             onClick={handleOrderUpdate}
             >  {isInOrder ? "-" : "+" } </button>
                

              
             <div className="stars">⭐⭐⭐⭐⭐</div>
           
             </div>
           
        </div>
    )


}
export default Product