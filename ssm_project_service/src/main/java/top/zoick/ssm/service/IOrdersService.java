package top.zoick.ssm.service;

import top.zoick.ssm.domain.Orders;

import java.util.List;

/**
 * @author zoick
 * @date 2019/8/19 14:26
 */

public interface IOrdersService {


    List<Orders> findAll(int page, int size) throws Exception;
}
