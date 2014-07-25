package tw.edu.kuas.mis.m1101405110;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/first/{uid}")
public class FirstController {
    
	@RequestMapping("/test01")
	public String test01(Model model,@RequestParam("userName") String name)
	{
		model.addAttribute("name", name);
		return "test1";
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/User/{school}/{userName}",method=RequestMethod.POST)
    public String helloWorld(Model model,
    		@PathVariable("userName") String name,
    		@PathVariable("school") String school,
    		@PathVariable("uid") String uid) 
    
    {
        model.addAttribute("userName", name);
        model.addAttribute("school",uid);

        return "helloWorld";
    }
	
	@RequestMapping(value="/sayHello" , method = RequestMethod.POST )
	public String sayHello(Model model)
	{
		return "helloWorld";
	}
	
	
	
}
