import React from "react";

class xyz extends React.Component{

    abc(txt,txt1){
        alert(txt+ " "+ txt1);
    }
    render(){
        return(
            <>
            <button onClick={this.abc.bind(this,"Lol","Lol1")}>Click this</button>
            </>
        );
    }
}

export default xyz;