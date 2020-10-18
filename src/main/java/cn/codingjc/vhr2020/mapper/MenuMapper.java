package cn.codingjc.vhr2020.mapper;

import cn.codingjc.vhr2020.model.Menu;

import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenusByHrId(Integer hrId);

    List<Menu> getAllMenusWithRoles();

    List<Menu> getAllMenus();

    List<Integer> getMidByRid(Integer rid);
}