package cn.codingjc.vhr2020.util;

import cn.codingjc.vhr2020.model.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

public class HrUtil {

    public static Hr getCurrentHr(){
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
