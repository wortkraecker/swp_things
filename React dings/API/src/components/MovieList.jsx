import React from "react";
import MovieItem from "./MovieItem";
import { useState, useEffect } from "react";

export default function MovieList({suchText}) {
    const [data, setData] = useState([]);
    const [page, setPage] = useState(1);

    useEffect(() => {
        const urllink = `http://www.omdbapi.com/?s=${suchText}&apikey=7330c24f&page=${page}`;
        const url = new URL(urllink);
        console.log(url)
        fetch(url)
            .then(response => {
                if (response.ok) {
                    return response.json();
                }
                throw response;
            })
            .then(data => {
                //console.log(data);
                if (data.Response == "True") {
                    setData(data.Search);
                } else {
                    setData([]);           
                }
            })
            .catch(error => {
                console.error("Error fetching data ", error);
            })
    }, [suchText, page]);


    return(
        <>
            <div className="movieList">  
            {data.map((movie,index)=>  
            <MovieItem image={movie.Poster} title={movie.title} year={movie.year}/>
            )}
             </div>
        </>
    )
}