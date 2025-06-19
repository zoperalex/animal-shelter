export const fetchAllAnimals = async () => {
	console.log("Fetching all animals...");
	const response = await fetch("https://localhost:8443/animal");
	if (!response.ok) {
		throw new Error("Network response was not ok");
	}
	return await response.json();
};

export default fetchAllAnimals;
