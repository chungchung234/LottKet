package lotte.com.lottket.dao.productdetail;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDetailDaoImpl implements ProductDetailDao{

    @Autowired
    SqlSession session;

    String ns = "ProductDetail.";

    @Override
    public ProductDto productById(int id) {
        return session.selectOne(ns + "productById", id);
    }

    @Override
    public List<ProductImageDto> productImageById(int id){
        System.out.println("id:"+id);
        List<ProductImageDto> list = session.selectList(ns + "productImageById");

        for (ProductImageDto p : list){
            System.out.println(p.toString());
        }
        return list;
    }
}
