package cn.codingjc.vhr2020.service;

import cn.codingjc.vhr2020.mapper.NationMapper;
import cn.codingjc.vhr2020.model.Nation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class NationService {

    private final NationMapper nationMapper;

    /**
     * 查询所有名族
     * @return
     */
    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}
