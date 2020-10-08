package cn.codingjc.vhr2020.controller.system.basic;

import cn.codingjc.vhr2020.model.Position;
import cn.codingjc.vhr2020.model.RespBean;
import cn.codingjc.vhr2020.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 职位管理相关接口
 * @author coding_jc
 * @date 2020/10/7
 */
@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {

    @Autowired
    PositionService positionService;

    @GetMapping("/")
    public List<Position> getAllPositions(){
        return positionService.getAllPositions();
    }

    @PostMapping("/")
    public RespBean addPosition(@RequestBody Position position){
        if (positionService.addPosition(position) == 1) {
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }

    @PutMapping("/")
    public RespBean updatePosition(@RequestBody Position position){
        if (positionService.updatePosition(position) == 1) {
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deletePosition(@PathVariable("id") Integer id){
        if (positionService.deletePosition(id) == 1) {
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }

    @DeleteMapping("/")
    public RespBean deletePositionByIds(Integer[] ids){
        if (positionService.deletePositionByIds(ids) == ids.length) {
            return RespBean.ok("批量删除成功");
        }
        return RespBean.ok("批量删除失败");
    }
}
