package cn.codingjc.vhr2020.controller.system;

import cn.codingjc.vhr2020.model.Hr;
import cn.codingjc.vhr2020.model.RespBean;
import cn.codingjc.vhr2020.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/hr")
public class HrController {

    @Autowired
    HrService hrService;

    @GetMapping("/")
    public List<Hr> getAllHrs(){
        return hrService.getAllHrs();
    }

    @PutMapping("/")
    public RespBean updateHr(@RequestBody Hr hr){
        if (hrService.updateHr(hr) == 1) {
            return RespBean.ok("更新成功");
        } else {
            return RespBean.error("更新失败");
        }
    }
}
