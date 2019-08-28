package top.zoick.ssm.service;

import top.zoick.ssm.domain.SysLog;

import java.util.List;

/**
 * @author zoick
 * @date 2019/8/27 20:32
 */
public interface ISysLogService {

    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;
}
