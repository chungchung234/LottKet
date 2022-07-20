package lotte.com.lottket.service.category;

import lotte.com.lottket.dto.ProductDto;

import java.util.List;
import java.util.Map;

public interface CategoryService {

    List<ProductDto> findByCategory(String productCategory);

    List<ProductDto> findByCategoryOrderByProductPrice(String search, String productCategory);

    List<ProductDto> findByCategoryOrderByProductRegDate(String search, String productCategory);

    List<ProductDto> findByCategoryOrderByProductTotalRate(String search, String productCategory);
}
