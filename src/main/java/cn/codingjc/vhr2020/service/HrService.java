package cn.codingjc.vhr2020.service;

import cn.codingjc.vhr2020.mapper.HrMapper;
import cn.codingjc.vhr2020.model.Hr;
import cn.codingjc.vhr2020.model.Role;
import cn.codingjc.vhr2020.util.HrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by coding_jc on 2020/8/19
 */
@Service
public class HrService implements UserDetailsService {

    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if (null == hr) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<Role> roles = hrMapper.findRolesByHrId(hr.getId());
        hr.setRoles(roles);
        return hr;
    }

    public List<Hr> getAllHrs() {
        return hrMapper.getAllHrs(HrUtil.getCurrentHr().getId());
    }

    public Integer updateHr(Hr hr) {
        return hrMapper.updateByPrimaryKeySelective(hr);
    }
}
