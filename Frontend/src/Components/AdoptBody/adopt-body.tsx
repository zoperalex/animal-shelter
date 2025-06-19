import React, { useEffect, useState } from "react";
import "./adopt-body.css";
import AnimalCard from "../AnimalCard/animal-card";
import { fetchAnimalCards, fetchFilteredAnimals } from "../../API-Calls";

interface AnimalCardData {
	id: number;
	name: string;
	description: string;
	image: string; // base64 string
}

const AdoptBody = () => {
	const [animalCards, setAnimalCards] = useState<AnimalCardData[]>([]);
	const [loading, setLoading] = useState(true);
	const [error, setError] = useState<string | null>(null);

	// Filter state
	const [colorId, setColorId] = useState<number | undefined>();
	const [breedId, setBreedId] = useState<number | undefined>();
	const [speciedId, setSpeciedId] = useState<number | undefined>();
	const [disabilities, setDisabilities] = useState<boolean | undefined>();

	useEffect(() => {
		loadAllCards();
	}, []);

	const loadAllCards = async () => {
		try {
			setLoading(true);
			const data = await fetchAnimalCards();
			console.log("All animal cards response:", data);
			// Adjust this according to actual API shape
			const cards = Array.isArray(data) ? data : data.animalCards;
			setAnimalCards(cards || []);
			setError(null);
		} catch (err) {
			console.error(err);
			setError("Failed to load animals.");
			setAnimalCards([]);
		} finally {
			setLoading(false);
		}
	};

	const applyFilters = async () => {
		try {
			setLoading(true);
			const data = await fetchFilteredAnimals(
				colorId,
				breedId,
				speciedId,
				disabilities
			);
			console.log("Filtered animals response:", data);
			const cards = Array.isArray(data) ? data : data.animalCards;
			setAnimalCards(cards || []);
			setError(null);
		} catch (err) {
			console.error(err);
			setError("Failed to load filtered animals.");
			setAnimalCards([]);
		} finally {
			setLoading(false);
		}
	};

	return (
		<div className="adopt-body-container">
			<div className="filter-bar">
				<select
					onChange={(e) =>
						setColorId(
							e.target.value
								? parseInt(e.target.value)
								: undefined
						)
					}
				>
					<option value="">All Colors</option>
					<option value="1">Black</option>
					<option value="2">Brown</option>
					<option value="3">White</option>
				</select>

				<select
					onChange={(e) =>
						setBreedId(
							e.target.value
								? parseInt(e.target.value)
								: undefined
						)
					}
				>
					<option value="">All Breeds</option>
					<option value="1">Labrador</option>
					<option value="2">Beagle</option>
					<option value="3">Persian Cat</option>
				</select>

				<select
					onChange={(e) =>
						setSpeciedId(
							e.target.value
								? parseInt(e.target.value)
								: undefined
						)
					}
				>
					<option value="">All Species</option>
					<option value="1">Dog</option>
					<option value="2">Cat</option>
					<option value="3">Rabbit</option>
				</select>

				<label>
					<input
						type="checkbox"
						onChange={(e) =>
							setDisabilities(e.target.checked ? true : undefined)
						}
					/>
					Disabilities
				</label>

				<button onClick={applyFilters}>Apply Filters</button>
				<button onClick={loadAllCards}>Clear Filters</button>
			</div>

			<div className="adopt-body-content">
				{loading && <p>Loading animals...</p>}
				{error && <p>{error}</p>}
				<div className="animal-card-grid">
					{Array.isArray(animalCards) &&
						animalCards.map((animal) => (
							<AnimalCard
								key={animal.id}
								animal={{
									name: animal.name,
									description: animal.description,
									imageUrl: `data:image/jpeg;base64,${animal.image}`,
								}}
							/>
						))}
				</div>
			</div>
		</div>
	);
};

export default AdoptBody;
