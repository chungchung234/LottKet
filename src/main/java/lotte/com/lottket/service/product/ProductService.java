package lotte.com.lottket.service.product;

import lotte.com.lottket.dto.ProductDto;

public interface ProductService {
    void insertProduct(ProductDto dto);
    void updateProduct(ProductDto dto);
    void deleteProduct(ProductDto dto);
    void selectProduct(ProductDto dto);
    void selectProductAll();
    void selectProductFind(String productTitle);
}
