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
                    "Mil Bhi Jate Hain Toh Katra Ke Nikal Jate Hain,\n" +
                            "Hain Mausam Ki Tarah Log.... Badal Jaate Hain,\n" +
                            "Hum Abhi Tak Hain Giraftar-e-Mohabbat Yaaro,\n" +
                            "Thokarein Kha Ke Suna Tha Ke Sambhal Jate Hain.");

            setSadShayariJson("000005",
                    "Chaman Mein Jo Bhi They Naafiz Usool Uske They,\n" +
                            "Tamaam Kaante Hamaare They Aur Phool Uske They,\n" +
                            "Main Iltejaa Bhi Kartaa Toh Kis Tarha Kartaa,\n" +
                            "Shahar Mein Faisle Sabko Qabool Uske They.");

            setSadShayariJson("000006",
                    "Khawab Tha Bhikar Gaya, Khayal Tha Mila Nahi,\n" +
                            "Magar Ye Dil Ko Kya Hua, Ye Kyu Bujha Pata Nahi,\n" +
                            "Tamaam Din Udaas Din, Tamaam Shab Udasiyan,\n" +
                            "Kisi Se Koi Bichhad Gaya, Jaise Kuch Bacha Nahi.");

            setSadShayariJson("000007",
                    "Bewaqt Bewajah Besabab Si Berukhi Teri,\n" +
                            "Phir Bhi Beinteha Chahne Ki Bebasi Meri.\n\n\n" +
                            "Dekhi Hai Berukhi Ki Aaj Humne Intehaan,\n" +
                            "Hum Pe Najar Padi Toh Mehfil Se Uthh Gaye.");

            setSadShayariJson("000008",
                    "Ek Najar Bhi Dekhna Ganwaara Nahi Usey,\n" +
                            "Jara Sa Bhi Ehsaas Hamaara Nahi Usey,\n" +
                            "Wo Sahil Se Dekhte Rahe Doobna Hamara,\n" +
                            "Hum Bhi Khuddar They Pukara Nahi Usey.");

            setSadShayariJson("000009",
                    "Ab Aansuon Ko Aankhon Mein Sajana Hoga,\n" +
                            "Chirag Bujh Gaye Humein Khud Ko Jalana Hoga,\n" +
                            "Na Samajhna Ke Tumse Bichhad Ke Khush Hain Hum,\n" +
                            "Humein Logon Ki Khatir Muskurana Hoga.");

            setSadShayariJson("000010",
                    "Khud Ko Kuchh Iss Kadar Tabaah Kiya,\n" +
                            "Ishq Kiya Ek KhoobSurat Gunaah Kiya,\n" +
                            "Jab Mohabbat Mein Na The Tab Khush The Hum,\n" +
                            "Dil Ka Sauda Humne BeWajah Kiya.");

            setSadShayariJson("000011",
                    "Sapno Se Dil Lagane Ki Aadat Nahi Rahi,\n" +
                            "Har Waqt Muskurane Ki Aadat Nahi Rahi,\n" +
                            "Ye Soch Ke Ki Koi Manaane Nahi Aayega.\n" +
                            "Hum Ko Rooth Jaane Ki Aadat Nahi Rahi.");

            setSadShayariJson("000012",
                    "Chalo Ab Jaane Bhi Do,\n Kya Karoge Dastaan Sunkar,\n" +
                            "Khamoshi Tum Samjhoge Nahi,\n Aur Bayaan Humse Hoga Nahi.");

            setSadShayariJson("000013",
                    "Ab Soch Rahe Hain Seekh Hi Lein,\n" +
                            "Hum Bhi Berukhi Karna,\n" +
                            "Mohabbat Dete Dete Sabko Humne,\n" +
                            " Apni Hi Kadar Kho Di.");

            setSadShayariJson("000014",
                    "Meri Koshish Kabhi Kamyaab Na Ho Saki,\n" +
                            "Na Tujhe Pane Kii Na Tujhe Bhulane Ki.");

            setSadShayariJson("000015",
                    "Patthar Samajh Kar Paanv Se Thhokar Laga Di,\n" +
                            "Afsos Teri Aankh Ne Parkha Nahi Mujhe,\n" +
                            "Kya-Kya Umeedein Bandh Kar Aaya Tha Samne,\n" +
                            "Usne Toh Aankh Bhar Ke Bhi Dekha Nahi Mujhe.");

            setSadShayariJson("000016",
                    "Kuchh Unki Wafaaon Ne Loota,\n" +
                            "Kuchh Unki Inayat Maar Gayi,\n" +
                            "Hum Raaz-e-Mohabbat Kah Na Sake,\n" +
                            "Chup Rahne Ki Aadat Maar Gayi.");

            setSadShayariJson("000017",
                    "Na Kisi Ke Dil Ki Hoon Aarzoo,\n" +
                            "Na Kisi Najar Ki Hoon Justjoo,\n" +
                            "Main Woh Phool Hoon Jo Udaas Hai,\n" +
                            "Na Bahaar Aaye Toh Kya Karoon.");

            setSadShayariJson("000018",
                    "Anjaam-e-Wafa Ye Hai Jisne Bhi Mohabbat Ki,\n" +
                            "Marne Ki Duaa Maangi Jeene Ki Sazaa Payi.");

            setSadShayariJson("000019",
                    "Nafratein Lakh Mili Par Mohabbat Na Mili,\n" +
                            "Zindagi Beet Gayi Magar Rahat Na Mili,\n" +
                            "Teri Mehfil Mein Har Ek Ko Hansta Dekha,\n" +
                            "Ek Main Tha Jise Hasne Ki Ijazat Na Mili.");

            setSadShayariJson("000020",
                    "Barson Gujar Gaye Humne RoKar Nahi Dekha,\n" +
                            "Aankhon Mein Neend Thi Magar SoKar Nahi Dekha,\n" +
                            "Woh Kya Jaane Dard-e-Mohabbat Kya Hai,\n" +
                            "Jisne Kabhi Kisi Ka Hokar Nahi Dekha.");

            setSadShayariJson("000021",
                    "Iss Mohabbat Ki Kitaab Ke,\n" +
                            "Bas Do Hi Sabak Yaad Huye,\n" +
                            "Kuchh Tum Jaise Aabaad Huye,\n" +
                            "Kuchh Hum Jaise Barbaad Huye.");

            setSadShayariJson("000022",
                    "Ab TumKo Bhool Jaane Ki Koshish Karenge Hum,\n" +
                            "Tum Se Bhi Ho Sake Toh Na Aana Khayal Mein.");

            setSadShayariJson("000023",
                    "Gulshan Ki Baharon Pe Sar-e-Shaam Likha Hai,\n" +
                            "Phir Uss Ne Kitabon Pe Mera Naam Likha Hai,\n" +
                            "Yeh Dard Isee Tarah Meri Duniya Mein Rahega,\n" +
                            "Kuchh Soch Ke Uss Ne Mera Anjaam Likha Hai.");

            setSadShayariJson("000024",
                    "Aapke Bin Tootkar Bikhar Jayenge,\n" +
                            "Mil Jayenge Aap To Gulashan Ki Tarah Khil Jaayenge,\n" +
                            "Agar Na Mile Aap To Jeete Ji Mar Jaayenge,\n" +
                            "Pa Liya Jo Aapko To Mar Kar Bhi Jee Jaayenge.");

            setSadShayariJson("000025",
                    "Mohabbat Ke Bhi Kuchh Andaz Hote Hain,\n" +
                            "Jagti Aankhon Ke Bhi Kuchh Khwab Hote Hain,\n" +
                            "Jaruri Nahi Ke Gham Mein Aansoo Hi Niklein,\n" +
                            "Muskurati Aankhon Mein Bhi Sailab Hote Hain.");

            setSadShayariJson("000026",
                    "Kahin Kisi Roj Yun Bhi Hota,\n" +
                            "Jo Humari Haalat Hai Wo Tumhari Hoti,\n" +
                            "Jo Raat Humne Gujari Tadap Kar,\n" +
                            "Wo Raat Tumne Bhi Gujari Hoti.");

            setSadShayariJson("000027",
                    "Gujarish Hamari Woh Maan Na Sake,\n" +
                            "Majburi Hamari Woh Jaan Na Sake,\n" +
                            "Kehte Hain Marne Ke Baad Bhi Yaad Rakhenge,\n" +
                            "Jeete Ji Jo Hame Pehchan Na Sake.");

            setSadShayariJson("000028",
                    "Meri Chahat Ne Use Khushi De Di,\n" +
                            "Badle Mein Usne Mujhe Khamoshi De Di,\n" +
                            "Khuda Se Dua Maangi Marne Ki To,\n" +
                            "Usne Bhi Tadapne Ke Liye Zindagi De Di.");

            setSadShayariJson("000029",
                    "Iss Dil Ko Kisi Ki Aahat Ki Aas Rehti Hai,\n" +
                            "Nigaah Ko Kisi Surat Ki Talash Rehti Hai,\n" +
                            "Tere Bina Zindagi Me Kami To Nahi,\n" +
                            "Phir Bhi Tere Bina Zindagi Udhas Rehti Hai.");

            setSadShayariJson("000030",
                    "Ye Mat Soch Ke Main Tujhe Bhula Nahi Sakta,\n" +
                            "Teri Yaadon Ke Panne Main Jala Nahi Sakta,\n" +
                            "Kashmkash Ye Hai Ke Khud Ko Marna Hoga,\n" +
                            "Aur Main Apni Khatir Tujhe Rula Nahi Sakta.");

            setSadShayariJson("000031",
                    "Aagosh Me Apne Chhupa Le Mujhe Koi,\n" +
                            "Tanha Hu Tadapne Se Bacha Le Mujhe Koi,\n" +
                            "Sookhi Hai Badi Der Se Palkon Ki Jubaan,\n" +
                            "Bas Aaj To Jee Bhar Ke Rula De Mujhe Koi.");

            setSadShayariJson("000032",
                    "Toot Jaye Khwab To Koi Aas Kya Rakhna,\n" +
                            "Palko Ke Bheegne Ka Hisaab Kya Rakhna,\n" +
                            "Bas Isliye Muskura Dete Hain Hum,\n" +
                            "Apne Dukh Se Kisi Ko Udaas Kya Rakhna.");

            setSadShayariJson("000033",
                    "Zamane Se Suna Tha Ki Mohabbat Haar Jati Hai,\n" +
                            "Jo Chahat Ek Taraf Ho Wo Chahat Haar Jati Hai,\n" +
                            "Kahin Dua Ka Ek Lafz Asar Kar Jata Hai,\n" +
                            "Aur Kahin Barson Ki Ibadat Bhi Haar Jati Hai.");

            setSadShayariJson("000034",
                    "Dil Ameer Tha Magar Muqaddar Gareeb Tha,\n" +
                            "Mil Kar Bichhadna To Humara Naseeb Tha,\n" +
                            "Hum Chaah Kar Bhi Kuchh Kar Na Sake,\n" +
                            "Ghar Jalta Raha Aur Samundar Qareeb Tha.");

            setSadShayariJson("000035",
                    "Kisi Toote Hue Dil Ki Aawaaj Mujhe Kahiye,\n" +
                            "Taar Jiske Sab Tute Ho Wo Saaz Mujhe Kahiye\n" +
                            "Main Kaun Hoon Aur Kiske Liye Zindaa Hoon,\n" +
                            "Main Khud Nahi Samajha Wo Raaz Mujhe Kahiye");

            setSadShayariJson("000036",
                    "Rone Ki Saza Na Ye, Rulaane Ki Saza Hai,\n" +
                            "Ye Dard Mohabbat Ko, Nibhane Ki Saza Hai,\n" +
                            "Hansti Huyi Aankhon Mein, Aa Jate Hain Aansoo,\n" +
                            "Ye Uss Shakhs Se, Dil Lagane Ki Saza Hai.");

            setSadShayariJson("000037",
                    "Aagosh Me Apne Chhupa Le Mujhe Koi,\n" +
                            "Tanha Hu Tadapne Se Bacha Le Mujhe Koi,\n" +
                            "Sookhi Hai Badi Der Se Palkon Ki Jubaan,\n" +
                            "Bas Aaj To Jee Bhar Ke Rula De Mujhe Koi.");

            setSadShayariJson("000038",
                    "Sheesha Toote Aur Bikhar Jaye Toh Behtar Hai,\n" +
                            "Daraarein Na Jeene Deti Hain Na Marne Deti Hain.");

            setSadShayariJson("000039",
                    "Waqt Khushi Se Katne Ka Mashwara Dete Huye,\n" +
                            "Ro Pada Woh Khud Hi Mujhe Haunsla Dete Huye.");

            setSadShayariJson("000040",
                    "Tere Dil Ke Kareeb Aana Chahta Hoon Main,\n" +
                            "Tujhko Nahi Aur Ab Khona Chahta Hoon Main,\n" +
                            "Akele Iss Tanhayi Ka Dard Bardast Nahi Hota,\n" +
                            "Tu Ek Bar Aaja Tujhse Lipat Kar Rona Chahta Hoon Main.");

            setSadShayariJson("000041",
                    "Wo Raat Dard Aur Sitam Ki Raat Hogi,\n" +
                            "Jis Raat Rukhsat Unki Barat Hogi,\n" +
                            "Uth Jata Hun Main Ye Sochkar Neend Se Aksar,\n" +
                            "Ki Ek Gair Ki Bahon Me Meri Sari Kaynaat Hogi.");

            setSadShayariJson("000042",
                    "Dil Ka Dard Hamara Bhi Ab ,\n" +
                            "Sari Hadein Aar Paar Kar Raha Hai,\n" +
                            "Dilbar Bhi Kitna Sangdil Hai,\n" +
                            "Ek Jurm Baar Baar Kar Raha Hai.");

            setSadShayariJson("000043",
                    "Pyar Kiya To Unki Mahobbat Najar Aayi, \n" +
                            "Dard Hua To Palke Unki Bhar Aayi,\n" +
                            "Do Dilon Ki Dhadkan Me Ek Baat Nazar Aayi, \n" +
                            "Dil To Unka Dhadka Par Aawaj Is Dil Se Aayi.");

            setSadShayariJson("000044",
                    "Wo Nikal Gaye Mere Raste Se Is Kadar Ki,\n" +
                            "Jaise Ki Wo Mujhe Pahchante Nahi,\n" +
                            "Kitne Jakhm Khaye Hain Mere Is Dil Ne,\n" +
                            "Fir Bhi Hum Us Bewafa Ko Bewafa Mante Hi Nahi.");

            setSadShayariJson("000045",
                    "Unki Mohabbat Ke Abhi Nishan Baaki Hain,\n" +
                            "Naam Lab Par Hai Aur Jaan Abhi Baaki Hai,\n" +
                            "Kya Hua Agar Dekh Kar Muhn Fer Lete Hain,\n" +
                            "Tasalli Hai Ki Shakl Ki Pahchaan Baki Hai.");

            setSadShayariJson("000046",
                    "Majburi Mein Jab Koi Juda Hota Hai,\n" +
                            "Zaruri Nahi Ke Wo Bewafa Hota Hai,\n" +
                            "De Kar Wo Aapki Aankho Me Aansu,\n" +
                            "Akele Me Aapse Bhi Zyada Rota Hai.");

            setSadShayariJson("000047",
                    "Har Dhadkan Me Ek Raaz Hota Hai,\n" +
                            "Baat Ko Batane Ka Bhi Ek Andaaz Hota Hai,\n" +
                            "Jab Tak Na Lage Thhokar Bewafai Ki,\n" +
                            "Har Kisi Ko Apne Pyar Par Naaj Hota Hai.");

            setSadShayariJson("000048",
                    "Agar Duniya Me Jeene Ki Chahat Na Hoti,\n" +
                            "To Khuda Ne Mohabbat Banayi Na Hoti,\n" +
                            "Iss Tarah Log Marne Ki Aarzoo Na Karte,\n" +
                            "Agar Mohabbat Me Kisi Ki Bewafai Na Hoti.");

            setSadShayariJson("000049",
                    "Farz Tha Jo Mera Nibha Diya Maine.\n" +
                            "Usne Manga Wo Sab De Diya Maine,\n" +
                            "Wo Sunke Gairon Ki Baaten Bewafa Ho Gayi,\n" +
                            "Samajh Ke Khwaab Usko Akhir Bhula Diya Maine.");

            setSadShayariJson("000050",
                    "Na Milta Gham To Barbadi Ke Afsane Kahan Jaate,\n" +
                            "Duniya Agar Hoti Chaman To Veeraane Kahan Jaate,\n" +
                            "Chalo Accha Hua Apno Me Koi Gair To Nikla,\n" +
                            "Sabhi Agar Apne Hote To Begane Kahan Jaate,");

            setSadShayariJson("000051",
                    "Kyun Wo Ruthe Iss Kadar Ke Manaya Na Gaya,\n" +
                            "Dur Itne Ho Gaye Ke Paas Bulaya Na Gaya,\n" +
                            "Dil To Dil Tha Koi Samandar Ka Saahil Nahi,\n" +
                            "Likh Diya Jo Naam Wo Fir Mitaya Na Gaya.");

            setSadShayariJson("000052",
                    "Nazar andaz kaise kare aapko,\n" +
                            "Nazron me bithaya hai jo aapko,\n" +
                            "Yaad aane par roye bhi to kaise,\n" +
                            "Darte hai jhuki jo palke to chubhengi aapko.");

            setSadShayariJson("000053",
                    "Ek bewafa jisne tanhai ka manjar nahi dekha\n" +
                            "Afsos mere dil ke andar nahi dekha \n" +
                            "Mujhe dekhkr usne patthar bata diya\n" +
                            "Me mom tha chukar nahi dekha");


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
