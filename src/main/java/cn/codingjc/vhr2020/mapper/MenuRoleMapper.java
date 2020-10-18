package cn.codingjc.vhr2020.mapper;

import cn.codingjc.vhr2020.model.MenuRole;
import org.apache.ibatis.annotations.Param;

public interface MenuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRole record);

    int insertSelective(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuRole record);

    int updateByPrimaryKey(MenuRole record);

    int deleteByRid(@Param("rid") Integer rid);

    int insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}