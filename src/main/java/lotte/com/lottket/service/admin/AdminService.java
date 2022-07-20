package lotte.com.lottket.service.admin;

import java.util.HashMap;
import java.util.List;

public interface AdminService {
    List<HashMap> selectDateTotal(HashMap map);
    List<HashMap> selectTotalOrders(HashMap map);

    List<HashMap> selectPopulalityProduct(HashMap map);

    List<HashMap> selectGenderStastistics(HashMap map);

    List<HashMap> selectAgeStastistics(HashMap map);
}
