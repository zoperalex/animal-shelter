const fetchNews = async () => {
    const response = await fetch("localhost:5432/api/"); // Adjust the URL as needed
    if (!response.ok) {
        throw new Error("Network response was not ok");
    }
    return await response.json();
};

export default fetchNews;
