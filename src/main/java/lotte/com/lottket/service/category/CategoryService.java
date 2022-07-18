package lotte.com.lottket.service.category;

import lotte.com.lottket.dto.ProductDto;

import java.util.List;
import java.util.Map;

public interface CategoryService {

    List<ProductDto> findByCategoryOrderByProductPrice(Map<String,Object> param);

    List<ProductDto> findByCategoryOrderByProductRegDate(Map<String,Object> param);

    List<ProductDto> findByCategoryOrderByProductTotalRate(Map<String,Object> param);
}
