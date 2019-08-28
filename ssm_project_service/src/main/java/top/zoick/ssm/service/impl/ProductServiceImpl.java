package top.zoick.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zoick.ssm.service.IProductService;
import top.zoick.ssm.dao.IProductDao;
import top.zoick.ssm.domain.Product;

import java.util.List;

/**
 * @author zoick
 * @date 2019/8/14 19:56
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService{

    @Autowired
    private IProductDao productDao;


    @Override
    public List<Product> findAll() throws Exception{
        return productDao.findAll();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }
}
