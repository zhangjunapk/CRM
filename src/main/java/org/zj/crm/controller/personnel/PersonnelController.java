package org.zj.crm.controller.personnel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zj.crm.bean.personnel.Employee;
import org.zj.crm.service.personnel.IDepartmentService;
import org.zj.crm.service.personnel.IPersonService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/personnel")
public class PersonnelController {
    @Autowired
    HttpServletRequest request;

    @Autowired
    IPersonService personService;

    @Autowired
    IDepartmentService departmentService;

    @RequestMapping("/{type}/all")
    public String allPerson(@PathVariable("type") String type, ModelMap modelMap) {
        if ("department".equals(type)) {
            modelMap.addAttribute("department_list", departmentService.getAllDepartment());
            return "/admin/department_manager";
        }
        if ("".equals(type)) {
            modelMap.addAttribute("person_list");
            return "/admin/personnel_manager";

        }
        return "";
    }

    @RequestMapping(value = "/person/{id}",method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("id")int id){
        personService.deelteEmployee(id);
    }
    @RequestMapping(value = "/person/add",method = RequestMethod.POST)
    public String insertEmployee(@RequestBody Employee employee){
        personService.insertEmployee(employee);
        return "[{info:'seccess'}]";
    }
    @RequestMapping(value = "/person/{id}",method = RequestMethod.PUT)
    public void modifyEmployee(@PathVariable("id")int id,@RequestBody Employee employee){
        personService.modifyEmployee(employee);
    }
    @RequestMapping(value = "/person/{id}",method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable("id")int id){
        return personService.getEmployeeByID(id);
    }

}
