package com.abnamro.springboot.library.mapper;

import org.springframework.stereotype.Component;

import com.abnamro.springboot.library.entities.BookEntity;
import com.abnamro.springboot.library.resourceModel.BookInputModel;

@Component
public class BookMapper {
	
	public BookEntity resourceToEntityMapper(BookInputModel bim) {
		BookEntity b1 = new BookEntity();
		b1.setBookTitle(bim.getBookTitle());
		b1.setPublishYear(bim.getPublishYear());
		return b1;
		
	}

}
