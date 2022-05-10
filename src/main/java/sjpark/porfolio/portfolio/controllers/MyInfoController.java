package sjpark.porfolio.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//sourvetree test

@Controller
@RequestMapping("/myinfo")
public class MyInfoController {

    @GetMapping
    public String myInfo() {
        return "/myinfo/myInfo";
    }
    
}
