package springAppi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomePageController {
	@RequestMapping ("/")
	public String sveikiAtvyke (Model model) {
		
		model.addAttribute("pasisveikinimas", "Sveiki atvyke į geriausią duomenų bazę" );
		model.addAttribute("sloganas", "Visi pasulio klientai");
		model.addAttribute("drasiau", "Čia tik geriausieji klientai");
		
		return "ManoHome";
		
		
	}
	
	
	

}
