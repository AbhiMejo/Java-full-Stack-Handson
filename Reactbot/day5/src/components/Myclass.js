import React from "react";

class my extends React.Component{
    constructor(props){
        super(props);
        this.state = {username: ''};
    }
    handlerChange=(event)=>{
        this.setState({username: event.target.value});
    }
    handlerSubmit=(event)=>{
        alert("Hello" +this.state.username);
    }
    render(){
        let header='';
        if(this.state.username){
            header= <h2>hello {this.state.username}</h2>
        }
        else{
            header= '';
        }
        return(
            <form onSubmit={this.handlerSubmit}>
                {header}
            Enter Username: {this.state.username}<input type="text" onChange={this.handlerChange}/><br/>
            Enter Password: <input type="password" /><br/>
            
            <input type="submit"/>
        </form>
        );
    }
}


export default my;