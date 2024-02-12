// import React, {useState} from 'react';

// function Myform(){
//     const [data,setData] = useState({
//         username:"",
//         password:''
//     })
//     const {username,password}=data;

//     const changeHandler = e => {
//         setData({...data,[e.target.name]:[e.target.value]});
//     }
//     const submitHandler=e=>{
//      e.preventDefault();
//      console.log(data)
//     }
//     return(
//         <div>
//         <form onSubmit={submitHandler}>
//             <input type="text" name="username" value={username} onChange={changeHandler}/>
//             <input type="password" name="password" value={password} onChange={changeHandler}/>
//             <input type="submit" />
//         </form>
//         </div>
//     );
// }
// export default Myform;
import './Myform.css';
import React,{ useState } from "react";
 
function Myform()
{
    const [data,setData]= useState({
        username:"",
        password:''
    })
 
    const {username,password} = data;
 
    const changeHandler = e => {
        setData({...data,[e.target.name]:[e.target.value]});
    }
    const submitHandler = e => {
        e.preventDefault();
        console.log(data)
    }
   
 
    return(
 
        <div className="body">
           
            <form onSubmit={submitHandler}>
                <input type="text" name="username" value={username} onChange={changeHandler}/><br/>
 
                <input type="password" name="password" value={password} onChange={changeHandler}/><br/>
                <input type="submit" name="submit" />
 
 
            </form>
 
 
        </div>
 
 
    );
 
}
 
export default Myform