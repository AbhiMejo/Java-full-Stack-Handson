package com.example.movflix.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.movflix.movieService.movieService;

@RestController
public class adminController {
    
    @Autowired
    public movieService MovieService;
}
