package cn.codingjc.vhr2020.controller.emp;

import cn.codingjc.vhr2020.model.RespPageBean;
import cn.codingjc.vhr2020.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp/basic")
public class EmpBasicController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public RespPageBean getEmpployeeByPage(@RequestParam(defaultValue = "1") Integer page,
           @RequestParam(defaultValue = "10") Integer size) {
        return employeeService.getEmpployeeByPage(page, size);

    }
}
