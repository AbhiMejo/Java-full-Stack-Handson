import React from "react";
class Myclass extends React.Component{
    xyz=(txt)=>{
        alert(txt);
    }
    render(){
        return(
            <>
            <button onClick={this.xyz.bind(this,"Hi Everybody")}>Click Me</button>
            </>
        );
    }

}
export default Myclass;