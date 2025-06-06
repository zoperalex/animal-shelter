import React from "react";
import "./adopt-body.css";
import AnimalCard from "../AnimalCard/animal-card";

const animals = {
	dog: {
		name: "Buddy",
		description: "A friendly golden retriever looking for a loving home.",
		imageUrl: "/images/dog.jpg",
	},
	cat: {
		name: "Whiskers",
		description: "A playful tabby cat who loves to cuddle.",
		imageUrl: "/images/cat.jpg",
	},
	rabbit: {
		name: "Fluffy",
		description: "A cute bunny that enjoys hopping around.",
		imageUrl: "/images/rabbit.jpg",
	},
	parrot: {
		name: "Polly",
		description: "A colorful parrot that loves to talk.",
		imageUrl: "/images/parrot.jpg",
	},
	hamster: {
		name: "Nibbles",
		description: "A tiny hamster with a big appetite.",
		imageUrl: "/images/hamster.jpg",
	},
	turtle: {
		name: "Shelly",
		description: "A calm turtle who loves basking in the sun.",
		imageUrl: "/images/turtle.jpg",
	},
	guineaPig: {
		name: "Peanut",
		description: "A gentle guinea pig who enjoys being held.",
		imageUrl: "/images/guinea-pig.jpg",
	},
	ferret: {
		name: "Slinky",
		description: "A playful ferret who loves to explore.",
		imageUrl: "/images/ferret.jpg",
	},
	horse: {
		name: "Star",
		description: "A majestic horse ready for a new adventure.",
		imageUrl: "/images/horse.jpg",
	},
	goat: {
		name: "Billy",
		description: "A curious goat who loves to climb.",
		imageUrl: "/images/goat.jpg",
	},
	chinchilla: {
		name: "Dusty",
		description: "A soft chinchilla who enjoys dust baths.",
		imageUrl: "/images/chinchilla.jpg",
	},
	duck: {
		name: "Quackers",
		description: "A cheerful duck who loves swimming.",
		imageUrl: "/images/duck.jpg",
	},
};

const AdoptBody = () => {
	return (
		<div className="adopt-body-container">
			<div className="adopt-body-content">
				<div className="animal-card-grid">
					{Object.keys(animals).map((key) => (
						<AnimalCard
							key={key}
							animal={animals[key as keyof typeof animals]}
						/>
					))}
				</div>
			</div>
		</div>
	);
};

export default AdoptBody;
