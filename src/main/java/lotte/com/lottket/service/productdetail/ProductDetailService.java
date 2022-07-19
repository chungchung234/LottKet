package lotte.com.lottket.service.productdetail;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;

import java.util.List;

public interface ProductDetailService {
    ProductDto productById(int id);

    List<ProductImageDto> productImageById(int id);
}
