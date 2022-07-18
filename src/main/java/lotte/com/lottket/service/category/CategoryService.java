package lotte.com.lottket.service.category;

import lotte.com.lottket.dto.ProductDto;

import java.util.List;

public interface CategoryService {

    List<ProductDto> findByCategoryOrderByProductPrice(String productCategory);

    List<ProductDto> findByCategoryOrderByProductRegDate(String productCategory);
}
