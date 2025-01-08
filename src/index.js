import { createRoot } from "react-dom/client";
import { BrowserRouter } from "react-router-dom";
import App from "./App";
import { OrderProvider } from "./OrderContext";

const container = document.getElementById("root");
const root = createRoot(container);
root.render(
  <OrderProvider>
     <BrowserRouter>
      <App/>
    </BrowserRouter>

  </OrderProvider>
   
  
)