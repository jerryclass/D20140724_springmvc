package tw.edu.kuas.mis.m1101405110;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FirstController {
    @RequestMapping("/User/{school}/{userName}")
    public String helloWorld(Model model,
    		@PathVariable("userName") String name,
    		@PathVariable("school") String school) 
    
    {
        model.addAttribute("userName", name);
        model.addAttribute("school",school);

        return "helloWorld";
    }
}
