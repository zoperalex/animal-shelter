const fetchNews = async () => {
	console.log("Fetching news...");
	const response = await fetch("https://localhost:8443/animal/newsletter"); // Adjust the URL as needed
	if (!response.ok) {
		throw new Error("Network response was not ok");
	}
	return await response.json();
};

export default fetchNews;
