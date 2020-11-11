package ou.phamquangtinh.service.implement;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ou.phamquangtinh.entity.RoleEntity;
import ou.phamquangtinh.repository.RoleJPARepository;
import ou.phamquangtinh.service.component_service.IRoleService;

import java.util.*;


@Service
@Slf4j
public class RoleService implements IRoleService {

    @Autowired
    private RoleJPARepository roleRepository;

    @Override
    public RoleEntity findRoleByCode(String code) {
        RoleEntity role = findByCode(code);
        return role;
    }

    @Override
    public RoleEntity updateRole(RoleEntity roleEntity) {
        return roleRepository.saveAndFlush(roleEntity);
    }

    @Override
    public List<RoleEntity> findAllRole() {
        return roleRepository.findAll();
    }

    @Transactional(readOnly = true)
    RoleEntity findByCode(String code) {

        Optional<RoleEntity> role = roleRepository.findByCode(code);

        role.orElseThrow(() -> new RuntimeException("Can't not found role: " + code));
        return role.get();
    }
}
