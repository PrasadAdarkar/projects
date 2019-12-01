package com.abnamro.springboot.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abnamro.springboot.library.DAO.LibraryApplicationDAO;
import com.abnamro.springboot.library.resourceModel.AuthorModel;
import com.abnamro.springboot.library.resourceModel.BookInputModel;
import com.abnamro.springboot.library.resourceModel.BookModel;
import com.abnamro.springboot.library.resourceModel.StudentModel;



@RestController
public class RestControllerNew {

	@Autowired
	LibraryApplicationDAO lad;

	@GetMapping(value = "/Student/{id}")
	public ResponseEntity<StudentModel> getStudent() {
		return null;

	}

	@GetMapping(value = "/Author/{id}")
	public ResponseEntity<AuthorModel> getAuthor() {
		return null;

	}

	@GetMapping(value = "/Book/{id}")
	public ResponseEntity<BookModel> getBook() {
		return null;

	}

	@PostMapping(value = "/Student")
	public ResponseEntity<String> addStudent() {
		return null;

	}

	@PostMapping(value = "/Author")
	public ResponseEntity<String> addAuthor() {
		return null;

	}

	@PostMapping(value = "/book")
	public ResponseEntity<String> addBook(@RequestBody BookInputModel bim) {
		//lad.addBookEntry(bim);
		return new ResponseEntity<>("book added sucessfully", HttpStatus.OK);

	}
}
