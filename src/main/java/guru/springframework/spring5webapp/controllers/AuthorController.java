package guru.springframework.spring5webapp.controllers;


import guru.springframework.spring5webapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

   private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")//Create method to handle request for authors at “/authors”
    public String getAuthors(Model model){
        model.addAttribute("authors", authorService.findAll());
        return "authors/list";//Add list of authors to model, and return view “authors/list”
    }

}
