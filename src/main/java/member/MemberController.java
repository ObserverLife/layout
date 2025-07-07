package member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
@Controller
public class MemberController {

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("targetpage", "member/"+ "index");
		return "index";
	}
}
