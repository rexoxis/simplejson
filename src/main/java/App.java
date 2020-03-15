import org.apache.camel.catalog.JSonSchemaResolver;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.Iterator;


public class App {

    public static void main(String[] args) throws ParseException {
        // 파싱할 json 예제
        /*
        {
            "response": {
            "code": 200
            },
            "map_id": "Savage_Main",
            "deaths": [
                {
                    "time_event": 250,
                    "is_range_valid": true,
                    "description": "QBZ"
                },
                {
                    "time_event": 562,
                    "is_range_valid": true,
                    "description": "QBZ"
                }
            ]
        }
        */

        // jsonsimple 라이브러리에서는 JSONObject, JSONArray
        String json = "{ \"response\" : { \"code\" : 200 }, \"map_id\" : \"Savage_Main\", \"deaths\" : [{ \"time_event\" : 250, \"is_range_valid\" : true, \"description\" : \"QBZ\" }, { \"time_event\" : 250, \"is_range_valid\" : true, \"description\" : \"QBZ\" }] }";

        JSONParser jsonParser = new JSONParser();

        // String 형태의 json을 json 객체로 변환
        JSONObject gameResult = (JSONObject) jsonParser.parse(json);

        // gameResult객체의 response 값 출력
        System.out.println(gameResult.get("response"));

        // gameResult객체의 deaths의 값 출력
        System.out.println(gameResult.get("deaths"));

        // gameResult객체의 response의 code값 출력
        JSONObject response = (JSONObject) gameResult.get("response");
        System.out.println(response.get("code"));

        // gameResult객체의 deaths의 time_event값 출력
        JSONArray deaths = (JSONArray) gameResult.get("deaths");
        JSONObject deathsResult = null;

        for (int i = 0; i < deaths.size(); i++) {
            deathsResult = (JSONObject) deaths.get(i);
            System.out.println(deathsResult.get("time_event"));
        }

        // json 객체를 String으로 변환
        System.out.println(gameResult.toJSONString());


        // 자바 객체를 json으로
        JSONObject resultobj = new JSONObject();
        JSONObject object1 = new JSONObject();
        JSONObject object2 = new JSONObject();
        JSONObject object3 = new JSONObject();
        JSONArray array1 = new JSONArray();

        GameResponse response1 = new GameResponse(200);
        GameResult result = new GameResult("Savage_Main");
        GameDeath death1 = new GameDeath(250, true, "QBZ");
        GameDeath death2 = new GameDeath(250, true, "QBZ");

        object1.put("code", response1.getCode());

        object2.put("time_event",death1.getTimeEvent());
        object2.put("is_range_valid",death1.isRangeValid());
        object2.put("description",death1.getDescription());

        object3.put("time_event",death2.getTimeEvent());
        object3.put("is_range_valid",death2.isRangeValid());
        object3.put("description",death2.getDescription());

        array1.add(object2);
        array1.add(object3);

        resultobj.put("response", object1);
        resultobj.put("map_id", result.getMapid());
        resultobj.put("deaths", array1);

        System.out.println(resultobj.toJSONString());
    }
}
