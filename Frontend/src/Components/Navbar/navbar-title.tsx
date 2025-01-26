import React from "react";
import "./navbar-title.css";

const NavbarTitle = () => {
    return (
        <div className="title-container">
            <div style={{ height: "100%" }}>
                <span className="FirstLetter">A</span>nimal{" "}
                <span className="FirstLetter">S</span>helter
            </div>
            <div className="separationLine"></div>
        </div>
    );
};

export default NavbarTitle;
