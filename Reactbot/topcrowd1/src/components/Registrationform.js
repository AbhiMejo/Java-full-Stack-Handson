import { useState } from "react";
import axios from "axios";
import './Style.css';

function Registrationform(){
    //const data= {fname: "", lname: "", cname: "",sname:"", phone:""}
    //const [id, setid]=useState("");
    const [fname, setfname]=useState("");
    const [lname, setlname]=useState("");
    const [cname, setcname]=useState("");
    const [sname, setsname]=useState("");
    const [phone, setphone]=useState("");
    const [error, setError]=useState(false);
    // const handleChange=(e)=>{
    //     ;
    //     setfname(e.target.value.firstname);
    //     setlname(e.target.value.lastname);
    //     setcname(e.target.value.cityname);
    //     setsname(e.target.value.statename);
    //     setphone(e.target.value.phone);
    // }
    async function handleSubmit(e){
        e.preventDefault();
        
        try{
            if(fname==="" || lname==="" || cname==="" || sname==="" || phone.length<=9){
                setError(true);
            }
            else{
           await axios.post("http://localhost:8084/save",
           {
            name : fname,
            surname : lname,
            city : cname,
            state : sname,
            phone : phone

           });
           alert("User registration successful")
           setfname("");
           setlname("");
           setcname("");
           setsname("");
           setphone("");
        }}catch(err){
            alert("User Registration failed")
        }
    }
    return(
        <div className="main-form">
            <form  className="reg-Form" onSubmit={handleSubmit}>
                <h1>Registration Form</h1>
                {/* <input type="text" name="id"  onChange={(e )=> {setid(e.target.value)}}/><br/> */}
                <input type="text" name="firstname"  placeholder=" Enter Your First Name"onChange={(e )=> {setfname(e.target.value)}}/><br/>
                    <label>{error&&fname===""?"Fill the First name":""}<br/></label>          
                <input type="text" name="lastname" placeholder=" Enter Your Second Name" onChange={(e )=> {setlname(e.target.value)}}/><br/>
                    <label>{error&&lname===""?"Fill the Last name":""}<br/></label>        
                <input type="text" name="cityname" placeholder=" Enter Your City Name" onChange={(e)=> {setcname(e.target.value)}}/><br/>
                    <label>{error&&cname===""?"Enter valid city name":""}<br/></label>
                <input type="text" name="statename" placeholder=" Enter Your State Name"onChange={(e )=> {setsname(e.target.value)}}/><br/>
                    <label>{error&&sname===""?"Enter valid State name":""}<br/></label>
                <input type="text" name="phone" placeholder=" Enter Your Phone Number"onChange={(e )=> {setphone(e.target.value)}}/><br/>
                    <label>{error&&phone.length<=9?"Please Enter 10 Digits":""}<br/>   </label>           
                <button type="submit">Submit</button>
            </form>
        </div>
    );
}
export default Registrationform;