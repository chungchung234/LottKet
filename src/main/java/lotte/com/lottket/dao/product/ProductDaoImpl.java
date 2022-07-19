package lotte.com.lottket.dao.product;

import lotte.com.lottket.dto.ProductDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class ProductDaoImpl implements ProductDao{
    @Autowired
    ProductDao dao;

    @Autowired
    SqlSession session;

    final String ns = "Product.";

    @Override
    public void insertProduct(ProductDto dto) {
        dao.insertProduct(dto);
    }

    @Override
    public void updateProduct(ProductDto dto) {
        dao.updateProduct(dto);
    }

    @Override
    public void deleteProduct(ProductDto dto) {
        dao.deleteProduct(dto);
    }

    @Override
    public void selectProduct(ProductDto dto) {
        dao.selectProduct(dto);
    }

    @Override
    public void selectProductAll() {
        dao.selectProductAll();
    }

    @Override
    public void selectProductFind(String productTitle) {
        dao.selectProductFind(productTitle);
    }

    @Override
    public ProductDto findByProductId(long productId) {
        return session.selectOne(ns+"findByProductId",productId);
    }
}
