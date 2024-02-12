//import React from "react";
import React ,{useState} from "react";

function Myfun(){
    const[crickter, setCricket] = useState("Virat Kohli")
    return(
        <div>
            <h1>My favourite Crickter is{crickter}</h1>
            <button onClick={()=> setCricket("Ben Strokes")}>submit</button>
        </div>
        
       
    );
}
export default Myfun;