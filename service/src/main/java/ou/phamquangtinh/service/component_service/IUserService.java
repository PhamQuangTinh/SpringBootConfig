package ou.phamquangtinh.service.component_service;



import ou.phamquangtinh.entity.UserEntity;


public interface IUserService {


    UserEntity updateUser(UserEntity userEntity);

    UserEntity findByUsername(String username);

    UserEntity findUserById(Long id);


}
