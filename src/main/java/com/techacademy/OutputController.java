package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

	@GetMapping("/output")
	public String postOutput(@RequestParam(value = "previous", required = false) String previous, Model model) {
		if(previous != null) {
		model.addAttribute("previous", previous);
		}

		return "output";
	}

}
