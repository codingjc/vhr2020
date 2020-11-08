package cn.codingjc.vhr2020.controller.system.basic;

import cn.codingjc.vhr2020.model.Department;
import cn.codingjc.vhr2020.model.RespBean;
import cn.codingjc.vhr2020.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author coding_jc
 * @date 2020/10/19
 */
@RestController
@RequestMapping("/system/basic/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @PostMapping("/")
    public RespBean addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
        if (department.getResult() == 1) {
            return RespBean.ok("添加成功", department);
        }
        return RespBean.error("添加失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteDep(@PathVariable Integer id){
        Department department = new Department();
        department.setId(id);
        departmentService.deleteDepById(department);
        if (department.getResult() == -2) {
            return RespBean.error("当前部门包含子部门，删除失败");
        } else if(department.getResult() == -1){
            return RespBean.error("当前部门包含职员，删除失败");
        } else if (department.getResult() == 1) {
            return RespBean.ok("删除成功");
        } else {
            return RespBean.error("删除失败");
        }
    }
}
