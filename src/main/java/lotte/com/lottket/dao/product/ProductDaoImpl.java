package lotte.com.lottket.dao.product;

import lotte.com.lottket.dto.ProductDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDaoImpl implements ProductDao{
    @Autowired
    SqlSession session;

    String ns = "Product.";

    @Override
    public int insertProduct(ProductDto dto) {
        return session.insert(ns + "insertProduct", dto);
    }

    @Override
    public int updateProduct(ProductDto dto) {
        return session.update(ns + "updateProduct", dto);
    }

    @Override
    public int deleteProduct(ProductDto dto) {
        return session.delete(ns + "deleteProduct", dto);
    }

    @Override
    public ProductDto selectProduct(ProductDto dto) {
        return session.selectOne(ns + "selectProduct", Long.toString(dto.getProductId()));
    }

    @Override
    public List<ProductDto> selectProductAll() {
        return session.selectList(ns + "selectProductAll");
    }

    @Override
    public List<ProductDto> selectProductFind(String productTitle) {
        return session.selectList(ns + "selectProductFind", productTitle);
    }

    @Override
    public Long getId(ProductDto dto) {
        return session.selectOne(ns + "getId", dto);
    }

    @Override
    public List<ProductImageDto> selectBestProduct() {
        return session.selectList(ns + "selectBestProduct");
    }

    @Override
    public List<ProductImageDto> selectWeeklyBestProduct() {
        return session.selectList(ns + "selectBestProduct");
    }

    @Override
    public List<ProductDto> selectNewProduct() {
        return session.selectList(ns + "selectBestProduct");
    }
}
