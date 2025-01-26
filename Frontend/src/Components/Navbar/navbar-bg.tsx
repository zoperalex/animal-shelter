import React from "react";
import "./navbar-bg.css";
import { NavbarTitle } from "../Navbar";

const Navbar = () => {
    return (
        <div className="wholeNavbar">
            <div className="container">
                <img className="NavBar" src="/images/NavBar.png" alt="clouds" />
                <div className="title">
                    <NavbarTitle />
                </div>
            </div>
        </div>
    );
};

export default Navbar;
