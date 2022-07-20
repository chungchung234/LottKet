package lotte.com.lottket.service.product;

import lotte.com.lottket.dao.product.ProductDao;
import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao dao;

    @Override
    public void insertOneProduct(ProductDto dto) {
        dao.insertOneProduct(dto);
    }

    @Override
    public void insertOneImage(ProductImageDto dto) {
        dao.insertOneImage(dto);
    }

    public boolean checkIfEmptyDB() {
        return dao.checkIfEmptyDB();
    }
}
