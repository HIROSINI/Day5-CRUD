package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepo;

@Service
public class BookService 
{
	@Autowired
	BookRepo b;
	
	public Book add(Book bo)
	{
		return b.save(bo);
	}
	public List<Book> get()
	{
		return b.findAll();
	}
	public Optional<Book> get(int id)
	{
		return b.findById(id);
	}
	public Book update(Book k)
	{
		return b.saveAndFlush(k);
	}
	public String delete(int id)
	{
		b.deleteById(id);
		return "Deleted";
	}
}
