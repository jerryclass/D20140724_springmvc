package tw.edu.kuas.mis.m1101405110;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tw.edu.kuas.mis.m1101405110.entity.Member;

@Controller
public class SecondController {
	
	@RequestMapping("/say")
	public String sayHello(Model model)
	{
		Member member = new Member();
		
		member.setAccount("JerryWu");
		member.setPassword("123456789");
		member.setUserName("Jerry");
		
		model.addAttribute("kuas", member);
		
		return "helloWorld";
	}
	

}
