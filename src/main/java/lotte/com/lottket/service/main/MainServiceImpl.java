package lotte.com.lottket.service.main;

import lotte.com.lottket.dao.main.MainDao;
import lotte.com.lottket.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    MainDao maindao;

    @Override
    public ProductDto selectAll() {
        return maindao.selectAll();
    }
}
