import React from "react";
import { Link, useLocation } from "react-router-dom";
import { useNavigate } from "react-router-dom";

export default function Friends() {
    const navigate = useNavigate();
    const location = useLocation();

    console.log(location.state);

    return(
        <div>
            <h1 className="font-bold">Friends</h1>
            <Link to="/">People</Link>

            <div onClick={() => {
                navigate("/");
            }}
            >
                go to people</div>
        </div>
    )
}