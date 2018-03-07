package ifrn.edu.br.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author JoaoC
 */
@Controller
public class HomeController {

    @GetMapping("home")
    public String home() {
        return "home";
    }
}
