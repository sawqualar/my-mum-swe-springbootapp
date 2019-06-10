package mum.edu.cs.eLibrarySpringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping(value = {"/","/elibrary","/elibrary/home"})
    public String displayHomePage() {
        return "home/index";
    }
    @GetMapping(value="/elibrary/aboutus")
	public String aboutus(Model model){		
		
		return "home/aboutus";
	}
}
