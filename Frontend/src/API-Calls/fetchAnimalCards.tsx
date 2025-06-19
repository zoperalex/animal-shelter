export const fetchAllAnimalCards = async () => {
	console.log("Fetching all animal cards...");
	const response = await fetch("https://localhost:8443/animal/cards");
	if (!response.ok) {
		throw new Error("Network response was not ok");
	}
	return await response.json();
};

export default fetchAllAnimalCards;
