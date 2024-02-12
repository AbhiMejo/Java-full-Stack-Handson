import React from "react";

class Myclass2 extends React.Component{
    constructor(props){
        super(props);
        this.state={
            Myplace:'Kolkata'
        };
    }
    render(){
        return(
            <form>
                <select value={this.state.Myplace}>
                <option value="Banglore">Banglore</option>
                <option value="Pune">Pune</option>
                <option value="Kolkata">Kolkata</option>
                </select>
            </form>
        );
    }
}
export default Myclass2;
