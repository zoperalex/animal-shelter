export const fetchFilteredAnimals = async (
	colorId?: number,
	breedId?: number,
	speciedId?: number,
	disabilities?: boolean
) => {
	console.log("Fetching filtered animals...");
	const params = new URLSearchParams();

	if (colorId !== undefined) params.append("colorId", colorId.toString());
	if (breedId !== undefined) params.append("breedId", breedId.toString());
	if (speciedId !== undefined)
		params.append("speciedId", speciedId.toString());
	if (disabilities !== undefined)
		params.append("disabilities", disabilities.toString());

	const response = await fetch(
		`https://localhost:8443/animal/search?${params.toString()}`
	);
	if (!response.ok) {
		throw new Error("Network response was not ok");
	}
	return await response.json();
};

export default fetchFilteredAnimals;
