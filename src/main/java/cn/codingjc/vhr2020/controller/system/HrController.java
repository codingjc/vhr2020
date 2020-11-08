package cn.codingjc.vhr2020.controller.system;

import cn.codingjc.vhr2020.model.Hr;
import cn.codingjc.vhr2020.model.RespBean;
import cn.codingjc.vhr2020.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
