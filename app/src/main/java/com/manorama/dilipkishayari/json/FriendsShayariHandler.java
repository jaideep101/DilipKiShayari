package com.manorama.dilipkishayari.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FriendsShayariHandler {

    public static String JSON_TITLE = "JSON_TITLE";
    public static String JSON_MESSAGE = "JSON_MESSAGE";
    public static String JSON_ID = "JSON_ID";
    public static String JSON_FRIENDS_ID = "FRIENDS_ID_";
    public static String JSON_FRIENDS_TITLE = "Friends Shayari";
    private JSONObject friendsJsonObj;
    private static JSONArray friendsJsonArray;

    public void createFriendsJson() {
        friendsJsonArray = new JSONArray();

        try {
            setFriendsShayariJson("000001",
                    "Waqt ki yaari to Har koi karta hai mere dost\n" +
                            "Maja to tab hai Jab waqt badal jaye Par yaar na badle");

            setFriendsShayariJson("000002",
                    "Doori Ho To ahsaas hota hai,\n" +
                            "Dost ke bina jivan kitna udas hota hai\n" +
                            "Umar ho apki Sitaron jitani lambi,\n" +
                            "Aisa dost kahan kisi ke pass hota hai\n");

            setFriendsShayariJson("000003",
                    "Sabne kaha Dosti ek Dard hai Humne kaha Dard kabool hai,\n" +
                            "Subne kaha is Dard ke saath Jee na Paogay,\n" +
                            "Humne kaha teri Dosti ki saath Marna kabool hai");

            setFriendsShayariJson("000004",
                    "Ae dost main tujhe bhool jaau,\n" +
                            "Ye teri bhool hai,\n" +
                            "Teri kya taarif karu\n" +
                            "Tu ek mehakta hua phool hai.");

            setFriendsShayariJson("000005",
                    "Jinki Dosti Sachi Hai,\n" +
                            "Wo Kab Fariyad Karte Hai?,\n" +
                            "Zubaan Khamosh Hoti Hai,\n" +
                            "Magar Dilse Yaad Karti Hai");

            setFriendsShayariJson("000006",
                    "Muskurana hi Khushi nahi hoti,\n" +
                            "Umar bitana hi Zindagi nahi hoti,\n" +
                            "Khud se bhi zyada khayal rakhna padta hai dosto ka,\n" +
                            "Kyoki Dost kehna hi Dosti nahi hoti.");

            setFriendsShayariJson("000007",
                    "Mein bhula nahi hu kisi ko\n" +
                            "Mere bahut aache DOST hai jamane me\n" +
                            "Bas thodi zindgi ulajhi padi hai\n" +
                            "Doo waqt ki roti kamane me");

            setFriendsShayariJson("000008",
                    "Dosti Se Qeemti Koi Jageer Nahi,\n" +
                            "Dosti Se Khubsoorat Koi Tasveer Nahi,\n" +
                            "Dosti To sirf Ek Kaccha Dhaga Hai,\n" +
                            "Dhage Se Majboot Koi Janjeer Nahi.");

            setFriendsShayariJson("000009",
                    "Waqt guzrega hum bikhar jayenge \n" +
                            "Kaun jane hum kidhar jayenge \n" +
                            "Hum dosti ki parchayi hai\n" +
                            "Jahan aap hue tanha wahi hum nazar ayenge");

            setFriendsShayariJson("000010",
                    "Door Ho Jayun To Zara Intezar Karna,\n" +
                            "Apne Dil Ko Na Yun Bekarar Karna,\n" +
                            "Laut Kar Aayenge Hum Jahan Bhi Jayenge,\n" +
                            "Bas Humari Dosti Per Aitbar Karna");

            setFriendsShayariJson("000011",
                    "Dosti naam h sukh dukh ki kahani ka\n" +
                            "Dosti raaz h sada muskurane ka \n" +
                            "Ye koi pal bhar ki pehchaan nhi \n" +
                            "Ye wada hai umar bhar sath nibhane ka");

            setFriendsShayariJson("000012",
                    "Dosti achchi ho toh rang laati hai,\n" +
                            "Dosti gehri ho toh sabko bhaati hai,\n" +
                            "Dosti naadaan ho toh toot jaati hai,\n" +
                            "Par agar dosti apne jaisi ho Toh itihaas banaati hai !");

            setFriendsShayariJson("000013",
                    "Yaadon k sahare hi waqt kat-te hai,\n" +
                            "Baton k sahare hi hamara dil bahlata hai.\n" +
                            "Khud ko akela mat samjho dost,\n" +
                            "Aapko bhi har pal koi yaad karta hai");

            setFriendsShayariJson("000014",
                    "Jab kabhi dosti ki dastaan waqt sunaayega,\n" +
                            "Humko bhi koi shaqs yaad aayega,\n" +
                            "Tab bhool jaayenge zindagi ke gamon ko,\n" +
                            "Jab aapke saath guzara har lamha yaad aayega..");

            setFriendsShayariJson("000015",
                    "Ae dost zindagi bhar mujhse dosti nibhaana\n" +
                            "Dil ki koi bhi baat humse kabhi na chupaana\n" +
                            "Sath chalna mere tum dukh sukh mein\n" +
                            "Bhatak jau mein jo kabhi sahi raasta dikhlaana…");

            setFriendsShayariJson("000016",
                    "Rishton ki dori kamzor hoti hai,\n" +
                            "Aankhon ki baatein dil ki chor hoti hai,\n" +
                            "Khuda ne jab bhi pucha dosti ka matlab,\n" +
                            "Hamari ungli aapki aur hoti hai.");

            setFriendsShayariJson("000017",
                    "Ye Dosti Ke Risthe Bhi Ajeeb Hote Hai\n" +
                            "Sab Apne Apne Naseeb Hote Hai\n" +
                            "Rehte Hai Jo Nighao Se Dur\n" +
                            "Wahi Dil Ke Kareeb Hote Hai");

            setFriendsShayariJson("000018",
                    "Duniya Me Bohut Gam Milege\n" +
                            "Sach Mano Achhe Dost Kam Milege\n" +
                            "Jish Mod Sab Shath Chhod Dege\n" +
                            "Us Mod Per Intjaar Karte Hum Milege !!");

            setFriendsShayariJson("000019",
                    "Doston ko bhul ne walo mein se hum nahi,\n" +
                            "Sath chod ne walo mein se hum nahi,\n" +
                            "Ye dosti to hum umar bhar nibhayenge,\n" +
                            "Kyuki wada todne walo mein se hum nahi.");

            setFriendsShayariJson("000020",
                    "Har dua kubul nahi hoti,\n" +
                            "Har aarzu puri nahi hoti …\n" +
                            "Jinke dil me aap jaise dost rehte ho,\n" +
                            "Unke liye dhadkan bhi jaruri nahi hoti….");

            setFriendsShayariJson("000031",
                    "Qayamat tak tujhe yaad karenge,\n" +
                            "Teri har baat par aitbaar karenge,\n" +
                            "Tujhe sms karne ko to nahi kahenge yeh dost,\n" +
                            "Par phir bhi tere sms ka intezar karenge.");

            setFriendsShayariJson("000032",
                    "Wada Karte Hain Dosti Nibhayenge,\n" +
                            "Koshish Yahi Rahegi Tujhe Na Satyaenge,\n" +
                            "Zarurat Pade Toh Dil Se Pukarana,\n" +
                            "Mar Bhi Rahe Honge To Mohlat Lekar Aayenge");

            setFriendsShayariJson("000033",
                    "Duniya mein koi kisi ke liye kuch nahi karta\n" +
                            "Marne wale ke saath har koi nahi marta\n" +
                            "Arey… Marne ki baat to door rahi\n" +
                            "Yahan to zindgi hai phir bhi koi yaad nahi karta.");

            setFriendsShayariJson("000034",
                    "Dost Ko Dost Ka Ishara Yaad Reheta Hai,\n" +
                            "Har Dost Ko Apna Dostana Yad Reheta Hai,\n" +
                            "Kuch Pal Sachhe Dost Ke Saath To Gujaro,\n" +
                            "Woh Afsana Maut Tak Yaad Rehta Hai.");

            setFriendsShayariJson("000035",
                    "Kya Pata Kab Maut Ka Paigam Aa Jaye,\n" +
                            "Na Jane Kab Zindgi Ka Aakhiri Sham Aa Jaye,\n" +
                            "Mai To Intzar Karta Hun Kisi Aise Samay Ka,\n" +
                            "Ki Meri Zindgi Kisi Dost Ka Kam Aa Jaye");

            setFriendsShayariJson("000036",
                    "Dil me tumhare apni kami chood jayenge,\n" +
                            "Ankho me intezar ki lakir chood jayenge,\n" +
                            "Yaad rakhna dhundte rahoge hame,\n" +
                            "Dosti ki aisi kahani chood jayenge.");

            setFriendsShayariJson("000037",
                    "Dosti ka pehala salaam aapke naam\n" +
                            "Hamaari zindagi ki akhari sham aapke naam\n" +
                            "Iss safar main humsafar hain hum dono\n" +
                            "Is dosti ko nibhana hain aapka kaam");

            setFriendsShayariJson("000038",
                    "Yah dosti chirag hai, Isse jalaye rakhana\n" +
                            "Yah dosti gul hai isse khilaye rakhana.\n" +
                            "Hum rahe na rahe iss jahan main.\n" +
                            "Bus hamari yaad dil me basaye rakhana…");

            setFriendsShayariJson("000039",
                    "Dua karte hain hum sir jhukae dargaah pe,\n" +
                            "Ae dost tu apni manzil ko paye,\n" +
                            "Teri rahon me ho kaanten agr,\n" +
                            "To un kaanto ko hataane ke liye khuda hame bulaaye…");

            setFriendsShayariJson("000040",
                    "Kayi raaz aise hote hain jo dikhaye nahin jaate,\n" +
                            "Kayi kisse aise hote hain jo sunaye nahin jaate,\n" +
                            "Kayi dil aise hote hain jo tode nahin jaate,\n" +
                            "Aur kuch aap jaise dost aise hote hain jo chhode nahin jaate.");

            setFriendsShayariJson("000041",
                    "Aapki Dosti Ki Ek Nazar Chahiye,\n" +
                            "Dil Hai Beghar Use Ek Ghar Chahiye,\n" +
                            "Bas Yuhi Saath Chalte Raho Ae Dost,\n" +
                            "Ye Dosti Hume Umar Bhar Chahiye!!!");

            setFriendsShayariJson("000042",
                    "Mehfil Main Kuch To Sunana Padta Hai,\n" +
                            "Gham Chupakar Muskurana Padta Hai,\n" +
                            "Kabhi Unke Hum Bhi The Dost,\n" +
                            "Aaj Kal Unhe Yaad Dilana Padta Hai");

            setFriendsShayariJson("000043",
                    "Dosti Mein Dooriyan To Aati Rehti Hain,\n" +
                            "Phir Bhi Dosti Dilon Ko Mila Deti Hai,\n" +
                            "Woh Dost Hi Kya Jo Naraz Na Ho,\n" +
                            "Par Sachhi Dosti Doston Ko Mana Leti Hai");

            setFriendsShayariJson("000044",
                    "Khuda Ka Noor Aap Per Is Kadar Barse,\n" +
                            "Har Koi Aapki Chahat Ko Tarse,\n" +
                            "Aapki Zindgi Mein Aayen Itni Khushiyan,\n" +
                            "Ke Wo Khuda Bhi Aapki Zindgi Mein Aane Ko Tarse.");

            setFriendsShayariJson("000045",
                    "Har khushi dil ke karib nahi hoti,\n" +
                            "jindagi gamo se dur nahi hoti,\n" +
                            "aye dost dosti ko sanjokar rakhna,\n" +
                            "dosti har kisi ko nasib nahi hoti");

            setFriendsShayariJson("000046",
                    "Chirago se agar andhere door hote,\n" +
                            "To chandni ki chaahat kyun hoti,\n" +
                            "Kat sakti agar ye jindgi akele,\n" +
                            "To dost naam ki cheez hi kyun hoti?");

            setFriendsShayariJson("000047",
                    "Mat Kar Dost Apni Girl Friend Se Itni Mohabbat,\n" +
                            "Woh Aankhon Se War Karti Hai,\n" +
                            "Maine Dekha Hai Uski Aankhon Me,\n" +
                            "Woh Mujhse Bhi Pyar Karti Hai");

            setFriendsShayariJson("000048",
                    "Sham ki tanhai mein kho na jaana,\n" +
                            "Kisi ki masti mein doob na janaa,\n" +
                            "Milengi zarur manzilein tumhe,\n" +
                            "Unhe pakar hum jaise doston ko bhool na jana…");

            setFriendsShayariJson("000049",
                    "Kuch meethe pal yaad aate hain,\n" +
                            "Palko par aasoo chod jate hain,\n" +
                            "Kal koi aur mil jaaye toh hamain na bhool jana,\n" +
                            "Dosti ke rishtey jindagi bhar kaam aate hain.");

            setFriendsShayariJson("000040",
                    "Phulo ko mehkna sikhane chale,\n" +
                            "In hawao ko rukh batane chale,,\n" +
                            "Hum bahane dhoondte hai doston par mar mitne ka,\n" +
                            "Dost hai ki hme dosti sikhane chale..");


        } catch (JSONException jex) {
            jex.printStackTrace();
        }
    }

    public void setFriendsShayariJson(String jsonId, String jsonMessage) throws JSONException {
        friendsJsonObj = new JSONObject();
        friendsJsonObj.put(JSON_ID, JSON_FRIENDS_ID + jsonId);
        friendsJsonObj.put(JSON_TITLE, JSON_FRIENDS_TITLE);
        friendsJsonObj.put(JSON_MESSAGE, jsonMessage);
        friendsJsonArray.put(friendsJsonObj);
    }

    public JSONObject getFriendsJsonObj() {
        return friendsJsonObj;
    }

    public void setFriendsJsonObj(JSONObject friendsJsonObj) {
        this.friendsJsonObj = friendsJsonObj;
    }

    public static JSONArray getFriendsJsonArray() {
        return friendsJsonArray;
    }

    public static void setFriendsJsonArray(JSONArray friendsJsonArray) {
        FriendsShayariHandler.friendsJsonArray = friendsJsonArray;
    }
}
