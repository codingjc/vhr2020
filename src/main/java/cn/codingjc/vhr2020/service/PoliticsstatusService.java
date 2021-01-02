package cn.codingjc.vhr2020.service;

import cn.codingjc.vhr2020.mapper.PoliticsstatusMapper;
import cn.codingjc.vhr2020.model.Politicsstatus;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PoliticsstatusService {

    private final PoliticsstatusMapper politicsstatusMapper;

    public List<Politicsstatus> getAllPoliticsstatus() {
        return politicsstatusMapper.getAllPoliticsstatus();
    }
}
