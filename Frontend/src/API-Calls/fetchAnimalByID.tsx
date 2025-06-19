export const fetchAnimalById = async (id: number) => {
	console.log(`Fetching animal with id: ${id}`);
	const response = await fetch(`https://localhost:8443/animal/${id}`);
	if (!response.ok) {
		throw new Error("Network response was not ok");
	}
	return await response.json();
};

export default fetchAnimalById;
