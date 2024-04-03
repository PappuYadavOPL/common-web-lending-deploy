package admin.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ForwardController {

	@RequestMapping(value = "/**/{[path:[^\\.]*}")
	public ModelAndView forward() {
		return new ModelAndView("/index.html");
	}
}