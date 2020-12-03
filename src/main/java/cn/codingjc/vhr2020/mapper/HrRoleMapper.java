package cn.codingjc.vhr2020.mapper;

import cn.codingjc.vhr2020.model.HrRole;
import org.apache.ibatis.annotations.Param;

public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);

    void deleteByHrId(Integer hrId);

    Integer addRole(@Param("hrId") Integer hrId, @Param("rids") Integer[] rids);
}