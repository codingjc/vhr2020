package cn.codingjc.vhr2020.controller.emp;

import cn.codingjc.vhr2020.model.*;
import cn.codingjc.vhr2020.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp/basic")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmpBasicController {

    private final EmployeeService employeeService;
    private final NationService nationService;
    private final PoliticsstatusService politicsstatusService;
    private final JobLevelService jobLevelService;
    private final PositionService positionService;

    /**
     * 分页获取员工数据(模糊搜索)
     * @param page
     * @param size
     * @param keyWord
     * @return
     */
    @GetMapping("/")
    public RespPageBean getEmployeeByPage(@RequestParam(defaultValue = "1") Integer page,
           @RequestParam(defaultValue = "10") Integer size, String keyWord) {
        return employeeService.getEmpployeeByPage(page, size, keyWord);

    }

    /**
     * 添加员工
     * @param employee
     * @return
     */
    @PostMapping("/")
    public RespBean addEmployee(@RequestBody Employee employee){
        if (employeeService.addEmployee(employee) == 1) {
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }

    /**
     * 查询所有民族
     * @return
     */
    @GetMapping("/nations")
    public List<Nation> getAllNations(){
        return nationService.getAllNations();
    }

    /**
     * 查询所有政治面貌
     * @return
     */
    @GetMapping("/politicsstatus")
    public List<Politicsstatus> getAllPoliticsstatus(){
        return politicsstatusService.getAllPoliticsstatus();
    }

    /**
     * 查询所有政治面貌
     * @return
     */
    @GetMapping("/jobLevels")
    public List<JobLevel> getAllJobLevels(){
        return jobLevelService.getAllJobLevels();
    }

    /**
     * 查询所有职位
     * @return
     */
    @GetMapping("/positions")
    public List<Position> getAllPositions(){
        return positionService.getAllPositions();
    }

    @GetMapping("/maxWorkId")
    public RespBean getMaxWorkID(){
        return RespBean.build()
                .setStatus(200)
                .setData(String.format("%08d", employeeService.maxWorkId() + 1));
//        return RespBean.ok("操作成功", String.format("%08d", employeeService.maxWorkId() + 1));
    }
}
