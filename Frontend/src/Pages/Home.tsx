import React from "react";
import { Carousel, Navbar } from "../Components";

const Home = () => {
    return (
        <div>
            <Navbar />
            <div style={{ top: "10vh" }}>
                <Carousel />
            </div>
        </div>
    );
};

export default Home;
