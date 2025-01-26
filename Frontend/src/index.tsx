import ReactDOM from "react-dom/client";
import { Navbar } from "./Components";
import React from "react";

function App() {
    return <Navbar />;
}

const container = document.getElementById("root")!;
const root = ReactDOM.createRoot(container);
root.render(<App />);
