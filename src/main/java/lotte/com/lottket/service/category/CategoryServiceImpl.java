package lotte.com.lottket.service.category;

import lotte.com.lottket.dao.category.CategoryDao;
import lotte.com.lottket.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryDao categoryDao;


    @Override
    public List<ProductDto> findByCategoryOrderByProductPrice(String productCategory) {
        return categoryDao.findByCategoryOrderByProductPrice(productCategory);
    }

    @Override
    public List<ProductDto> findByCategoryOrderByProductRegDate(String productCategory) {
        return categoryDao.findByCategoryOrderByProductRegDate(productCategory);
    }
}
