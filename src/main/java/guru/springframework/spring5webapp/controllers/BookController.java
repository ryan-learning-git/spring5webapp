package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepository bookRepository;

    //on instantiation spring will fill in the book repo.
    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        //@Controller makes Spring create this object - Model as param makes the front-controller pass along a Model
        model.addAttribute("books", bookRepository.findAll());
        return "books"; //thymeleaf view name
    }

}
