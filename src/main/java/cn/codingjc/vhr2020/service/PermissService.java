package cn.codingjc.vhr2020.service;

import cn.codingjc.vhr2020.mapper.RoleMapper;
import cn.codingjc.vhr2020.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author coding_jc
 * @date 2020/10/13
 */
@Service
public class PermissService {

    @Autowired
    RoleMapper roleMapper;

    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

}
