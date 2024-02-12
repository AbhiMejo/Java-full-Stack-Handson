import React from "react";
import './Wiprostyle.css';
function go(){

    alert("Weclome to React. JS");
}
function wipro(){
    return(
        <div className="first">
            <h1>Wipro Technologies</h1>
            <button onClick={go}>click </button>
        </div>
    );
}
export default wipro;