import React from "react";
import Hoc from './Hoc';

const App = (props) =>{
  return(
    <h1>Welcome...{props.name}</h1>
  )
}
export default Hoc(App);