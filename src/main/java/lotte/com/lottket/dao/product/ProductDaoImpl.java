package lotte.com.lottket.dao.product;

import lotte.com.lottket.dto.ProductDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductDaoImpl implements ProductDao{
    @Autowired
    SqlSession session;

    String ns = "Product.";

    @Override
    public String createDB(Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public void insertProduct(ProductDto dto) {

    }

    @Override
    public void updateProduct(ProductDto dto) {

    }

    @Override
    public void deleteProduct(ProductDto dto) {

    }

    @Override
    public void selectProduct(ProductDto dto) {

    }

    @Override
    public void selectProductAll() {

    }

    @Override
    public void selectProductFind(String productTitle) {

    }
}
