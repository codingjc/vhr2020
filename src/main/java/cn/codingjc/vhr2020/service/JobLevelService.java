package cn.codingjc.vhr2020.service;

import cn.codingjc.vhr2020.mapper.JobLevelMapper;
import cn.codingjc.vhr2020.model.JobLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author coding_jc
 * @date 2020/10/8
 */
@Service
public class JobLevelService {

    @Autowired
    JobLevelMapper jobLevelMapper;

    public List<JobLevel> getAllJobLevels() {
        return jobLevelMapper.getAllJobLevels();
    }
}
