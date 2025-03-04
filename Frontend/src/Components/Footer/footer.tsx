import React from "react";
import "./footer.css";

const Footer = () => {
    return (
        <>
            <div className="footer-container">
                <div className="footer-content-container">
                    <div className="logo">
                        <img className="logo" src="/images/logo.png" alt="" />
                    </div>
                    <div className="links-container">
                        <div className="links">
                            <ul>
                                <li>link 1</li>
                                <li>link 2</li>
                                <li>link 3</li>
                                <li>link 4</li>
                            </ul>
                        </div>
                        <div className="links">
                            <ul>
                                <li>link 1</li>
                                <li>link 2</li>
                                <li>link 3</li>
                                <li>link 4</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
};

export default Footer;
