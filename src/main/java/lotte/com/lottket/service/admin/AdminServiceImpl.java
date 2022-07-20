package lotte.com.lottket.service.admin;

import lotte.com.lottket.dao.admin.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminDao adminDao;


    @Override
    public List<HashMap> selectDateTotal(HashMap map) {
        return adminDao.selectStatistics(map);
    }

    @Override
    public List<HashMap> selectTotalOrders(HashMap map) {
        return adminDao.selectTotalOrders(map);
    }

    @Override
    public List<HashMap> selectPopulalityProduct(HashMap map) {
        return adminDao.selectPopulalityProduct(map);
    }

    @Override
    public List<HashMap> selectGenderStastistics(HashMap map) {
        return adminDao.selectGenderStastistics(map);
    }

    @Override
    public List<HashMap> selectAgeStastistics(HashMap map) {
        return adminDao.selectAgeStastistics(map);
    }


}
