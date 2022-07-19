package lotte.com.lottket.dao.product;

import lotte.com.lottket.dto.ProductDto;

import java.util.Map;

public interface ProductDao {
    String createDB(Map<String, Object> paramMap);

    void insertProduct(ProductDto dto);
    void updateProduct(ProductDto dto);
    void deleteProduct(ProductDto dto);
    void selectProduct(ProductDto dto);
    void selectProductAll();
    void selectProductFind(String productTitle);
}
