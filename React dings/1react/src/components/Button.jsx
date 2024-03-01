import React from "react";
import classes from './Button.module.css'

export default function Button({info}) {

    return(
        <>
        <p><button className={classes.button1}>{info}</button></p>
        </>
        
    )
}