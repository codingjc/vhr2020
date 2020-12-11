package cn.codingjc.vhr2020.controller.emp;

import cn.codingjc.vhr2020.model.Employee;
import cn.codingjc.vhr2020.model.RespBean;
import cn.codingjc.vhr2020.model.RespPageBean;
import cn.codingjc.vhr2020.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp/basic")
public class EmpBasicController {

    @Autowired
    EmployeeService employeeService;

    /**
     * 分页获取员工数据(模糊搜索)
     * @param page
     * @param size
     * @param keyWord
     * @return
     */
    @GetMapping("/")
    public RespPageBean getEmployeeByPage(@RequestParam(defaultValue = "1") Integer page,
           @RequestParam(defaultValue = "10") Integer size, String keyWord) {
        return employeeService.getEmpployeeByPage(page, size, keyWord);

    }

    @PostMapping("/")
    public RespBean addEmployee(@RequestBody Employee employee){
        if (employeeService.addEmployee(employee) == 1) {
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }

}
