package lotte.com.lottket.dao.product;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;
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
    public void insertOneProduct(ProductDto dto) {
        session.insert(ns + "insertOneProduct", dto);
    }

    @Override
    public void insertOneImage(ProductImageDto dto) {
        session.insert(ns + "insertOneImage", dto);
    }

    @Override
    public boolean checkIfEmptyDB() {
        if( session.selectList(ns + "checkIfEmptyDB").size()  > 0)
            return false;   // not empty
        else
            return true;    // is empty
    }

}
