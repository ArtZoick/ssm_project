package top.zoick.ssm.service;

import top.zoick.ssm.domain.Permission;

import java.util.List;

/**
 * @author zoick
 * @date 2019/8/24 20:53
 */
public interface IPermissionService {

    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
}
