package nl.marbink.springboot5webapp.controller;

import nl.marbink.springboot5webapp.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//TODO Spring Stereotypes: @Component, @Controller, @Service, @Repository, @RestController
@Controller
public class AuthorController {

    //TODO ???? hoe wordt een interface geautowired door Spring????
    @Autowired
    AuthorRepository authorRepository;

    //TODO geen verschil tussen String of ModelAndView
    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }

    @RequestMapping("/authors2")
    public ModelAndView getAuthors2(ModelAndView mav) {
        mav.setViewName("authors");
        mav.addObject("authors", authorRepository.findAll());
        return mav;
    }
}
