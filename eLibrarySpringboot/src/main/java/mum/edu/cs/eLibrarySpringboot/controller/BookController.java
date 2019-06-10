package mum.edu.cs.eLibrarySpringboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import mum.edu.cs.eLibrarySpringboot.model.Book;
import mum.edu.cs.eLibrarySpringboot.service.BookService;


@Controller
public class BookController {
	
	@Autowired
	BookService bookService;

	@GetMapping(value = {"/elibrary/books"})
	public ModelAndView addBook() {       
		List<Book> books = bookService.findAll();		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("books", books);
		modelAndView.setViewName("book/list");
		return modelAndView;		
    }
			
	@GetMapping(value="/elibrary/book")
	public String create(Model model){			
		model.addAttribute("book", new Book());
		return "book/add";
	}

	@PostMapping(value = {"/elibrary/book"})
	public String edit(@Valid @ModelAttribute("book") Book book, 
			BindingResult result, Model model)  {

		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			return "book/add";
		}
		book = bookService.save(book);
		return "redirect:/elibrary/books";
	}	
	

}
