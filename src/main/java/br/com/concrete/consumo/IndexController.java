package br.com.concrete.consumo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by assis on 13/03/17.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(@RequestParam(defaultValue = "World", name = "name") String name, Model model) {
        model.addAttribute("name", name);

        return "index";
    }
}
