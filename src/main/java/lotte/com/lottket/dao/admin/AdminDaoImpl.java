package lotte.com.lottket.dao.admin;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class AdminDaoImpl implements AdminDao {

    @Autowired
    SqlSession session;

    String ns = "statistics";

    @Override
    public List<HashMap> selectStatistics(HashMap map) {
        if (map.get("date").equals("day")) {
            return session.selectList(ns+"sales_day_total",map);
        } else if (map.get("date").equals("week")) {
            return session.selectList(ns+"sales_week_total",map);
        }else if (map.get("date").equals("month")){
            return session.selectList(ns+"sales_month_total",map);
        }
        return null;
    }

    @Override
    public List<HashMap> selectTotalOrders(HashMap map) {
        return session.selectList(ns+"total_orders",map);
    }

    @Override
    public List<HashMap> selectPopulalityProduct(HashMap map) {
        return session.selectList(ns+"total_orders",map);
    }

    @Override
    public List<HashMap> selectAgeStastistics(HashMap map) {
        return session.selectOne(ns+"age_stastistics",map);
    }

    @Override
    public List<HashMap> selectGenderStastistics(HashMap map) {
        return session.selectOne(ns+"gender_stastistics",map);
    }
}
