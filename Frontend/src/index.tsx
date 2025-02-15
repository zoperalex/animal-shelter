import ReactDOM from "react-dom/client";
import React from "react";
import { About, Adopt, Home } from "./Pages";
import { createBrowserRouter, Link, RouterProvider } from "react-router-dom";

const router = createBrowserRouter([
    {
        path: "/",
        element: <Home />,
        errorElement: (
            <div style={{ color: "white", fontSize: "60px" }}>
                <div>404 Not Found</div>
                <Link style={{ color: "white" }} to="/">
                    Go Back
                </Link>
            </div>
        ),
    },
    {
        path: "/about",
        element: <About />,
    },
    {
        path: "/adopt",
        element: <Adopt />,
    },
]);

ReactDOM.createRoot(document.getElementById("root")!).render(
    <React.StrictMode>
        <RouterProvider router={router} />
    </React.StrictMode>
);
