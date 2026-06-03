package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Book;
import com.nit.repo.BookRepo;

@Service
public class BookService {
	@Autowired
	BookRepo bookRepo;

	public List<Book> findBooks() {
		return bookRepo.findAll();
	}

	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	public Book getBookById(Integer id) {
		return bookRepo.findById(id).get();
	}

	public Book updateBook(Integer id, Book updatedBook) {
		Book existingBook = bookRepo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));

		existingBook.setTitle(updatedBook.getTitle());
		existingBook.setAuthor(updatedBook.getAuthor());
		existingBook.setPrice(updatedBook.getPrice());

		return bookRepo.save(existingBook);
	}

	public Book updateBookPrice(Integer id, Double price) {
		Book book = bookRepo.findById(id).orElseThrow(() -> new RuntimeException("Book id not found"));
		book.setPrice(price);
		return bookRepo.save(book);
	}
	
	public void deleteBook(Integer id) {
		System.out.println(id+" Book Deleted ");
		bookRepo.deleteById(id);
	}

}
