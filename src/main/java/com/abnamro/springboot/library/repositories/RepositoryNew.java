package com.abnamro.springboot.library.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abnamro.springboot.library.entities.BookEntity;

@Repository
public interface RepositoryNew extends CrudRepository<BookEntity, Long>{

}
