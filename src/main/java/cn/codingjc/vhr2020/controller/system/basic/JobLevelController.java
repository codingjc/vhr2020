package cn.codingjc.vhr2020.controller.system.basic;

import cn.codingjc.vhr2020.model.JobLevel;
import cn.codingjc.vhr2020.service.JobLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 职称相关接口
 * @author coding_jc
 * @date 2020/10/8
 */
@RestController
@RequestMapping("/system/basic/job")
public class JobLevelController {

    @Autowired
    JobLevelService jobLevelService;

    @GetMapping("/")
    public List<JobLevel> getAllJobLevels(){
        return jobLevelService.getAllJobLevels();
    }
}
