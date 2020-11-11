package ou.phamquangtinh.service.component_service;

import ou.phamquangtinh.entity.RoleEntity;
import ou.phamquangtinh.entity.UserEntity;

import java.util.List;

public interface IRoleService {

    RoleEntity findRoleByCode(String code);

    RoleEntity updateRole(RoleEntity roleEntity);

    List<RoleEntity> findAllRole();
}
