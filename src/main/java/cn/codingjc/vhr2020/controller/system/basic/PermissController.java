package cn.codingjc.vhr2020.controller.system.basic;

import cn.codingjc.vhr2020.model.Menu;
import cn.codingjc.vhr2020.model.RespBean;
import cn.codingjc.vhr2020.model.Role;
import cn.codingjc.vhr2020.service.MenuService;
import cn.codingjc.vhr2020.service.PermissService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addRole")
    public RespBean addRole(@RequestBody Role role){
        if (permissService.addRole(role) == 1) {
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }

    @GetMapping("/menus")
    public List<Menu> getAllMenus(){
        return menuService.getAllMenus();
    }

    @GetMapping("/mids/{rid}")
    public List<Integer> getMidByRid(@PathVariable("rid") Integer rid){
        return menuService.getMidByRid(rid);
    }

    @PutMapping("/updateMenuRole")
    public RespBean updateMenuRole(Integer rid, Integer [] mids){
        if (menuService.updateMenuRole(rid, mids)) {
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @DeleteMapping("/role/{rid}")
    public RespBean deleteRoleById(@PathVariable("rid") Integer rid){
        if (permissService.deleteRoleById(rid) == 1) {
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }

}
