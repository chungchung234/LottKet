package lotte.com.lottket.service.product;

import lotte.com.lottket.dto.ProductDto;

import java.util.List;

public interface ProductService {
    int insertProduct(ProductDto dto);
    int updateProduct(ProductDto dto);
    int deleteProduct(ProductDto dto);
    ProductDto selectProduct(ProductDto dto);
    List<ProductDto> selectProductAll();
    List<ProductDto> selectProductFind(String productTitle);
    Long getId(ProductDto dto);
    List<ProductImageDto> selectBestProduct();
    List<ProductImageDto> selectWeeklyBestProduct();
    List<ProductDto> selectNewProduct();
}
