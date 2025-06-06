import React from "react";
import "./animal-card.css";

interface Animal {
	name: string;
	description: string;
	imageUrl: string;
}

interface AnimalCardProps {
	animal: Animal;
}

const AnimalCard: React.FC<AnimalCardProps> = ({ animal }) => {
	const [imgError, setImgError] = React.useState(false);

	return (
		<div className="animal-card-container">
			<div className="animal-card-header">
				<h2>{animal.name}</h2>
			</div>
			<div className="animal-card-content">
				<img
					src={animal.imageUrl}
					className="animal-image"
					onError={() => setImgError(true)}
				/>
				{imgError && (
					<div className="animal-image-alt">
						image of the animal named {animal.name}
					</div>
				)}
				<p className="animal-description">{animal.description}</p>
			</div>
		</div>
	);
};

export default AnimalCard;
