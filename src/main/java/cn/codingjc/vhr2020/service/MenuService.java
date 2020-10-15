package cn.codingjc.vhr2020.service;

import cn.codingjc.vhr2020.mapper.MenuMapper;
import cn.codingjc.vhr2020.model.Hr;
import cn.codingjc.vhr2020.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author coding_jc
 * @date 2020/9/21
 */
@Service
public class MenuService {

    @Autowired
    MenuMapper menuMapper;

    /**
     * 根据当前登录的用户id查询菜单
     * @return
     */
    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(
                ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    /**
     * 查询所有的菜单所具备的角色
     * @return
     */
    public List<Menu> getAllMenusWithRoles() {
        return menuMapper.getAllMenusWithRoles();
    }

    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }
}
