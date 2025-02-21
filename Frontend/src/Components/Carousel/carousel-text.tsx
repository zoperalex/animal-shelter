import React from "react";
import { Link } from "react-router-dom";
import "./carousel-text.css";

const CarouselText = () => {
    return (
        <div className="carousel-text">
            <h1>
                Save a <span>Life</span>
            </h1>
            <Link to="/adopt">
                <h3>
                    <span className="adopt-text">Adopt</span>{" "}
                    <span className="now-text">Now!</span>
                </h3>
            </Link>
        </div>
    );
};

export default CarouselText;
