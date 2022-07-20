package lotte.com.lottket.dao.product;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;

import java.util.Map;

public interface ProductDao {

    void insertOneProduct(ProductDto dto);
    void insertOneImage(ProductImageDto dto);
    boolean checkIfEmptyDB();


}
