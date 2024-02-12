package com.example.movflix.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movieRepo extends CrudRepository<Integer,Long>{
    
}
