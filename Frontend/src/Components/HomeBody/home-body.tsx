import React, { useEffect } from "react";
import "./home-body.css";
import { InfoCard } from "../HomeBody";
import { fetchNews } from "../../API-Calls";

const HomeBody = () => {
	const [newsObj, setNewsObj] = React.useState({
		title: "...",
		description: "...",
		image: "",
	});

	useEffect(() => {
		let imageUrl = "";

		const fetchData = async () => {
			console.log("Fetching news... from API");
			const cachedNews = localStorage.getItem("news");
			if (cachedNews) {
				console.log("cached news found");
				setNewsObj(JSON.parse(cachedNews));
				return;
			} else {
				try {
					const data = await fetchNews();
					imageUrl = "data:image/jpeg;base64," + data.image;
					setNewsObj({ ...data, image: imageUrl });
				} catch (error) {
					console.error("Error fetching news:", error);
				}
			}
		};

		fetchData();

		return () => {
			if (imageUrl) {
				URL.revokeObjectURL(imageUrl); // Release memory
			}
		};
	}, []);

	return (
		<div className="home-body">
			<div className="top-image-container">
				<img
					src="/images/NavBar-white.svg"
					className="top-image"
					alt=""
				/>
			</div>
			<div className="home-body-info">
				<div className="home-body-info-description">
					<h1 className="title">What's new...</h1>
					<p className="body">{newsObj.description}</p>
				</div>
				<div className="home-body-info-card-container">
					<InfoCard title={newsObj.title} infoImage={newsObj.image} />
				</div>
			</div>
		</div>
	);
};

export default HomeBody;
