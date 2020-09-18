package cn.codingjc.vhr2020.controller;

import cn.codingjc.vhr2020.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coding_jc
 * @date 2020/9/15
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录");
    }
}
