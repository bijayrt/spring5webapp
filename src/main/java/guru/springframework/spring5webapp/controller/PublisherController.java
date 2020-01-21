package guru.springframework.spring5webapp.controller;
/* BTuladhar created on 1/20/2020 */

import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {
    private PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @RequestMapping("/publishers")
    public String getBooks(Model model) {
        model.addAttribute("publishers", publisherRepository.findAll());
        return "publishers";
    }
}
