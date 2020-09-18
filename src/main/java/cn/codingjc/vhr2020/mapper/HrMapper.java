package cn.codingjc.vhr2020.mapper;

import cn.codingjc.vhr2020.model.Hr;

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
}