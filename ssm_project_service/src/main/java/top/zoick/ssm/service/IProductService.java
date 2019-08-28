package top.zoick.ssm.service;

import top.zoick.ssm.domain.Product;

import java.util.List;

/**
 * @author zoick
 * @date 2019/8/14 19:55
 */
public interface IProductService {

    public List<Product> findAll() throws Exception;


    void save(Product product) ;
}
