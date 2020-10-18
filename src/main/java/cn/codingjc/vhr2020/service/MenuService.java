package cn.codingjc.vhr2020.service;

import cn.codingjc.vhr2020.mapper.MenuMapper;
import cn.codingjc.vhr2020.mapper.MenuRoleMapper;
import cn.codingjc.vhr2020.model.Hr;
import cn.codingjc.vhr2020.model.Menu;
import cn.codingjc.vhr2020.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author coding_jc
 * @date 2020/9/21
 */
@Service
public class MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Autowired
    MenuRoleMapper menuRoleMapper;

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

    /**
     * 根据rid查询mid
     * @param rid
     * @return
     */
    public List<Integer> getMidByRid(Integer rid) {
        return menuMapper.getMidByRid(rid);
    }

    /**
     * 更新菜单-角色表
     * @param rid
     * @param mids
     * @return
     */
    @Transactional
    public boolean updateMenuRole(Integer rid, Integer[] mids) {
        //先根据rid删除
        menuRoleMapper.deleteByRid(rid);

        //进行插入
        if(mids != null){
            Integer result = menuRoleMapper.insertRecord(rid, mids);
            return result == mids.length;
        } else {
            return true;
        }

    }
}
