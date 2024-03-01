import React from "react";

export default function MovieItem({image, title, year}) {
    return(
        <>
        <div className="movieItem">
            <img src={image }/>
            <h3>{title}</h3>
            <p>{year}</p> 
        </div>
        </>
    )
}