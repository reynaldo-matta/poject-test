package net.viralpatel.contact.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
 
    @RequestMapping("/helloDefault")
    public ModelAndView helloWorld() {
    	
        String message = "Hello World, Default Spring 3.0!";
        //primeiro a tela, segundo nome do parametro, terceiro o valor do parametro
        return new ModelAndView("message", "message", message);
    }
    
    @RequestMapping("/helloAlt")
    public String helloWorld2(Map<String, Object> mapa) {
    	mapa.put("message", "Hello World Alt, Spring 3.0!");
        return "message";
    }
    
}
