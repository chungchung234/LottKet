package lotte.com.lottket.dao.admin;

import java.util.HashMap;
import java.util.List;

public interface AdminDao {

    List<HashMap> selectStatistics(HashMap map);


    List<HashMap> selectTotalOrders(HashMap map);

    List<HashMap> selectPopulalityProduct(HashMap map);

    HashMap<String, Object> selectAgeStatistics(HashMap map);
    HashMap<String, Object> selectGenderStatistics(HashMap map);
}
