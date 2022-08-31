import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom'
import './Resume.css';
const Resume=()=>{

    const[details,setDetails]=useState([]);
    const[skills,setSkills]=useState([]);
    const[languages,setLanguages]=useState([]);
    const[interests,setInterests]=useState([]);
    const[educationDetails,setEducationDetails]=useState([]);
    const[projects,setProjects]=useState([]);
    const navigate = useNavigate();
    useEffect(()=>{
        fetch("http://localhost:8080/userDetails").then((res)=>res.json())
        .then(result=>{
            setDetails(result);
        })
    },[])
    useEffect(()=>{
        fetch("http://localhost:8080/skills").then((res)=>res.json())
        .then(result=>{
            setSkills(result);
        })
    },[])
    useEffect(()=>{
        fetch("http://localhost:8080/languages").then((res)=>res.json())
        .then(result=>{
            setLanguages(result);
        })
    },[])
    useEffect(()=>{
        fetch("http://localhost:8080/interests").then((res)=>res.json())
        .then(result=>{
            setInterests(result);
        })
    },[])
    useEffect(()=>{
        fetch("http://localhost:8080/education").then((res)=>res.json())
        .then(result=>{
            setEducationDetails(result);
        })
    },[])
    useEffect(()=>{
        fetch("http://localhost:8080/projects").then((res)=>res.json())
        .then(result=>{
            setProjects(result);
        })
    },[])
    const handleClick=()=>{
        navigate("/editContact");
    }
    return(
        <div className='t'>
            
       <div className='full'>
           <div className='left'>
               <div className='image'>
                   <img src="https://media.istockphoto.com/vectors/illustration-of-a-young-woman-in-a-suit-id-photo-size-vector-id1268988213?k=20&m=1268988213&s=612x612&w=0&h=WXWlpHsAy0xGTtRLK1URODTJZZZq5adVnk7dgfMF_mY=" id="img"></img>
               </div>
               <div className='contact'>
                   <h2>CONTACT</h2><button onClick={handleClick}>Edit Contact</button>
                   <p><b>{details.email}</b></p>
                   <p><b>{details.mobile}</b></p>
                   <p><b>{details.address}</b></p>
               </div>
               <div className='skills'>
                   <h2>SKILLS</h2>
                   <ul>
                      {skills.map(skill=>(
                          <li>{skill.skill}</li>
                      ))}
                   </ul>
               </div>
               <div className='language'>
                   <h2>LANGUAGES</h2>
                   <ul>
                       {languages.map(lang=>(
                           <li>{lang.language}</li>
                       ))}
                   </ul>
               </div>
               <div className='interest'>
                   <h2>INTERESTS</h2>
                   <ul>
                       {interests.map(interests=>(
                           <li>{interests.interest}</li>
                       ))}
                   </ul>
               </div>
           </div>
           <div className='right'>
               <div className='name'>
                   <h1>{details.username} Chittapuram</h1>
               </div>
               <div className='title'>
                   <p><b>Aspiring Software Developer</b></p>
               </div>
               <div className='summary'>
                   <p>A creative individual who is passionate to learn new things and utilize my skills to inflate
my expertise.</p>
               </div><hr></hr>
               <div className='education'>
                   <h2>EDUCATION</h2>
                   
                    <table className='table'>
                       <thead>
                       <tr>
                           <th>University/College</th>
                           <th>Degree</th>
                           <th>Course</th>
                           {/* <th>Starting year</th>
                           <th>Ending year</th> */}
                           <th>Percentage</th>
                       </tr>
                       </thead>
                       <tbody>
                           
                               {educationDetails.map(education=>(
                                 <tr>  
                                   <td>{education.institute_university_name}</td>
                                   <td>{education.certificate_degree_name}</td>
                                   <td>{education.course}</td> 
                                   {/* <td>{education.starting_date}</td>
                                   <td>{education.ending_date}</td> */}
                                  <td>{education.percentage}</td>
                                  </tr> 
                               ))}
                           
                       </tbody>
                   </table> 
               </div>
               <div className='workshops'>
                   <h2>WORKSHOPS</h2>
                   <p>Data Science and Machine Learning</p>
               </div>
               <div className='certificates'>
                   <h2>CERTIFICATES</h2>
                   <ul>
                       <li>A certificate for participating in data science and machine learning by JNTUH and Data Jango</li>
                       <li>A certificate for completing a SQL Course on solo-learn</li>
                   </ul>
               </div>
               <div className='project'>
                   <h2>PROJECTS</h2>
                   <ul>
                       {projects.map(project=>(
                           <>
                           <b>Project:</b> {project.projectname}
                           <li>{project.projectdescription}</li>
                           </>
                       ))}
                   </ul>
               </div>
           </div>
       </div>
       </div>
    )
}
export default Resume;