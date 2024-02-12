package com.reactfull.fullcriteria.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reactfull.fullcriteria.entity.RSEntity;

@Repository
public interface RSRepository extends CrudRepository<RSEntity,Long> {

	Optional<RSEntity> findByuname(String uname);
}
