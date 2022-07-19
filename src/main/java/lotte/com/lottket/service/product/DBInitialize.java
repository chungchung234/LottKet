package lotte.com.lottket.service.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DBInitialize {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public static Map<String, Object> run() throws JSONException, IOException {
        /**
         * 16 items per category
         */
        HashMap<String,String> map = new HashMap<String,String>(){{
            put("과일","LM0400134630003_001"); // https://www.lotteon.com/p/product/LM0400134630003?sitmNo=LM0400134630003_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM0430000806720_001"); // https://www.lotteon.com/p/product/LM0430000806720?sitmNo=LM0430000806720_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM0400361470007_001"); // https://www.lotteon.com/p/product/LM0400361470007?sitmNo=LM0400361470007_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM0430000493043_001"); // https://www.lotteon.com/p/product/LM0430000493043?sitmNo=LM0430000493043_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM0400545060000_001"); // https://www.lotteon.com/p/product/LM0400545060000?sitmNo=LM0400545060000_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM0400550380001_001"); // https://www.lotteon.com/p/product/LM0400550380001?sitmNo=LM0400550380001_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM0400395910005_001"); // https://www.lotteon.com/p/product/LM0400395910005?sitmNo=LM0400395910005_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM0400626260008_001"); // https://www.lotteon.com/p/product/LM0400626260008?sitmNo=LM0400626260008_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM0430000974412_001"); // https://www.lotteon.com/p/product/LM0430000974412?sitmNo=LM0430000974412_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM8809597440488_001"); // https://www.lotteon.com/p/product/LM8809597440488?sitmNo=LM8809597440488_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM0400142780004_001"); // https://www.lotteon.com/p/product/LM0400142780004?sitmNo=LM0400142780004_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM8809541470226_001"); // https://www.lotteon.com/p/product/LM8809541470226?sitmNo=LM8809541470226_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM8809597446718_001"); // https://www.lotteon.com/p/product/LM8809597446718?sitmNo=LM8809597446718_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM0430001029692_001"); // https://www.lotteon.com/p/product/LM0430001029692?sitmNo=LM0430001029692_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM0400632970007_001"); // https://www.lotteon.com/p/product/LM0400632970007?sitmNo=LM0400632970007_001&mall_no=4&dp_infw_cd=CASLM10100002
            put("과일","LM8809045342005_001"); // https://www.lotteon.com/p/product/LM8809045342005?sitmNo=LM8809045342005_001&mall_no=4&dp_infw_cd=CASLM10100002

            put("채소","LM2873260000008_001"); // https://www.lotteon.com/p/product/LM2873260000008?sitmNo=LM2873260000008_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM8809002360110_001"); // https://www.lotteon.com/p/product/LM8809002360110?sitmNo=LM8809002360110_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM8809409755014_001"); // https://www.lotteon.com/p/product/LM8809409755014?sitmNo=LM8809409755014_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM8801114120958_001"); // https://www.lotteon.com/p/product/LM8801114120958?sitmNo=LM8801114120958_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM0430000459742_001"); // https://www.lotteon.com/p/product/LM0430000459742?sitmNo=LM0430000459742_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM2700000045206_001"); // https://www.lotteon.com/p/product/LM2700000045206?sitmNo=LM2700000045206_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM8802015112059_001"); // https://www.lotteon.com/p/product/LM8802015112059?sitmNo=LM8802015112059_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM8807076200028_001"); // https://www.lotteon.com/p/product/LM8807076200028?sitmNo=LM8807076200028_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM8809597441447_001"); // https://www.lotteon.com/p/product/LM8809597441447?sitmNo=LM8809597441447_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM0430000015429_001"); // https://www.lotteon.com/p/product/LM0430000015429?sitmNo=LM0430000015429_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM0400210660009_001"); // https://www.lotteon.com/p/product/LM0400210660009?sitmNo=LM0400210660009_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM8809597440112_001"); // https://www.lotteon.com/p/product/LM8809597440112?sitmNo=LM8809597440112_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM8809597440051_001"); // https://www.lotteon.com/p/product/LM8809597440051?sitmNo=LM8809597440051_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM8809597442246_001"); // https://www.lotteon.com/p/product/LM8809597442246?sitmNo=LM8809597442246_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM8801114102091_001"); // https://www.lotteon.com/p/product/LM8801114102091?sitmNo=LM8801114102091_001&mall_no=4&dp_infw_cd=CASLM10100016
            put("채소","LM8809597441188_001"); // https://www.lotteon.com/p/product/LM8809597441188?sitmNo=LM8809597441188_001&mall_no=4&dp_infw_cd=CASLM10100016

            put("잡곡","LM8804246045687_001"); // https://www.lotteon.com/p/product/LM8804246045687?sitmNo=LM8804246045687_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8804595000252_001"); // https://www.lotteon.com/p/product/LM8804595000252?sitmNo=LM8804595000252_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8808433100029_001"); // https://www.lotteon.com/p/product/LM8808433100029?sitmNo=LM8808433100029_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8808836975958_001"); // https://www.lotteon.com/p/product/LM8808836975958?sitmNo=LM8808836975958_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8801619804254_001"); // https://www.lotteon.com/p/product/LM8801619804254?sitmNo=LM8801619804254_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8808509000697_001"); // https://www.lotteon.com/p/product/LM8808509000697?sitmNo=LM8808509000697_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8809066230176_001"); // https://www.lotteon.com/p/product/LM8809066230176?sitmNo=LM8809066230176_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8809191314789_001"); // https://www.lotteon.com/p/product/LM8809191314789?sitmNo=LM8809191314789_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8801767338915_001"); // https://www.lotteon.com/p/product/LM8801767338915?sitmNo=LM8801767338915_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8809334061150_001"); // https://www.lotteon.com/p/product/LM8809334061150?sitmNo=LM8809334061150_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8804595000757_001"); // https://www.lotteon.com/p/product/LM8804595000757?sitmNo=LM8804595000757_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8801767339561_001"); // https://www.lotteon.com/p/product/LM8801767339561?sitmNo=LM8801767339561_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8809191314772_001"); // https://www.lotteon.com/p/product/LM8809191314772?sitmNo=LM8809191314772_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8809276717832_001"); // https://www.lotteon.com/p/product/LM8809276717832?sitmNo=LM8809276717832_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8801382149637_001"); // https://www.lotteon.com/p/product/LM8801382149637?sitmNo=LM8801382149637_001&mall_no=4&dp_infw_cd=CASLM10100011
            put("잡곡","LM8801500151467_001"); // https://www.lotteon.com/p/product/LM8801500151467?sitmNo=LM8801500151467_001&mall_no=4&dp_infw_cd=CASLM10100011

            put("견과","LM8801133009098_001"); // https://www.lotteon.com/p/product/LM8801133009098?sitmNo=LM8801133009098_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8801133009081_001"); // https://www.lotteon.com/p/product/LM8801133009081?sitmNo=LM8801133009081_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8809022209697_001"); // https://www.lotteon.com/p/product/LM8809022209697?sitmNo=LM8809022209697_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8809019708530_001"); // https://www.lotteon.com/p/product/LM8809019708530?sitmNo=LM8809019708530_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8801133008466_001"); // https://www.lotteon.com/p/product/LM8801133008466?sitmNo=LM8801133008466_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8809019711479_001"); // https://www.lotteon.com/p/product/LM8809019711479?sitmNo=LM8809019711479_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8809019708554_001"); // https://www.lotteon.com/p/product/LM8809019708554?sitmNo=LM8809019708554_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8809742173582_001"); // https://www.lotteon.com/p/product/LM8809742173582?sitmNo=LM8809742173582_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8809022201486_001"); // https://www.lotteon.com/p/product/LM8809022201486?sitmNo=LM8809022201486_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8809617942480_001"); // https://www.lotteon.com/p/product/LM8809617942480?sitmNo=LM8809617942480_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8809617944958_001"); // https://www.lotteon.com/p/product/LM8809617944958?sitmNo=LM8809617944958_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8809036729877_001"); // https://www.lotteon.com/p/product/LM8809036729877?sitmNo=LM8809036729877_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM0430001073312_001"); // https://www.lotteon.com/p/product/LM0430001073312?sitmNo=LM0430001073312_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8936172871372_001"); // https://www.lotteon.com/p/product/LM8936172871372?sitmNo=LM8936172871372_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8801448335240_001"); // https://www.lotteon.com/p/product/LM8801448335240?sitmNo=LM8801448335240_001&mall_no=4&dp_infw_cd=CASLM90020000
            put("견과","LM8809019711486_001"); // https://www.lotteon.com/p/product/LM8809019711486?sitmNo=LM8809019711486_001&mall_no=4&dp_infw_cd=CASLM90020000

            put("정육계란", "LM8803365750359_001"); // https://www.lotteon.com/p/product/LM8803365750359?sitmNo=LM8803365750359_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM2700000000533_001"); // https://www.lotteon.com/p/product/LM2700000000533?sitmNo=LM2700000000533_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM2700000015360_001"); // https://www.lotteon.com/p/product/LM2700000015360?sitmNo=LM2700000015360_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM2700000027653_001"); // https://www.lotteon.com/p/product/LM2700000027653?sitmNo=LM2700000027653_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM2881230000002_001"); // https://www.lotteon.com/p/product/LM2881230000002?sitmNo=LM2881230000002_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM2700000027943_001"); // https://www.lotteon.com/p/product/LM2700000027943?sitmNo=LM2700000027943_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM2861900000006_001"); // https://www.lotteon.com/p/product/LM2861900000006?sitmNo=LM2861900000006_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM2700000015551_001"); // https://www.lotteon.com/p/product/LM2700000015551?sitmNo=LM2700000015551_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM2700000015315_001"); // https://www.lotteon.com/p/product/LM2700000015315?sitmNo=LM2700000015315_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM8804030000038_001"); // https://www.lotteon.com/p/product/LM8804030000038?sitmNo=LM8804030000038_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM8801114141069_001"); // https://www.lotteon.com/p/product/LM8801114141069?sitmNo=LM8801114141069_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM2881590000001_001"); // https://www.lotteon.com/p/product/LM2881590000001?sitmNo=LM2881590000001_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM8809032697415_001"); // https://www.lotteon.com/p/product/LM8809032697415?sitmNo=LM8809032697415_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM2700000027660_001"); // https://www.lotteon.com/p/product/LM2700000027660?sitmNo=LM2700000027660_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM8809055510982_001"); // https://www.lotteon.com/p/product/LM8809055510982?sitmNo=LM8809055510982_001&mall_no=4&dp_infw_cd=CASLM10100014
            put("정육계란", "LM8809385948738_001"); // https://www.lotteon.com/p/product/LM8809385948738?sitmNo=LM8809385948738_001&mall_no=4&dp_infw_cd=CASLM10100014

            put("수산", "LM2700000052310_001"); // https://www.lotteon.com/p/product/LM2700000052310?sitmNo=LM2700000052310_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2614860000001_001"); // https://www.lotteon.com/p/product/LM2614860000001?sitmNo=LM2614860000001_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2700000029770_001"); // https://www.lotteon.com/p/product/LM2700000029770?sitmNo=LM2700000029770_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2529500000009_001"); // https://www.lotteon.com/p/product/LM2529500000009?sitmNo=LM2529500000009_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2700000046951_001"); // https://www.lotteon.com/p/product/LM2700000046951?sitmNo=LM2700000046951_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2700000058350_001"); // https://www.lotteon.com/p/product/LM2700000058350?sitmNo=LM2700000058350_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2527680000000_001"); // https://www.lotteon.com/p/product/LM2527680000000?sitmNo=LM2527680000000_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2534930000000_001"); // https://www.lotteon.com/p/product/LM2534930000000?sitmNo=LM2534930000000_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM8809433792962_001"); // https://www.lotteon.com/p/product/LM8809433792962?sitmNo=LM8809433792962_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2700000029817_001"); // https://www.lotteon.com/p/product/LM2700000029817?sitmNo=LM2700000029817_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2565790000008_001"); // https://www.lotteon.com/p/product/LM2565790000008?sitmNo=LM2565790000008_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2830990000005_001"); // https://www.lotteon.com/p/product/LM2830990000005?sitmNo=LM2830990000005_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2672790000003_001"); // https://www.lotteon.com/p/product/LM2672790000003?sitmNo=LM2672790000003_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2893900000007_001"); // https://www.lotteon.com/p/product/LM2893900000007?sitmNo=LM2893900000007_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2584440000007_001"); // https://www.lotteon.com/p/product/LM2584440000007?sitmNo=LM2584440000007_001&mall_no=4&dp_infw_cd=CASLM10100009
            put("수산", "LM2894660000009_001"); // https://www.lotteon.com/p/product/LM2894660000009?sitmNo=LM2894660000009_001&mall_no=4&dp_infw_cd=CASLM10100009

            put("냉장냉동", "LM8801123700653_001"); // https://www.lotteon.com/p/product/LM8801123700653?sitmNo=LM8801123700653_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801123727391_001"); // https://www.lotteon.com/p/product/LM8801123727391?sitmNo=LM8801123727391_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801007883304_001"); // https://www.lotteon.com/p/product/LM8801007883304?sitmNo=LM8801007883304_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801123309856_001"); // https://www.lotteon.com/p/product/LM8801123309856?sitmNo=LM8801123309856_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801007526492_001"); // https://www.lotteon.com/p/product/LM8801007526492?sitmNo=LM8801007526492_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801242045635_001"); // https://www.lotteon.com/p/product/LM8801242045635?sitmNo=LM8801242045635_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801007526225_001"); // https://www.lotteon.com/p/product/LM8801007526225?sitmNo=LM8801007526225_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801007033686_001"); // https://www.lotteon.com/p/product/LM8801007033686?sitmNo=LM8801007033686_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801242001716_001"); // https://www.lotteon.com/p/product/LM8801242001716?sitmNo=LM8801242001716_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801007883281_001"); // https://www.lotteon.com/p/product/LM8801007883281?sitmNo=LM8801007883281_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801007857206_001"); // https://www.lotteon.com/p/product/LM8801007857206?sitmNo=LM8801007857206_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801114101834_001"); // https://www.lotteon.com/p/product/LM8801114101834?sitmNo=LM8801114101834_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8809265024712_001"); // https://www.lotteon.com/p/product/LM8809265024712?sitmNo=LM8809265024712_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8801007561677_001"); // https://www.lotteon.com/p/product/LM8801007561677?sitmNo=LM8801007561677_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8809265020158_001"); // https://www.lotteon.com/p/product/LM8809265020158?sitmNo=LM8809265020158_001&mall_no=4&dp_infw_cd=CASLM90040000
            put("냉장냉동", "LM8809146311528_001"); // https://www.lotteon.com/p/product/LM8809146311528?sitmNo=LM8809146311528_001&mall_no=4&dp_infw_cd=CASLM90040000

        }};

        List<ProductDto> productList = new ArrayList<>();
        List<ProductImageDto> productImageList = new ArrayList<>();

        Iterator<Entry<String, String>> entries = map.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, String> entry = entries.next();

            String sitmNo = entry.getValue();

            JSONObject json = readJsonFromUrl(
                    "https://pbf.lotteon.com/product/v2/detail/search/base/sitm/" + sitmNo);

            JSONObject data = json.getJSONObject("data");
            JSONObject basicInfo = data.getJSONObject("basicInfo");
            JSONArray imageList = data.getJSONObject("imgInfo").getJSONArray("imageList");

            String pdNo = (String)basicInfo.get("pdNo");
            String pdName = (String)basicInfo.get("pdNm");

            int pdPrice = (Integer)data.getJSONObject("priceInfo").get("slPrc");
            int pdStock = (Integer)data.getJSONObject("stckInfo").get("stkQty");
            Date regDate = new Date(2022,01,01,00,00,00);
            double productTotalRate = 0.0;

            String pdCategory = entry.getKey();
            productList.add(new ProductDto(pdNo, pdName, pdCategory, pdPrice, pdStock, regDate, productTotalRate));

            for(int i=0; i < imageList.length(); i++) {
                String sideImg =(String)((JSONObject)imageList.get(i)).get("origImgFileNm");
                productImageList.add(new ProductImageDto(pdNo, i+1, sideImg));
            }
        }

        Map<String, Object> outcome = new HashMap<>();
        outcome.put("productList", productList);
        outcome.put("productImageList", productImageList);
//		outcome.put("productDetailList", productDetailList);	// 아직

        return outcome;

//		System.out.println(productList.get(0));
//		System.out.println(productImageList.get(0));
    }

}