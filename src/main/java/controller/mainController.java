package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
@RequestMapping("/main")
	public String main1(){
		return "WEB-INF/main.jsp";
	}
}
