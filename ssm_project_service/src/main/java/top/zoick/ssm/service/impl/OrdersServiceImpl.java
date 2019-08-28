package top.zoick.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zoick.ssm.dao.IOrdersDao;
import top.zoick.ssm.domain.Orders;
import top.zoick.ssm.service.IOrdersService;

import java.util.List;

/**
 * @author zoick
 * @date 2019/8/19 14:26
 */
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int page, int size) throws Exception{

        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);//此条语句一定要写在分页代码之前
        return ordersDao.findAll();
    }

}
