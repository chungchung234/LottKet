package lotte.com.lottket.dao.category;

import lotte.com.lottket.dto.ProductDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CategoryDaoImpl implements CategoryDao{

    @Autowired
    SqlSession session;

    String ns="Category.";

    @Override
    public List<ProductDto> findByCategoryOrderByProductPrice(Map<String,Object> param) {
        /*System.out.println(param.get("productCategory"));*/
        System.out.println("CategoryDaoImpl findByCategoryOrderByProductPrice ");
        return session.selectList(ns+"findByCategoryOrderByProductPrice", param);
    }

    @Override
    public List<ProductDto> findByCategoryOrderByProductRegDate(Map<String,Object> param) {
        return session.selectList(ns+"findByCategoryOrderByProductRegDate",param);
    }

    @Override
    public List<ProductDto> findByCategoryOrderByProductTotalRate(Map<String, Object> param) {
        return session.selectList(ns+"findByCategoryOrderByProductTotalRate",param);
    }


}
