import React from "react";
import "./info-card.css";

const InfoCard = ({
    infoImage,
    title,
}: {
    infoImage: string;
    title: string;
}) => {
    return (
        <div className="info-card-container">
            <div className="info-title-container">
                <p>{title}</p>
            </div>
            <div className="info-title-image-container">
                <img src={infoImage} alt="" />
            </div>
        </div>
    );
};

export default InfoCard;
