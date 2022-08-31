import React, { useEffect, useState } from "react";
import { Navigate, useNavigate } from "react-router-dom";
import Service from "./Service";

const EditContact=()=>{

    const[email,setEmail]=useState('');
    const[mobile,setMobile]=useState('');
    const[address,setAddress]=useState('');
    const navigate=useNavigate();
    useEffect(()=>{
        Service.getDetails()
        .then(result=>{
            setEmail(result.data.email);
            setMobile(result.data.mobile);
            setAddress(result.data.address);
        }).catch(error=>{
            console.log(error);
        })
    },[])

    const handleClick=(e)=>{
        e.preventDefault();
        const user={email,mobile,address};
        Service.editDetails(user).then(result=>{
            navigate("/");
        }).catch(error=>{
            console.log(error);
        })
       
    }
    return(
        <form>
            <label for="email">Email</label><br></br>
            <input type="email" value={email} onChange={(e)=>setEmail(e.target.value)}></input><br></br>
            <label for="mobile">Mobile</label><br></br>
            <input type="phoneNumber" value={mobile} onChange={(e)=>setMobile(e.target.value)}></input><br></br>
            <label for="address">Address</label><br></br>
            <input type="text" value={address} onChange={(e)=>setAddress(e.target.value)}></input><br></br>
            <button onClick={handleClick}>Update</button>
            
        </form>
    )
}
export default EditContact;