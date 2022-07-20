package lotte.com.lottket.service.admin;

import java.util.HashMap;
import java.util.List;

public interface AdminService {
    List<HashMap> selectDateTotal(HashMap map);
    List<HashMap> selectTotalOrders(HashMap map);

    List<HashMap> selectPopulalityProduct(HashMap map);

    HashMap<String, Object> selectGenderStatistics(HashMap map);

    HashMap<String, Object> selectAgeStatistics(HashMap map);
}
