package cn.codingjc.vhr2020.service;

import cn.codingjc.vhr2020.mapper.DepartmentMapper;
import cn.codingjc.vhr2020.model.Department;
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

    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartmentsByParentId(-1);
    }
}
