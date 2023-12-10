package org.example.Controllers;
// Model - библиотека для передачи параметров в html шаблон

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        String title = "База данных сотрудников";
        // передает параметр title в html страницу
        model.addAttribute("title", title);
        return "home";
    }
}