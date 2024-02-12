package com.example.movflix.movieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movflix.repository.movieRepo;

@Service
public class movieService {
    
    
    @Autowired
    public movieRepo MovieRepo;
}
