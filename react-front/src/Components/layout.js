import React from "react";
import Sidebar from "./sidebar";
import Itembox from "./Itembox";

export default Layout;

function Layout() {
    return (
        <div class='layout'>
            <Sidebar class="sidebar" />
            <Itembox />
        </div>
    );
};