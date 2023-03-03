package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Service.BookService;

@RestController
public class ApiController 
{
	@Autowired
	BookService s;
	
	@PostMapping("/post")
	public Book addDetails(@RequestBody Book b1)
	{
		return s.add(b1);
	}
	@GetMapping("/get")
	public List<Book> getDetails()
	{
		return s.get();
	}
	@GetMapping("/get/{id}")
	public Optional<Book> getDetails(@PathVariable int id)
	{
		return s.get(id);
	}
	@PutMapping("/put")
	public Book updateDetails(Book b2)
	{
		return s.update(b2);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		s.delete(id);
		return "Deleted";
	}
}
