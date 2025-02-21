import React from "react";
import { Link } from "react-router-dom";
import "./navbar-menu.css";

const NavbarMenu = () => {
    return (
        <div className="menu-container">
            <ul className="menu-list">
                <li>
                    <Link to="/" className="nav-link">
                        Home
                    </Link>
                </li>
                <li className="separatorLine"></li>
                <li>
                    <Link to="/adopt" className="nav-link">
                        Adopt
                    </Link>
                </li>
                <li className="separatorLine"></li>
                <li>
                    <Link to="/about" className="nav-link">
                        About
                    </Link>
                </li>
            </ul>
        </div>
    );
};

export default NavbarMenu;
