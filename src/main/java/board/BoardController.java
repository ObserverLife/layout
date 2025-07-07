package board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/board")
@Controller
public class BoardController {

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("targetpage", "board/"+ "index");
		return "index";
	}
}
