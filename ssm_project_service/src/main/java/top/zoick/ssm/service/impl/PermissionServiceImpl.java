package top.zoick.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zoick.ssm.dao.IPermissionDao;
import top.zoick.ssm.domain.Permission;
import top.zoick.ssm.service.IPermissionService;

import java.util.List;

/**
 * @author zoick
 * @date 2019/8/24 20:54
 */
@Service
@Transactional
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public void save(Permission permission) throws Exception{
        permissionDao.save(permission);
    }

    @Override
    public List<Permission> findAll() throws Exception {
        return permissionDao.findAll();
    }
}
