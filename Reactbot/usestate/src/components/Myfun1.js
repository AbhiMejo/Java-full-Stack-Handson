import React, {useState} from 'react';

function Myfun1(){
    const[sport, setSport]=useState('');
    const[sport2, setSport2]=useState('');

    const changeHandler= e =>{
        setSport(e.target.value);
    }
    return(
    <div>
        <h1>My Favourite Sport is {sport}</h1>
        <input type='text' onChange={changeHandler}/>
    </div>
    );
}
export default Myfun1;