package com.Employeesystem02.Employeesytem02.Controller;
import com.Employeesystem02.Employeesytem02.model.Employee;
import com.Employeesystem02.Employeesytem02.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("allemplist", employeeService.getAllEmployee());
        return "index";

    }
    @GetMapping("/add")
    public  String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new Employee";


    }
    @PostMapping("/save")
    public String  saveEmployee(@ModelAttribute("employee")Employee employee){
        employeeService.save(employee);
        return "redirect:/";
    }

    @GetMapping("updateForm/{id}")
    public  String updateForm(@PathVariable(value = "id")long id, Model model){
        Employee employee = employeeService.getById(id);
        model.addAttribute("employee", employee);
        return "update";
    }
    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable(value = "id")long id){
        employeeService.deleteById(id);
        return "redirect:/";

    }

}
