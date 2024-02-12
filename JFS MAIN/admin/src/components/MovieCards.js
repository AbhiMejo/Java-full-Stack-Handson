import axios from "axios";
import { useEffect, useState } from "react";
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import ListGroup from 'react-bootstrap/ListGroup';
import banaras1 from '../Assets/banaras1.jpeg';
import '../Css/TotalDisplay.css';
import Dropdown from 'react-bootstrap/Dropdown';
import DropdownButton from 'react-bootstrap/DropdownButton';
import { Link ,useParams} from 'react-router-dom';
import Col from 'react-bootstrap/Col';
import Row from 'react-bootstrap/Row';
import bengal from '../Assets/bengal.webp';
import CardGroup from 'react-bootstrap/CardGroup';
import chhattisgarh from '../Assets/chhattisgarh.jpeg';
function MovieCards(){
    const[Moviedata,setMoviedata]=useState([]);

    useEffect(()=>{
        getMovies();
    },[]);

    const getMovies=async(e)=>{
        const result=await axios.get("http://localhost:8085/get/movie");
        setMoviedata(result.data);
    }

    return(

        
        <div className="cards" style={{display: 'flex', marginTop:'2rem', marginBottom: '2rem', gap:'3rem'}}>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                {Moviedata.map((mov,index)=>(
                    <Row xs={2} md='4' className="g-4">
                    {Array.from({ length: 1 }).map((_, idx) => (
                      <Col key={idx}>
                    <Card style={{ width: '15rem' }}>
                    <Card.Img className="image" style={{height: '15rem'}} variant="top" src={"https://images.unsplash.com/photo-1485846234645-a62644f84728?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2918&q=80"} />
                <Card.Body>
                  <Card.Title>{mov.MovieName}</Card.Title>
                  {/* <Card.Text>
                    Some quick example text to build on the card title and make up the
                    bulk of the card's content.
                  </Card.Text> */}
                <ListGroup variant="flush">
                    <ListGroup.Item>Language: {mov.Language}</ListGroup.Item>
                    <ListGroup.Item>Duration: {mov.Duration} Hours</ListGroup.Item>
                </ListGroup>
                
                <div className="links" >

                <Link to={`UserShowView/${mov.MovieId}`}>ShowDetails</Link>
                </div>
                
                <Button variant="primary" href="/Login">Book</Button>
                </Card.Body>
                </Card>
                
                </Col>
                ))}
                </Row>
                ))
                }
                
              
                
      
        </div>
    );
}
export default MovieCards;
