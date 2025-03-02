import React from "react";
import "./info-card.css";

interface InfoCardProps {
    infoImage: string;
    title: string;
}

const InfoCard: React.FC<InfoCardProps> = ({ infoImage, title }) => {
    return (
        <div className="info-card-container">
            <div className="info-title-container">
                <p>{title}</p>
            </div>
            <div className="info-title-image-container">
                <img src={infoImage} alt="" />
            </div>
            {/* <div className="info-description-container">
                <p className="description">{description}</p>
                <div className="info-description-image-container">
                    <img
                        src="/images/right-arrow.png"
                        alt="right-arrow"
                        className="right-arrow"
                    />
                </div>
            </div> */}
        </div>
    );
};

export default InfoCard;
