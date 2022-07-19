package lotte.com.lottket.dao.admin;

import java.util.HashMap;
import java.util.List;

public interface AdminDao {

    List<HashMap> selectStatistics(HashMap map);


    List<HashMap> selectTotalOrders(HashMap map);

    List<HashMap> selectPopulalityProduct(HashMap map);

    List<HashMap> selectAgeStastistics(HashMap map);
    List<HashMap> selectGenderStastistics(HashMap map);
}
