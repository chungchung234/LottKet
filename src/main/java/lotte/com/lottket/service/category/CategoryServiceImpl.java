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
    public List<ProductDto> findByCategory(String productCategory) {
        return categoryDao.findByCategory(productCategory);
    }

    @Override
    public List<ProductDto> findByCategoryOrderByProductPrice(String search, String productCategory) {
        // 검색어 null인 경우
        if(search==null) search="";
        search="%"+search+"%";

        Map<String, Object> param=new HashMap<>();
        param.put("productCategory",productCategory);
        param.put("search",search);

        return categoryDao.findByCategoryOrderByProductPrice(param);
    }

    @Override
    public List<ProductDto> findByCategoryOrderByProductRegDate(String search, String productCategory) {

        if(search==null) search="";
        search="%"+search+"%";

        Map<String, Object> param=new HashMap<>();
        param.put("productCategory",productCategory);
        param.put("search",search);

        return categoryDao.findByCategoryOrderByProductRegDate(param);
    }

    @Override
    public List<ProductDto> findByCategoryOrderByProductTotalRate(String search, String productCategory) {

        if(search==null) search="";
        search="%"+search+"%";

        Map<String, Object> param=new HashMap<>();
        param.put("productCategory",productCategory);
        param.put("search",search);

        return categoryDao.findByCategoryOrderByProductTotalRate(param);
    }
}
