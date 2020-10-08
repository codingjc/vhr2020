package cn.codingjc.vhr2020.service;

import cn.codingjc.vhr2020.mapper.PositionMapper;
import cn.codingjc.vhr2020.model.Position;
import cn.codingjc.vhr2020.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author coding_jc
 * @date 2020/10/7
 */
@Service
public class PositionService {

    @Autowired
    PositionMapper positionMapper;

    /**
     * 获取所有职位
     * @return
     */
    public List<Position> getAllPositions() {
        return positionMapper.getAllPositions();
    }

    /**
     * 添加职位
     * @param position
     * @return
     */
    public Integer addPosition(Position position) {
        position.setCreateDate(new Date());
        position.setEnabled(true);
        return positionMapper.insertSelective(position);
    }

    /**
     * 更新职位
     * @param position
     * @return
     */
    public Integer updatePosition(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    /**
     * 删除职位
     * @param id
     * @return
     */
    public Integer deletePosition(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }
}
