import React, { useState, useEffect } from "react";
import "./Carousel.css";

const images = [
    "/images/dogs.png",
    "/images/animalshelter.png",
    "/images/raccoon.jpg",
    "/images/tortoise.jpg",
];

const Carousel = () => {
    const [currentIndex, setCurrentIndex] = useState(0);

    useEffect(() => {
        const interval = setInterval(() => {
            setCurrentIndex((prevIndex) => (prevIndex + 1) % images.length);
        }, 4000);

        return () => clearInterval(interval);
    }, []);

    const goToSlide = (index: number) => {
        setCurrentIndex(index);
    };

    return (
        <div className="carousel">
            {images.map((image, index) => (
                <div
                    key={index}
                    className={`carousel-item ${
                        index === currentIndex ? "active" : ""
                    }`}
                >
                    <img src={image} alt={`Slide ${index}`} />
                </div>
            ))}
            <div className="carousel-indicators">
                {images.map((_, index) => (
                    <span
                        key={index}
                        className={`indicator ${
                            index === currentIndex ? "active" : ""
                        }`}
                        style={{
                            width: `${Math.max(
                                12.5 - 2.5 * Math.abs(currentIndex - index),
                                7.5
                            )}px`,
                            height: `${Math.max(
                                12.5 - 2.5 * Math.abs(currentIndex - index),
                                7.5
                            )}px`,
                        }}
                        onClick={() => goToSlide(index)}
                    ></span>
                ))}
            </div>
        </div>
    );
};

export default Carousel;
