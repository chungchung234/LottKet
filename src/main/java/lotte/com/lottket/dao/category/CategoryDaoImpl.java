package lotte.com.lottket.dao.category;

import lotte.com.lottket.dto.ProductDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao{

    @Autowired
    SqlSession session;

    String ns="Category.";

    @Override
    public List<ProductDto> findByCategoryOrderByProductPrice(String productCategory) {

        return session.selectList(ns+"findByCategoryOrderByProductPrice");
    }

    @Override
    public List<ProductDto> findByCategoryOrderByProductRegDate(String productCategory) {
        return session.selectList(ns+"findByCategoryOrderByProductRegDate");
    }
}
