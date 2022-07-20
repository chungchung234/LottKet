package lotte.com.lottket.service.product;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;

public interface ProductService {

    void insertOneProduct(ProductDto dto);
    void insertOneImage(ProductImageDto dto);

    boolean checkIfEmptyDB();


}
