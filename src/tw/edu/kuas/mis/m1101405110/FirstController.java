package tw.edu.kuas.mis.m1101405110;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/first/{uid}")
public class FirstController {
    
	@RequestMapping(value="/test01",method=RequestMethod.POST)
	@ResponseBody
	public String test01(Model model,
			@RequestParam(value="userName"  , required=false , defaultValue="no user name") String name , 
			@RequestBody String temp
			)
	{
	
		return temp;
		
		
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
