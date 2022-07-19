package lotte.com.lottket.dao.category;

import lotte.com.lottket.dto.ProductDto;

import java.util.List;

public interface CategoryDao {

    List<ProductDto> findByCategoryOrderByProductPrice(String productCategory);

    List<ProductDto> findByCategoryOrderByProductRegDate(String productCategory);


}
