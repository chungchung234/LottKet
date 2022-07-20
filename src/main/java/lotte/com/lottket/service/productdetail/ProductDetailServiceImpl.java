package lotte.com.lottket.service.productdetail;

import lotte.com.lottket.dao.productdetail.ProductDetailDao;
import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailServiceImpl implements ProductDetailService{

    @Autowired
    ProductDetailDao productDetailDao;

    @Override
    public ProductDto productById(int id){
        return productDetailDao.productById(id);
    }

    @Override
    public List<ProductImageDto> productImageById(int id){
        return productDetailDao.productImageById(id);
    }
}
