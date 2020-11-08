package cn.codingjc.vhr2020.service;

import cn.codingjc.vhr2020.mapper.DepartmentMapper;
import cn.codingjc.vhr2020.model.Department;
import cn.codingjc.vhr2020.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author coding_jc
 * @date 2020/10/19
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    /**
     * 获取所有部门
     * @return
     */
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartmentsByParentId(-1);
    }

    /**
     * 创建部门
     * @param department
     * @return
     */
    public void addDepartment(Department department) {
        department.setEnabled(true);
        departmentMapper.addDep(department);
    }

    /**
     * 删除部门
     * @param department
     */
    public void deleteDepById(Department department) {
        departmentMapper.deleteDepById(department);
    }
}
