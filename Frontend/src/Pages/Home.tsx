import React from "react";
import { Carousel, HomeBody, Navbar, Footer } from "../Components";

const Home = () => {
    return (
        <div>
            <Navbar />
            <Carousel />
            <HomeBody />
            <Footer />
        </div>
    );
};

export default Home;
