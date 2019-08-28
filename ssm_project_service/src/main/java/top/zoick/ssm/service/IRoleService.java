package top.zoick.ssm.service;

import top.zoick.ssm.domain.Permission;
import top.zoick.ssm.domain.Role;

import java.util.List;

/**
 * @author zoick
 * @date 2019/8/24 19:19
 */
public interface IRoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws Exception;

    List<Permission> findOtherPermissions(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;
}
