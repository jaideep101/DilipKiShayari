package com.manorama.dilipkishayari.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MorningShayariHandler {

    public static String JSON_TITLE = "JSON_TITLE";
    public static String JSON_MESSAGE = "JSON_MESSAGE";
    public static String JSON_ID = "JSON_ID";
    public static String JSON_MORNING_ID = "MORNING_ID_";
    public static String JSON_MORNING_TITLE = "Morning Shayari";
    private JSONObject morningJson;
    private static JSONArray morningJsonArray;

    public void createMorningJson() {
        morningJsonArray = new JSONArray();

        try {
            setMorningShayariJson("000001",
                    "Dooriyan bahut hai magar itna samajh lo.\nPaas rehkar hi koi khas nahi hota.\nTum iss kadar paas ho mere dil ke.\nMujhe dooriyon ka Ehsaas nahi hota.");

            setMorningShayariJson("000002",
                    "Safar Wahi Tak Hain Jaha Tak Tum Ho,\nNazar Wahi Tak Hain Jaha Tak Tum Ho,\nPhool Bahut Dekhe Hain Is Gulshan Mein,\nKhusbu Wahi Tak Hain Jaha Tak Tum Ho.");

            setMorningShayariJson("000003",
                    "Chupke se dhadkan me utar jaayenge,\nRaahen Ulfat me had se guzar jaayenge,\nAap jo hamen itna chahenge,\nHum to aapki saanson me pighal jaayenge.");

            setMorningShayariJson("000004",
                    "Har kadam Har pal saath hai,\nDur hokar bhi hum aapke pass hai,\nAapko ho na ho par hume aapki kasam,\nAapki kami ka har pal ehsaas hai.");

            setMorningShayariJson("000005",
                    "Aankho ki gehrai ko samajh nahi sakte,\nHonto se kuch keh nahi sakte,\nKaise baya kare hum aapko yeh dil ka haal ki,\nTumhi ho jiske bageir hum reh nahi sakte.");

            setMorningShayariJson("000006",
                    "Khoya itna kuch ki hume paana na aaya,\nPyar kar to liya par jatana na aaya.\nAa gaye tum is dil mein pehli hi nazar mei,\nBas hame aaoke dil mein samana na aaya.");

            setMorningShayariJson("000007",
                    "Jis Din Sapno Me Unka Didaar Ho Jata Hai,\nUs Raat Sona Bhi Duswaar Ho Jata Hai,\nMarta Hai Koi Hum Par Bhi,\nYe Soch Kar Apne Aap Se Pyaar Ho Jata Hai");

            setMorningShayariJson("000008",
                    "Chehre pe mere zulfo ko phailao kisi din,\nKyu roz sirf garajate ho,\nBaras jao kisi din,\nKhushbu ki tarah guzro mere dil ki gali se,\nPhulon ki tarah mujpe bikhar jao kisi din.");

            setMorningShayariJson("000009",
                    "Na gulfaam chahiye,\nNa salaam chahiye,\nNa mubarak ka koi paigam chahiye,\nJisko pee ker hosh urr jayain,\nLabon ko aisa.. jaam chahiye!!");

            setMorningShayariJson("000010",
                    "Tujhe palko pe bithane ko jee chahta hai\nTeri baho se lipatne ko jee chahta hai,\nKhubsurti ki intehaa hain tu,\nTuje zindagi me basane ko jee chahta hai.");

            setMorningShayariJson("000010",
                    "Zindagi Me Apki ahmiyat Ham Apko Bata Nahi Sakte\nDil Me Apki Jagah Ham Apko Dikha Nahi Sakte\nKuch Rishtey Bhut Anmol Hote Hai\nIsse Zyada Ham Apko Samjha Nahi Sakte");
        } catch (JSONException jex) {
            jex.printStackTrace();
        }
    }

    public void setMorningShayariJson(String jsonId, String jsonMessage) throws JSONException {
        morningJson = new JSONObject();
        morningJson.put(JSON_ID, JSON_MORNING_ID + jsonId);
        morningJson.put(JSON_TITLE, JSON_MORNING_TITLE);
        morningJson.put(JSON_MESSAGE, jsonMessage);
        morningJsonArray.put(morningJson);
    }

    public JSONArray getMorningJsonArray() {
        return morningJsonArray;
    }

    public void setMorningJsonArray(JSONArray morningJsonArray) {
        this.morningJsonArray = morningJsonArray;
    }
}
