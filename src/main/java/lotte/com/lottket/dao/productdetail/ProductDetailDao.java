package lotte.com.lottket.dao.productdetail;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;

import java.util.List;

public interface ProductDetailDao {
    ProductDto productById(int id);

    List<ProductImageDto> productImageById(int id);
}
