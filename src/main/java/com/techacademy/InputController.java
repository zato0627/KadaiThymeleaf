package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

	@GetMapping("/input")
	public String getInput(@RequestParam(value = "previous", required = false) String previous, Model model) {
		if(previous != null) {
		model.addAttribute("previous", previous);
		}

		return "input";
	}

	@PostMapping("/output")
	public String postOutput(@RequestParam("val") String val, Model model) {



		model.addAttribute("val", val);

		return "output";
	}


}
