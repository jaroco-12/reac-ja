import React from "react";
import Item from "./item";

export default Itembox;



function Itembox() {
    const [products, setProducts] = React.useState([])

    React.useEffect(() => {
        fetch("http://localhost:8080/all")
            .then((response) => response.json())
            .then((data) => setProducts(data))
    })

    return (
        <div className="layout-items">
                {products.map((product) => (
                    <div key={product.id} className="item">
                        <h3>{product.productName}</h3>
                        <p>{product.price}</p>
                    </div>
                ))} 
        </div>
    );  
};