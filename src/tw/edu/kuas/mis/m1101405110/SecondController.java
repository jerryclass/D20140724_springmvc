package tw.edu.kuas.mis.m1101405110;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	
	@RequestMapping("/say")
	public String sayHello(Model model)
	{
		return "helloWorld";
	}
}
