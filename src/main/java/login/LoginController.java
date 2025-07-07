package login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
public class LoginController {

	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("targetpage", "login/"+ "index");
		return "index";
	}
}
