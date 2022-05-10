package sjpark.porfolio.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectListController {
    
    @GetMapping("/project/list")
    public String projectList(){
        return "/project/projectList";
    }
}
