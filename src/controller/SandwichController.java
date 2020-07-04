package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {
    @GetMapping("/saveChoice")
    public ModelAndView save(@RequestParam("condiment") String[] condiments) {
        StringBuilder saveCondiments = new StringBuilder();

        for (String condiment: condiments) {
            saveCondiments.append(condiment).append(", ");
        }

        ModelAndView modelAndView = new ModelAndView("order");
        modelAndView.addObject("saveCondiments", saveCondiments);
        return modelAndView;
    }
}
