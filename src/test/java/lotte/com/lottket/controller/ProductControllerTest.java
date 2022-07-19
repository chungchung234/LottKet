package lotte.com.lottket.controller;

import lotte.com.lottket.dto.ProductDto;
import org.junit.Test;

import java.io.IOException;

public class ProductControllerTest {
    ProductController controller = new ProductController();
    @Test
    public void selectProduct(ProductDto dto) throws IOException {
        dto = new ProductDto("title1", "category", 0, 0, "2022-07-18 00:00:00", "3.1");
        controller.selectProduct(dto);
    }
}