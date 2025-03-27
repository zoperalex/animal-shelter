const fetchNews = async () => {
    const response = await fetch('/api/pups'); // Adjust the URL as needed
    if (!response.ok) {
        throw new Error('Network response was not ok');
    }
    return await response.json();
};

export default fetchNews;