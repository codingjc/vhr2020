package cn.codingjc.vhr2020.mapper;

import cn.codingjc.vhr2020.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> getEmpployeeByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("keyWord") String keyWord);

    long getTotal(String keyWord);

    Integer maxWorkId();
}