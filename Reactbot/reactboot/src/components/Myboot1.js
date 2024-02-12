import React from "react";

function abc(){
    alert("This is an event");
}

function click(){
    return(
        <>
        <button onClick={abc}>Click Here</button>
        </>
    );
}
export default click;