import React, { useEffect, useState } from "react";
import "./navbar-bg.css";
import { NavbarTitle, NavbarMenu } from "../Navbar";

const Navbar = () => {
    const [top, setTop] = useState(0);
    const [isHovered, setIsHovered] = useState(false);
    const [isTransitioning, setIsTransitioning] = useState(false);

    useEffect(() => {
        const handleScroll = () => {
            const currentScrollY = window.scrollY;
            const newTop = Math.max(-currentScrollY / 3, -120);
            setTop(newTop);
        };

        window.addEventListener("scroll", handleScroll);

        return () => window.removeEventListener("scroll", handleScroll);
    }, []);

    const handleMouseEnter = () => {
        setIsHovered(true);
        setIsTransitioning(true);
    };

    const handleMouseLeave = () => {
        setIsHovered(false);
        setTimeout(() => {
            setIsTransitioning(false);
        }, 300);
    };

    return (
        <div
            className={`wholeNavbar ${isTransitioning ? "transition" : ""} ${
                isHovered ? "hovered" : ""
            }`}
            style={{ top: `${top}px` }}
            onMouseEnter={handleMouseEnter}
            onMouseLeave={handleMouseLeave}
        >
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
