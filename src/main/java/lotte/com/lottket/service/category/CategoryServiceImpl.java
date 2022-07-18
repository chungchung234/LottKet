package lotte.com.lottket.service.category;

import lotte.com.lottket.dao.category.CategoryDao;
import lotte.com.lottket.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<ProductDto> findByCategoryOrderByProductPrice(Map<String,Object> param) {

        return categoryDao.findByCategoryOrderByProductPrice(param);
    }

    @Override
    public List<ProductDto> findByCategoryOrderByProductRegDate(Map<String,Object> param) {
        return categoryDao.findByCategoryOrderByProductRegDate(param);
    }

    @Override
    public List<ProductDto> findByCategoryOrderByProductTotalRate(Map<String, Object> param) {
        return categoryDao.findByCategoryOrderByProductTotalRate(param);
    }
}
