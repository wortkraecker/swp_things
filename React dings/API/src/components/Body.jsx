import React from "react";
import MovieList from "./MovieList";
import { useState } from "react";

export default function Body() {
    const [suche, setSuche] = useState("");

    function startSuche() {
        const wert = document.getElementById("searchInput").value;
        setSuche(wert);
    }
    return(
        <> 
          <div className="card-body" id="abId0.6100020862469945">
                <div className="form-group" id="abId0.7248381273064287" abineguid="83BD3623EFE243A288C79A69174B672B">
                    <input type="text" className="form-control" id="searchInput" name="searchInput" placeholder="Enter a search term"/>
                    <div id="pagination" className="mt-3">
                    <div id="resultsPerPageCounter" className="text-muted mt-2"></div>
                    </div>
                </div>
                <button type="button" className="btn btn-primary" onClick={startSuche}>Search</button>
            </div>
            <table className="table" id="movieresult">
                <thead>
                    <tr>
                        <td>Poster</td>
                    </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
            <MovieList suchText={suche}/>
        </>
    )
}