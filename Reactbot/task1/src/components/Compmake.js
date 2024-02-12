import React from "react";

function first(){
    alert("Clicked On Tiger")
}
function second(){
    alert("Clicked on Lion");
}
function comp(){
    return(
        <div>
            <button onClick={first}>button1</button>
            <button onClick={second}>button1</button>
        </div>
    );
}
export default comp;