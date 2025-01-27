import React from "react";
import "./navbar-menu.css";

const NavbarMenu = () => {
    return (
        <div className="menu-container">
            <ul className="menu-list">
                <li>Home</li>
                <li className="separatorLine"></li>
                <li>Adopt</li>
                <li className="separatorLine"></li>
                <li>About</li>
            </ul>
        </div>
    );
};

export default NavbarMenu;
