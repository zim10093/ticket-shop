package core.spring.service.impl;

import core.spring.dao.RoleDao;
import core.spring.model.Role;
import core.spring.service.RoleService;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Optional<Role> getByName(String roleName) {
        return roleDao.getByName(roleName);
    }
}
