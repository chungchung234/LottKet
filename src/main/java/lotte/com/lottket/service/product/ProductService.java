package lotte.com.lottket.service.product;

import lotte.com.lottket.dto.ProductDto;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    void insertProduct(ProductDto dto);
    void updateProduct(ProductDto dto);
    void deleteProduct(ProductDto dto);
    void selectProduct(ProductDto dto);
    void selectProductAll();
    void selectProductFind(String productTitle);
    ProductDto findByProductId(long productId);
}
