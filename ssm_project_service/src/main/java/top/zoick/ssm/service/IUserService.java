package top.zoick.ssm.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import top.zoick.ssm.domain.Role;
import top.zoick.ssm.domain.UserInfo;

import java.util.List;

/**
 * @author zoick
 * @date 2019/8/21 16:08
 */
public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll() throws Exception;

    void save(UserInfo userInfo) throws Exception;

    UserInfo findById(String id) throws Exception;

    List<Role> findOtherRoles(String userId);

    void addRoleToUser(String userId, String[] roleIds) throws Exception;
}
