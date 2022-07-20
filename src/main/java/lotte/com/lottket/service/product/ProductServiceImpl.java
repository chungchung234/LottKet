package lotte.com.lottket.service.product;

import lotte.com.lottket.dao.product.ProductDao;
import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;
    
    @Override
    public int insertProduct(ProductDto dto) {
        return productDao.insertProduct(dto);
    }

    @Override
    public int updateProduct(ProductDto dto) {
        return productDao.updateProduct(dto);
    }

    @Override
    public int deleteProduct(ProductDto dto) {
        return productDao.deleteProduct(dto);
    }

    @Override
    public ProductDto selectProduct(ProductDto dto) {
        return productDao.selectProduct(dto);
    }

    @Override
    public List<ProductDto> selectProductAll() {
        return productDao.selectProductAll();
    }

    @Override
    public List<ProductDto> selectProductFind(String productTitle) {
        return productDao.selectProductFind(productTitle);
    }

    @Override
    public Long getId(ProductDto dto) {
        return productDao.getId(dto);
    }

    @Override
    public List<ProductImageDto> selectBestProduct() {
        return productDao.selectBestProduct();
    }

    @Override
    public List<ProductImageDto> selectWeeklyBestProduct() {
        return productDao.selectWeeklyBestProduct();
    }

    @Override
    public List<ProductImageDto> selectNewProduct() {
        return productDao.selectNewProduct();
    }

    @Override
    public int findProductStock(long productId) {
        return productDao.findProductStock(productId);
    }

    @Override
    public void updateProductStock(Map<String, Object> param) {
        productDao.updateProductStock(param);
    }

    @Override
    public ProductDto findByProductId(long productId) {
        return productDao.findByProductId(productId);
    }
}
