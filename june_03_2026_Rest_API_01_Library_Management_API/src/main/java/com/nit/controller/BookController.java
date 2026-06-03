package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Book;
import com.nit.service.BookService;
/* `POST /books/add` → Add a new book
* `GET /books` → Fetch all books
* `GET /books/{id}` → Fetch book by ID
* `PUT /books/update/{id}` → Update complete book details
* `PATCH /books/price/{id}` → Update only book price
* `DELETE /books/delete/{id}` → Delete book*/

@RestController
@RequestMapping
public class BookController {
	@Autowired
	BookService bookService;

	@PostMapping("/add")
	public String addBook(@RequestBody Book book) {
		bookService.addBook(book);
		return "Book Added";
	}

	@GetMapping("/book")
	public List<Book> fetchBooks() {
		return bookService.findBooks();
	}

	@GetMapping("/book/{id}")
	public Book fetchBookById(@PathVariable Integer id) {
		return bookService.getBookById(id);
	}

	@PutMapping("/book/update/{id}")
	public Book updateBook(@PathVariable Integer id, @RequestBody Book book) {
		return bookService.updateBook(id, book);
	}

	@PatchMapping("/book/price/{id}")
	public Book updateBookPrice(@PathVariable Integer id, @RequestParam Double price) {
		return bookService.updateBookPrice(id, price);
	}

	@DeleteMapping("/book/delete/{id}")
	public void deleteBookById(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}

}
