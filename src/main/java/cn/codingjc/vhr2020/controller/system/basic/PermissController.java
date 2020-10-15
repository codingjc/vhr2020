package cn.codingjc.vhr2020.controller.system.basic;

import cn.codingjc.vhr2020.model.Menu;
import cn.codingjc.vhr2020.model.Role;
import cn.codingjc.vhr2020.service.MenuService;
import cn.codingjc.vhr2020.service.PermissService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author coding_jc
 * @date 2020/10/13
 */
@RestController
@RequestMapping("/system/basic/per")
public class PermissController {

    @Autowired
    PermissService permissService;

    @Autowired
    MenuService menuService;

    @GetMapping("/")
    public List<Role> getAllRoles(){
        return permissService.getAllRoles();
    }

    @GetMapping("/menus")
    public List<Menu> getAllMenus(){
        return menuService.getAllMenus();
    }

}
