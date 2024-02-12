import React from "react";
import lion from './image_1302afc6.jpeg'
import './style.css';
function my(props){
    return (
       <> <div className="myapp">
        <h1>My name is {props.name} </h1>
       </div>
            
        <img src={lion}/>
        </>
        );
    

}

export default my;