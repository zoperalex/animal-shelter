import React, { useEffect, useRef, useState } from "react";
import "./info-card.css";

const InfoCard = ({
	infoImage,
	title,
}: {
	infoImage: string;
	title: string;
}) => {
	const containerRef = useRef<HTMLDivElement>(null);
	const textRef = useRef<HTMLParagraphElement>(null);
	const [fontSize, setFontSize] = useState(40); // Start at 40px like your CSS

	useEffect(() => {
		const resizeFont = () => {
			const container = containerRef.current;
			const textEl = textRef.current;
			if (!container || !textEl) return;

			let newFontSize = 40; // Reset starting size
			textEl.style.fontSize = `${newFontSize}px`;

			const containerWidth = container.offsetWidth - 20; // small padding margin
			const containerHeight = container.offsetHeight;

			while (
				(textEl.scrollWidth > containerWidth ||
					textEl.scrollHeight > containerHeight) &&
				newFontSize > 10
			) {
				newFontSize -= 1;
				textEl.style.fontSize = `${newFontSize}px`;
			}

			setFontSize(newFontSize);
		};

		resizeFont();

		const observer = new ResizeObserver(() => resizeFont());
		if (containerRef.current) {
			observer.observe(containerRef.current);
		}

		return () => observer.disconnect();
	}, [title]);

	return (
		<div className="info-card-container">
			<div className="info-title-container" ref={containerRef}>
				<p ref={textRef} style={{ fontSize: `${fontSize}px` }}>
					{title}
				</p>
			</div>
			<div className="info-title-image-container">
				<img src={infoImage} alt="" />
			</div>
		</div>
	);
};

export default InfoCard;
