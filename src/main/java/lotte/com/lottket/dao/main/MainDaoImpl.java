package lotte.com.lottket.dao.main;

import lotte.com.lottket.dto.ProductDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MainDaoImpl implements MainDao {
    @Autowired
    SqlSession session;
    @Override
    public ProductDto selectAll() {
        ProductDto dto;
        return session.selectOne("Main.main");
    }



}
