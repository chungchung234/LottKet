package lotte.com.lottket.service.product;

import lotte.com.lottket.dao.product.ProductDao;
import lotte.com.lottket.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao dao;

    @Override
    public String createDB(Map<String, Object> paramMap) {
        return dao.createDB(paramMap);
    }

//    @Override
//    public void insertEventGoodsMng(Map<String, Object> dbParams) {
//        // dbParams={eventIdx=113, cate=24, ...}
//        List<Map<String, Object>> goodsList = boardMapper.selectGoodsList(dbParams);
//        dbParams.put("goodsList", goodsList);
//        eventMapper.insertEventGoodsMng(dbParams);
//    }

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
