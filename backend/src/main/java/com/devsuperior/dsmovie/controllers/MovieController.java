package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/movies")
public class MovieController {


    @Autowired
    private MovieService movieService;

    @GetMapping
    public Page<MovieDTO> findALL(Pageable pageable){
        return movieService.findAll(pageable);
    }

    @GetMapping(value =  "/{id}")
    public MovieDTO findById(@PathVariable Long id){
        return movieService.findById(id);
    }



}
