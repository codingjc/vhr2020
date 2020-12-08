package cn.codingjc.vhr2020.controller.system;

import cn.codingjc.vhr2020.mapper.RoleMapper;
import cn.codingjc.vhr2020.model.Hr;
import cn.codingjc.vhr2020.model.RespBean;
import cn.codingjc.vhr2020.model.Role;
import cn.codingjc.vhr2020.service.HrService;
import cn.codingjc.vhr2020.service.PermissService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/hr")
public class HrController {

    @Autowired
    HrService hrService;

    @Autowired
    PermissService permissService;

    @GetMapping("/")
    public List<Hr> getAllHrs(String keyword){
        return hrService.getAllHrs(keyword);
    }

    @PutMapping("/")
    public RespBean updateHr(@RequestBody Hr hr){
        if (hrService.updateHr(hr) == 1) {
            return RespBean.ok("更新成功");
        } else {
            return RespBean.error("更新失败");
        }
    }

    @GetMapping("/roles")
    public List<Role> getAllRoles(){
        return permissService.getAllRoles();
    }

    @PutMapping("/updateHrRole")
    public RespBean updateHrRole(Integer hrId, Integer[] rids){
        if (hrService.updateHrRole(hrId, rids)) {
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");

    }

    @DeleteMapping("/{hrid}")
    public RespBean deleteHrById(@PathVariable("hrid") Integer hrid){
        if (hrService.deleteHrById(hrid) == 1) {
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }
}
