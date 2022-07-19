package lotte.com.lottket.dao.product;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;

import java.util.List;

public interface ProductDao {
    ProductDto findByProductId(long productId);
    int insertProduct(ProductDto dto);
    int updateProduct(ProductDto dto);
    int deleteProduct(ProductDto dto);
    ProductDto selectProduct(ProductDto dto);
    List<ProductDto> selectProductAll();
    List<ProductDto> selectProductFind(String productTitle);
    Long getId(ProductDto dto);
    List<ProductImageDto> selectBestProduct();
    List<ProductImageDto> selectWeeklyBestProduct();
    List<ProductImageDto> selectNewProduct();

}
