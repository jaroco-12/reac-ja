import React from "react";
import Item from "./item";

export default Itembox;

function Itembox() {
    return (
        <div className="layout-items">
            <h1>Itembox</h1>
            <Item />
            <Item />
            <Item />
            <Item />
        </div>
    );  
};