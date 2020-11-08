package cn.codingjc.vhr2020.mapper;

import cn.codingjc.vhr2020.model.Hr;
import cn.codingjc.vhr2020.model.Role;

import java.util.List;

public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    Hr loadUserByUsername(String username);

    /**
     * 根据用户id查询角色
     * @param id
     * @return
     */
    List<Role> findRolesByHrId(Integer id);

    /**
     * 获取所有操作(除当前登陆用户)
     * @param id
     * @return
     */
    List<Hr> getAllHrs(Integer id);
}