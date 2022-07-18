package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Degree;
import jana60.repository.DegRepository;

@Controller
@RequestMapping("/degrees")
public class DegController {

	@Autowired
	private DegRepository repo;
	
	@GetMapping
	public String degrees(Model model)
	{
		List<Degree> degList = (List<Degree>) repo.findAll();
		model.addAttribute("degList", degList);
		return "degrees";
	}
}
