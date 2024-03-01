import React from "react";
import { Link } from "react-router-dom";

export default function People() {
    return(
        <div>
            <h1 className="font-bold">People</h1>
            <Link to="/friends" state={{name: "Hans, age: 17"}}>Friends</Link>
        </div>
    )
}