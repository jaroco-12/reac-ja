import React from "react";

export default Itembox;



function Itembox() {
    const [products, setProducts] = React.useState([]);
    const [selectedProductId, setSelectedProductID] = React.useState(null);

    React.useEffect(() => {
        fetch("http://localhost:8080/all")
            .then((response) => response.json())
            .then((data) => setProducts(data))
    })

    const productClick = (productID) => {
        setSelectedProductID(productID)
    }

    const backClick = () => {
        setSelectedProductID(null)
    }


    return (
        <div className="layout-items">
                {products.map((product) => 
                    selectedProductId === product.id ? (
                        <div key={product.id} className="grid-item detail-view">
                            <h2>{product.name}</h2>
                            <p>Price: ${product.price}</p>
                            <p>Description: {product.description || "No description available."}</p>
                            <button onClick={backClick}>Back to Product List</button>
                        </div>
                    ) : (
                    <div key={product.id} className="items" onClick={() => productClick(product.id)}>
                        <h3>{product.productName}</h3>
                        <p>{product.price}</p>
                    </div>
                ))} 
        </div>
    );  
};