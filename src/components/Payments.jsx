import { useEffect, useState } from "react";


const Payments = () => {
    const initialPayment = {
        sahal: false,
        evcPlus: false,
        zaad: false,
      
    }
    const [payment, setPayment] = useState(initialPayment);
    const [updatePayment, setUpdatePayment] = useState(false);
    useEffect(() => {}, [updatePayment]);
    return (
        <div>
            <h2>Payment Methods</h2>
       <div className="payment-cards">
       <div className={`payment-card ${payment.sahal && "selected"}`}
        onClick={() =>
            setPayment({...initialPayment, sahal: true})
        }
        >
         
                <h3>Sahal Services</h3>
          
        </div>
         <div className={`payment-card ${payment.evcPlus && "selected"}`}
         onClick={() =>
             setPayment({...initialPayment, evcPlus: true})
         }
         >
       
             <h3>EVC Plus</h3>
         
     </div>
     <div className={`payment-card ${payment.zaad && "selected"}`}
     onClick={() =>
         setPayment({...initialPayment, zaad: true})
     }
     >
      
             <h3>Zaad Services</h3>
      
     </div>
     <form>
    
         <input type="text" className="form-control" placeholder="25261......" />
         <button className="btn-proceed">proceed</button>
       
     </form>

       </div>
            
     
     </div>
    )
}
export default Payments;