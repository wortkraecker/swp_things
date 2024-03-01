import React from "react";
import Button from "./Button";

export default function Buttonlist({myarray}) {

    return (
        <>
          {
            myarray.map((wert) => {
            return <Button info={wert}/>
            }    
          )}
        </>
      )
}