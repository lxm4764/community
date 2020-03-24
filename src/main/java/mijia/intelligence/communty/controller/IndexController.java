package mijia.intelligence.communty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiangming
 * @create 2020-03-22-20:36
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String hello(){ return "index"; }

}
