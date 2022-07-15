package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Department;
import jana60.repository.DeptRepository;

@Controller
@RequestMapping("/")
public class DeptController {

	@Autowired
	private DeptRepository repo;
	
	@GetMapping
	public String index (Model model)
	{
		return "index";
	}
	
	@GetMapping("/department")
	public String department(Model model)
	{
		List<Department> deptList = (List<Department>) repo.findAll();
		model.addAttribute("deptList", deptList);
		return "department";
	}
}
