package com.abnamro.springboot.library.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abnamro.springboot.library.mapper.BookMapper;
import com.abnamro.springboot.library.repositories.RepositoryNew;
import com.abnamro.springboot.library.resourceModel.BookInputModel;

@Component
public class LibraryApplicationDAO {
//
	@Autowired
	RepositoryNew rnew;

	@Autowired
	BookMapper bm;

	public void addBookEntry(BookInputModel b11) {

		rnew.save(bm.resourceToEntityMapper(b11));

	}

}
