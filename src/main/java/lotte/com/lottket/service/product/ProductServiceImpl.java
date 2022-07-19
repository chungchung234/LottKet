package lotte.com.lottket.service.product;

import lotte.com.lottket.dao.product.ProductDao;
import lotte.com.lottket.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;
    @Override
    public void insertProduct(ProductDto dto) {

    }

    @Override
    public void updateProduct(ProductDto dto) {

    }

    @Override
    public void deleteProduct(ProductDto dto) {

    }

    @Override
    public void selectProduct(ProductDto dto) {

    }

    @Override
    public void selectProductAll() {

    }

    @Override
    public void selectProductFind(String productTitle) {

    }

    @Override
    public ProductDto findByProductId(long productId) {
        return productDao.findByProductId(productId);
    }
}
