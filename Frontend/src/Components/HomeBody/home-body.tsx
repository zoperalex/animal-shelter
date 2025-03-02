import React from "react";
import "./home-body.css";
import { InfoCard } from "../HomeBody";

const db = {
    title: "Meet the pups!",
    infoImage: "/images/dogs.png",
    description:
        "The pups are here! Ol' Betsy has finally had her pups, and they are as cute as ever! Come meet them!",
};

const HomeBody = () => {
    return (
        <div className="home-body">
            <div className="top-image-container">
                <img
                    src="/images/NavBar-white.svg"
                    className="top-image"
                    alt=""
                />
            </div>
            <div className="home-body-info">
                <div className="home-body-info-description">
                    <h1 className="title">What's new...</h1>
                    <p className="body">{db.description}</p>
                </div>
                <div className="home-body-info-card-container">
                    <InfoCard title={db.title} infoImage={db.infoImage} />
                </div>
            </div>
        </div>
    );
};

export default HomeBody;
