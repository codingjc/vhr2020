package cn.codingjc.vhr2020.service;

import cn.codingjc.vhr2020.mapper.EmployeeMapper;
import cn.codingjc.vhr2020.model.Employee;
import cn.codingjc.vhr2020.model.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public RespPageBean getEmpployeeByPage(Integer page, Integer size, String keyWord) {
        if (page != null && size != null ) {
            page = (page -1) * size;
        }
        List<Employee> employeeList = employeeMapper.getEmpployeeByPage(page, size, keyWord);
        long total = employeeMapper.getTotal(keyWord);
        return new RespPageBean(total, employeeList);
    }

    public int addEmployee(Employee employee) {
        return employeeMapper.insertSelective(employee);
    }

    public Integer maxWorkId() {
        return employeeMapper.maxWorkId();
    }
}
