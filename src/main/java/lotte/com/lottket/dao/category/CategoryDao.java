package lotte.com.lottket.dao.category;

import lotte.com.lottket.dto.ProductDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CategoryDao {

    List<ProductDto> findByCategoryOrderByProductPrice(Map<String,Object> param);

    List<ProductDto> findByCategoryOrderByProductRegDate(Map<String,Object> param);

    List<ProductDto> findByCategoryOrderByProductTotalRate(Map<String,Object> param);

}
