package com.manorama.dilipkishayari.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SadShayariHandler {

    public static String JSON_TITLE = "JSON_TITLE";
    public static String JSON_MESSAGE = "JSON_MESSAGE";
    public static String JSON_ID = "JSON_ID";
    public static String JSON_SAD_ID = "SAD_ID_";
    public static String JSON_SAD_TITLE = "Sad Shayari";
    private JSONObject sadJson;
    private static JSONArray sadJsonArray;

    public void createSadJson() {
        sadJsonArray = new JSONArray();

        try {
            setSadShayariJson("000001",
                    "Ek Sapne ki Trah Saja Kar Rakhu\n" +
                            "Apne Is Dil Me Hamesha Chhupa Kar Rakhu\n" +
                            "Meri Takdeer Mere Sath Nahi Verna\n" +
                            "Zindagi Bhar Ke Liye Use Apna Bana Kar Rakhu");

            setSadShayariJson("000002",
                    "Ashk aa jate hai aankho me rone se pehle ,\n"+
                            "Har khawab toot jaata hai sone se pehle,\n" +
                            "Ishk hai ek gunah, ye to samajh gaye hum,\n" +
                            "Kash koi rok leta ye gunaah hone se pehle.");

            setSadShayariJson("000003",
                    "Har Ek Muskurahat Muskan Nahin Hoti,\n" +
                            "Nafrat Ho Ya Mohabbat Aasan Nahin Hoti.\n" +
                            "Aansu Gam Ke Aur Khushi Ke Ek Se Hote Hain,\n" +
                            "Magar Inki Pehchaan Aasan Nahin Hoti!");

            setSadShayariJson("000004",
                    "Har kadam Har pal saath hai,\nDur hokar bhi hum aapke pass hai,\nAapko ho na ho par hume aapki kasam,\nAapki kami ka har pal ehsaas hai.");

            setSadShayariJson("000005",
                    "Aankho ki gehrai ko samajh nahi sakte,\nHonto se kuch keh nahi sakte,\nKaise baya kare hum aapko yeh dil ka haal ki,\nTumhi ho jiske bageir hum reh nahi sakte.");

            setSadShayariJson("000006",
                    "Khoya itna kuch ki hume paana na aaya,\nPyar kar to liya par jatana na aaya.\nAa gaye tum is dil mein pehli hi nazar mei,\nBas hame aaoke dil mein samana na aaya.");

            setSadShayariJson("000007",
                    "Jis Din Sapno Me Unka Didaar Ho Jata Hai,\nUs Raat Sona Bhi Duswaar Ho Jata Hai,\nMarta Hai Koi Hum Par Bhi,\nYe Soch Kar Apne Aap Se Pyaar Ho Jata Hai");

            setSadShayariJson("000008",
                    "Chehre pe mere zulfo ko phailao kisi din,\nKyu roz sirf garajate ho,\nBaras jao kisi din,\nKhushbu ki tarah guzro mere dil ki gali se,\nPhulon ki tarah mujpe bikhar jao kisi din.");

            setSadShayariJson("000009",
                    "Na gulfaam chahiye,\nNa salaam chahiye,\nNa mubarak ka koi paigam chahiye,\nJisko pee ker hosh urr jayain,\nLabon ko aisa.. jaam chahiye!!");

            setSadShayariJson("000010",
                    "Tujhe palko pe bithane ko jee chahta hai\nTeri baho se lipatne ko jee chahta hai,\nKhubsurti ki intehaa hain tu,\nTuje zindagi me basane ko jee chahta hai.");

            setSadShayariJson("000010",
                    "Zindagi Me Apki ahmiyat Ham Apko Bata Nahi Sakte\nDil Me Apki Jagah Ham Apko Dikha Nahi Sakte\nKuch Rishtey Bhut Anmol Hote Hai\nIsse Zyada Ham Apko Samjha Nahi Sakte");
        } catch (JSONException jex) {
            jex.printStackTrace();
        }
    }

    public void setSadShayariJson(String jsonId, String jsonMessage) throws JSONException {
        sadJson = new JSONObject();
        sadJson.put(JSON_ID, JSON_SAD_ID + jsonId);
        sadJson.put(JSON_TITLE, JSON_SAD_TITLE);
        sadJson.put(JSON_MESSAGE, jsonMessage);
        sadJsonArray.put(sadJson);
    }

    public JSONArray getSadJsonArray() {
        return sadJsonArray;
    }

    public void setSadJsonArray(JSONArray sadJsonArray) {
        this.sadJsonArray = sadJsonArray;
    }
}
