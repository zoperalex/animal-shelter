import React from "react";
import "./navbar-bg.css";
import { NavbarTitle, NavbarMenu } from "../Navbar";

const Navbar = () => {
    return (
        <div className="wholeNavbar">
            <div className="container">
                <img
                    className="NavBar"
                    src="/images/NavBar-white.png"
                    alt="clouds"
                />
                <div className="navbar-content-container">
                    <div className="title">
                        <NavbarTitle />
                    </div>
                    <div className="menu">
                        <NavbarMenu />
                    </div>
                </div>
            </div>
        </div>
    );
};

export default Navbar;
