import React from "react";
import { Link } from "react-router-dom";
import "./navbar-menu.css";

const NavbarMenu = () => {
    return (
        <div className="menu-container">
            <ul className="menu-list">
                <li>
                    <Link to="/">Home</Link>
                </li>
                <li className="separatorLine"></li>
                <li>
                    <Link to="/adopt">Adopt</Link>
                </li>
                <li className="separatorLine"></li>
                <li>
                    <Link to="/about">About</Link>
                </li>
            </ul>
        </div>
    );
};

export default NavbarMenu;
