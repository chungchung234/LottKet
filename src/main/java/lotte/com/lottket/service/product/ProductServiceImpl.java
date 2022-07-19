package lotte.com.lottket.service.product;

import lotte.com.lottket.dao.product.ProductDao;
import lotte.com.lottket.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao dao;

    @Override
    public int insertProduct(ProductDto dto) {
        return dao.insertProduct(dto);
    }

    @Override
    public int updateProduct(ProductDto dto) {
        return dao.updateProduct(dto);
    }

    @Override
    public int deleteProduct(ProductDto dto) {
        return dao.deleteProduct(dto);
    }

    @Override
    public ProductDto selectProduct(ProductDto dto) {
        return dao.selectProduct(dto);
    }

    @Override
    public List<ProductDto> selectProductAll() {
        return dao.selectProductAll();
    }

    @Override
    public List<ProductDto> selectProductFind(String productTitle) {
        return dao.selectProductFind(productTitle);
    }

    @Override
    public Long getId(ProductDto dto) {
        return dao.getId(dto);
    }

    @Override
    public List<ProductImageDto> selectBestProduct() {
        return dao.selectBestProduct();
    }

    @Override
    public List<ProductImageDto> selectWeeklyBestProduct() {
        return dao.selectWeeklyBestProduct();
    }

    @Override
    public List<ProductDto> selectNewProduct() {
        return dao.selectNewProduct();
    }

}
