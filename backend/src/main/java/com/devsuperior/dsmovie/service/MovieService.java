package com.devsuperior.dsmovie.service;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true) // nao entendi muito bem a ideia do transactional mas
    public Page<MovieDTO> findAll(Pageable pageable){
       Page<Movie> result= movieRepository.findAll(pageable);// é feita uma busca dos filmes pela entidade Movie e passado o parametro de paginação pageable
        Page<MovieDTO> page = result.map( x -> new MovieDTO(x));// é transformado o Movie em MovieDTO atraves do map;
        return page;
    }

    @Transactional(readOnly = true) // nao entendi muito bem a ideia do transactional mas
    public MovieDTO findById(Long id){
        Movie result= movieRepository.findById(id).get();// o findById retorna um objeto OPTIONAL , pra funcionar é so usar o .get
        MovieDTO movie = new MovieDTO(result);
        return movie;
    }

}
