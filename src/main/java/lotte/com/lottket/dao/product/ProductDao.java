package lotte.com.lottket.dao.product;

import lotte.com.lottket.dto.ProductDto;

public interface ProductDao {
    void insertProduct(ProductDto dto);
    void updateProduct(ProductDto dto);
    void deleteProduct(ProductDto dto);
    void selectProduct(ProductDto dto);
    void selectProductAll();
    void selectProductFind(String productTitle);

    ProductDto findByProductId(long productId);
}
