package com.abnamro.springboot.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abnamro.springboot.library.entities.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>{
	
}