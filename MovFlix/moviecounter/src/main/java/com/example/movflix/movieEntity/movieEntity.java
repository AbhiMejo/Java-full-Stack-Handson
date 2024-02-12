package com.example.movflix.movieEntity;

import jakarta.persistence.Entity;

@Entity
public class movieEntity {
    
  
    private Long Movie_ID;

    private String Movie_Name;

    
    private Long Movie_Collection;
    
    
    
    public Long getMovie_ID() {
        return Movie_ID;
    }
    public void setMovie_ID(Long movie_ID) {
        Movie_ID = movie_ID;
    }
    public String getMovie_Name() {
        return Movie_Name;
    }
    public void setMovie_Name(String movie_Name) {
        Movie_Name = movie_Name;
    }
    public Long getMovie_Collection() {
        return Movie_Collection;
    }
    public movieEntity(Long movie_ID, String movie_Name, Long movie_Collection) {
        Movie_ID = movie_ID;
        Movie_Name = movie_Name;
        Movie_Collection = movie_Collection;
    }
    @Override
    public String toString() {
        return "movieEntity [Movie_ID=" + Movie_ID + ", Movie_Name=" + Movie_Name + ", Movie_Collection="
                + Movie_Collection + "]";
    }
    public movieEntity() {
    }
    public void setMovie_Collection(Long movie_Collection) {
        Movie_Collection = movie_Collection;
    }
    
}
