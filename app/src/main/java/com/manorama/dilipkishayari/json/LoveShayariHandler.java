package com.manorama.dilipkishayari.json;

import com.manorama.dilipkishayari.utilities.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LoveShayariHandler {

    public static String JSON_TITLE = "JSON_TITLE";
    public static String JSON_MESSAGE = "JSON_MESSAGE";
    public static String JSON_ID = "JSON_ID";
    public static String JSON_LOVE_ID = "LOVE_ID_";
    public static String JSON_LOVE_TITLE = "Love Shayari";
    private JSONObject loveJson;
    private JSONArray loveJsonArray;

    public void createLoveJson() {
        loveJsonArray = null;
        loveJsonArray = new JSONArray();
        try {
            setLoveShayariJson("000001",
                    "Mohabbat Ki Zanjeer Se Dar Lagta Hai\n" +
                            "Kuch Apni Taqdeer Se Dar Lagta Hai\n" +
                            "Jo Mujhe Tujh Se Juda Karti Hai,\n" +
                            "Haath Ki Uss Lakeer Se Dar Lagta hai.");

            setLoveShayariJson("000002",
                    "Teri Dhadkan Hi Zindagi Ka Kissa Hai Mera, \n" +
                            "Tu Zindagi Ka Ek Aham Hissa Hai Mera, \n" +
                            "Meri Mohabbat Tujhse Sirf Lafzo Ki Nahi Hai, \n" +
                            "Teri Rooh Se Rooh Tak Ka Rishta Hai Mera. ");

            setLoveShayariJson("000003",
                    "Lamhe Ye Suhaane Saath Ho Na Ho, \n" +
                            "Kal Mein Aaj Jaisi Baat Ho Na Ho, \n" +
                            "Aapse Pyar Hamesha Dil Mein Rahega, \n" +
                            "Chahe Poori Umr Mulakat Ho Na Ho.");

            setLoveShayariJson("000004",
                    "Kisi Mod Par Tera Deedar Ho Jaye, \n" +
                            "Kaash Tujhe Mujh Par Aitbaar Ho Jaye, \n" +
                            "Teri Palkein Jhukein Aur Ikraar Ho Jaye, \n" +
                            "Kaash Tujhe Bhi Mujhse Pyaar Ho Jaye.");

            setLoveShayariJson("000005",
                    "Kyun Kisi Ajnabi Se Itna Pyar Ho Jata Hai, \n" +
                            "Ek Din Ka Bhi Intezaar Dushwar Ho Jata Hai, \n" +
                            "Lagne Lagte Hain Apne Bhi Paraaye, \n" +
                            "Jab Ek Ajnabi Par Aitbaar Ho Jata Hai.");
            setLoveShayariJson("000006",
                    "Dooriyan bahut hai magar itna samajh lo.\n" +
                            "Paas rehkar hi koi khas nahi hota.\n" +
                            "Tum iss kadar paas ho mere dil ke.\n" +
                            "Mujhe dooriyon ka Ehsaas nahi hota.");

            setLoveShayariJson("000007",
                    "Safar Wahi Tak Hain Jaha Tak Tum Ho,\n" +
                            "Nazar Wahi Tak Hain Jaha Tak Tum Ho,\n" +
                            "Phool Bahut Dekhe Hain Is Gulshan Mein,\n" +
                            "Khusbu Wahi Tak Hain Jaha Tak Tum Ho.");

            setLoveShayariJson("000008",
                    "Chupke se dhadkan me utar jaayenge,\n" +
                            "Raahen Ulfat me had se guzar jaayenge,\n" +
                            "Aap jo hamen itna chahenge,\n" +
                            "Hum to aapki saanson me pighal jaayenge.");

            setLoveShayariJson("000009",
                    "Har kadam Har pal saath hai,\n" +
                            "Dur hokar bhi hum aapke pass hai,\n" +
                            "Aapko ho na ho par hume aapki kasam,\n" +
                            "Aapki kami ka har pal ehsaas hai.");

            setLoveShayariJson("000010",
                    "Aankho ki gehrai ko samajh nahi sakte,\n" +
                            "Honto se kuch keh nahi sakte,\n" +
                            "Kaise baya kare hum aapko yeh dil ka haal ki,\n" +
                            "Tumhi ho jiske bageir hum reh nahi sakte.");

            setLoveShayariJson("000011",
                    "Khoya itna kuch ki hume paana na aaya,\n" +
                            "Pyar kar to liya par jatana na aaya.\n" +
                            "Aa gaye tum is dil mein pehli hi nazar mei,\n" +
                            "Bas hame aaoke dil mein samana na aaya.");

            setLoveShayariJson("000012",
                    "Jis Din Sapno Me Unka Didaar Ho Jata Hai,\n" +
                            "Us Raat Sona Bhi Duswaar Ho Jata Hai,\n" +
                            "Marta Hai Koi Hum Par Bhi,\n" +
                            "Ye Soch Kar Apne Aap Se Pyaar Ho Jata Hai");

            setLoveShayariJson("000013",
                    "Chehre pe mere zulfo ko phailao kisi din,\n" +
                            "Kyu roz sirf garajate ho,\nBaras jao kisi din,\n" +
                            "Khushbu ki tarah guzro mere dil ki gali se,\n" +
                            "Phulon ki tarah mujpe bikhar jao kisi din.");

            setLoveShayariJson("000014",
                    "Na gulfaam chahiye,\nNa salaam chahiye,\n" +
                            "Na mubarak ka koi paigam chahiye,\n" +
                            "Jisko pee ker hosh urr jayain,\n" +
                            "Labon ko aisa.. jaam chahiye!!");

            setLoveShayariJson("000015",
                    "Tujhe palko pe bithane ko jee chahta hai\n" +
                            "Teri baho se lipatne ko jee chahta hai,\n" +
                            "Khubsurti ki intehaa hain tu,\n" +
                            "Tuje zindagi me basane ko jee chahta hai.");

            setLoveShayariJson("000016",
                    "Zindagi Me Apki ahmiyat Ham Apko Bata Nahi Sakte\n" +
                            "Dil Me Apki Jagah Ham Apko Dikha Nahi Sakte\n" +
                            "Kuch Rishtey Bhut Anmol Hote Hai\n" +
                            "Isse Zyada Ham Apko Samjha Nahi Sakte");

            setLoveShayariJson("000017",
                    "Zindagi Me Apki ahmiyat Ham Apko Bata Nahi Sakte\n" +
                            "Dil Me Apki Jagah Ham Apko Dikha Nahi Sakte\n" +
                            "Kuch Rishtey Bhut Anmol Hote Hai\n" +
                            "Isse Zyada Ham Apko Samjha Nahi Sakte");

            setLoveShayariJson("000018",
                    "Kaash Ik Din Aisa Bhi Aaye Hum Teri Bahon Me Sama Jayen\n" +
                            "Sirf Hum Ho Aur Tum Ho Aur Waqt Hi Thhar Jaye.");

            setLoveShayariJson("000019",
                    "Apni Har Saans Me Aabaad Kiya Hai Tumko,\n" +
                            "Ai Meri Jana Bahut Yaad Kiya Hai Tumko,\n" +
                            "Meri Zindagi Me Tum Nahin To Kuch Bhi Nahi,\n" +
                            "Apni Zindagi Se Badkar Pyar Kiya Hai Tumko.");

            setLoveShayariJson("000020",
                    "Wo Pila Kar Jaam Labon Se Apni Mohabbat Ka,\n" +
                            "Ab Kahte Hain Nashe Ki Adat Achhi Nahi Hoti.\n\n\n" +
                            "Hanste Huye Tujhko Jab Bhi Dekhta Hu Main,\n" +
                            "Tu Hi Duniya Hai Meri Yahi Sochta Hun Main.");

            setLoveShayariJson("000021",
                    "Meri Har Khushi Har Baat Teri Hai,\n" +
                            "Meri Sanso Me Basi Wo Mahak Teri Hai,\n" +
                            "Ik Pal Bhi Nahi Rah Sakte Bin Tere,\n" +
                            "Dhadkano Se Nikalti Har Abaz Teri Hai.");

            setLoveShayariJson("000022",
                    "Tere Sare Gamo Ko Main Chura Lun,\n" +
                            "Zindagi Ab Teri Chahat Me Sawar Lun,\n" +
                            "Mulakat Ho Tujhse Is Tarah,\n" +
                            "Poori Umr Bas Ek Mulakaat Me Gujar Lun.");

            setLoveShayariJson("000023",
                    "Tujhe Dekhu To Sara Jaha Rangeen Nazar Aata Hai,\n" +
                            "Tere Bina Dil Ko Chain Kaha Aata Hai,\n" +
                            "Tum Hi Ho Mere Dil Ki Dharkan,\n" +
                            "Tere Bina Ye Sansar Suna Suna Nazar Aata Hai.");

            setLoveShayariJson("000024",
                    "Dil Ki Yaado Me Sawaru Tumhen,\n" +
                            "Tum Dikhe To Aankhon Me Utarun,\n" +
                            "Tere Naam Ko Labon Par Aise Sajaun,\n" +
                            "So Jaun To Khwabo Me Pukarun Tumhe.");

            setLoveShayariJson("000025",
                    "Tujhe Dekhu To Sara Jaha Rangeen Nazar Aata Hai,\n" +
                            "Tere Bina Dil Ko Chain Kaha Aata Hai,\n" +
                            "Tum Hi Ho Mere Dil Ki Dharkan,\n" +
                            "Tere Bina Ye Sansar Suna Suna Nazar Aata Hai.");

            setLoveShayariJson("000026",
                    "Tumhare Pyar Ki Dastaan Humne Apne Dil Me Likhi Hai,\n" +
                            "Na Thodi Na Bahut Be-Hisaab Likhi Hai,\n" +
                            "Kiya Karo Kabhi Hume Bhi Apni Duaon Me Shamil,\n" +
                            "Humne Apni Har Ek Saans Tumhare Naam Likhi Hai.");

            setLoveShayariJson("000027",
                    "Deewana Hun Tera Mujhe Inkaar Nahi,\n" +
                            "Kaise Keh Dun Ki Mujhe Tumse Pyar Nahi,\n" +
                            "Kuch Sararat To Teri Nigahon Mein Bhi Thi,\n" +
                            "Mein Akela Hi To Iska Ghunegaar Nahi.");

            setLoveShayariJson("000028",
                    "Ye Halat Hamari Ho Gayi Tumse Milne Ke Baad\n" +
                            "Zindagi Pyari Ho Gayi Hai Tumse Milne Ke Baad\n" +
                            "Her Cheez Me Ek Ajab Rang Hai Mohabbat Ka\n" +
                            "Her Cheez Pyari Ho Gayi Hai Tumse Milne Ke Baad…");

            setLoveShayariJson("000029",
                    "Tujhe Dekhu To Sara Jaha Rangeen Nazar Aata Hai,\n" +
                            "Tere Bina Dil Ko Chain Kaha Aata Hai,\n" +
                            "Tum Hi Ho Mere Dil Ki Dharkan,\n" +
                            "Tere Bina Ye Sansar Suna Suna Nazar Aata Hai.");

            setLoveShayariJson("000030",
                    "Chhu Jaate Ho Mujhe Har Roj Ek Naya Khwaab Sa Bankar,\n" +
                            "Yeh Duniya To Khamkha Kahti Hai Ke Tum Mere Kareeb Nahi.\n\n\n" +
                            "Uski Mohabbat Laakh Chhupayi Zamaane Se Maine,\n" +
                            "Magar Aankhon Mein Uske Aks Ko Chhupa Na Saka.");

            setLoveShayariJson("000031",
                    "Ek Hasrat Thi Ki Kabhi Wo Bhi Hume Manaye,\n" +
                            "Par Ye Kambakht Dil Kabhi Unse Rutha Hi Nahi.\n\n\n" +
                            "Hota Agar Mumkin, Tujhe Sanse Bana Kar Rakhte,\n" +
                            "Tu Ruk Jaye To Main Nahi, Main Mar Jaun To Main Nahi.");

            setLoveShayariJson("000032",
                    "Haathon Se Yun Apne Chehre Ko Chhupate Kyu Ho,\n" +
                            "Mujh Se Sharmaate Ho Toh Saamne Aate Kyu Ho,\n" +
                            "Tum Bhi Meri Tarah Kar Lo Iqraar-e-Wafaa Ab,\n" +
                            "Mohabbat Karte Ho To Phir Pyar Chhupate Kyu Ho?");

            setLoveShayariJson("000033",
                    "Mere Wajood Mein Kash Tu Samaa Jaye,\n" +
                            "Main Dekhun Aaina To Aks Tera Nazar Aaye,\n" +
                            "Tu Jab Bhi Ho Samne Waqt Ye Thehar Jaye,\n" +
                            "Meri Puri Umar Tujhe Dekh Kar Beet Jaye.");

            setLoveShayariJson("000034",
                    "Itna Bhi Na Chaho Mujhe\n" +
                            "Ke Main Ek Pal Tumse Door Reh Na Sakun\n" +
                            "Yun Na Pyaar Se Dekho Mujhe\n" +
                            "Ke Main Dil Ki Baatein Tumse Keh Na Sakun.");

            setLoveShayariJson("000035",
                    "Tere Bina Toot Kar Bikhar Jayenge Hum Sanam,\n" +
                            "Tum Mil Gaye To Gulshan Ki Tarah Khil Jayenge.\n" +
                            "Tum Na Mile To Jeete Jee Hi Mar Jayenge,\n" +
                            "Tumhen Jo Pa Liya To Mar Kar Bhi Jee Jayenge.");

            setLoveShayariJson("000036",
                    "Tujhe Bhoolna Bhi Chahun To Bhulaaun Kaise,\n" +
                            "Teri Yaad Se Apna Daaman Chhudaaun Kaise,\n" +
                            "Meri Har Khushi Har Muskaan Mohtaaz Hai Teri,\n" +
                            "Magar Tujhko Iska Ehsaas Dilaaun Kaise..");

            setLoveShayariJson("000037",
                    "Kuch To Baat Hai Tujhme Jo Tujhe Yaad Krne Ko Ji Chahta Hai\n" +
                            "Kuch Khas Hai Jo Tujhe Bahon Mein Bharne Ko Ji Chahta Hai\n" +
                            "Hum Tere Kareeb Hain Ya Nahi Ye Jante Nahi Hain Magar Ai Sanam,\n" +
                            "Phir Bhi Mohabbat Mein Hadd Se Guzarne Ko Ji Chahta Hain.");

            setLoveShayariJson("000038",
                    "Dil Ki Kitaab Me Gulab Unka Tha,\n" +
                            "Raat Ki Neendo Me Khwab Unka Tha,\n" +
                            "Kitna Pyar Karte Ho Jab Humne Puchha,\n" +
                            "Mar Jayenge Tumhare Bina Ye Jawab Unka Tha.");

            setLoveShayariJson("000039",
                    "Maine Kaha Wo Ajnabi Hai\n" +
                            "Dil Ne Kaha Ye Dil Ki Lagi Hai\n" +
                            "Main Ne Kaha Wo Sapna Hai\n" +
                            "Dil Ne Kaha Phir Bhi Apna Hai");

            setLoveShayariJson("000040",
                    "Amal Se Bhi Manga Wafa Se Bhi Manga, \n" +
                            "Tujhe Maine Teri Razaa Se Bhi Manga, \n" +
                            "Na Kuchh Ho Saka Toh Dua Se Bhi Manga, \n" +
                            "Kasam Hai Khuda Ki Khuda Se Bhi Manga.");

            setLoveShayariJson("000041",
                    "Pyar Dil Mein Jaga Baithhe Jo Hoga Dekha Jayega, \n" +
                            "Tumhein Apna Bana Baithhe Jo Hoga Dekha Jayega, \n" +
                            "Humein Maloom Tha Duniya Humein Badnaam Kar Degi, \n" +
                            "Lo Ab Parda Hataa Baithhe Jo Hoga Dekha Jayega.");

            setLoveShayariJson("000042",
                    "Chalo Mana Ki Humein Pyar Ka Izhaar Karna Nahi Aata, \n" +
                            "Jazbat Na Samajh Sako Itne Nadaan Toh Tum Bhi Nahi.");

            setLoveShayariJson("000043",
                    "Dil Hi Dil Mein Tumhein Pyar Karte Hain, \n" +
                            "Chup-Chap Mohabbat Ka Izhaar Karte Hain, \n" +
                            "Ye Jante Huye Bhi Aap Meri Kismat Mein Nahi, \n" +
                            "Par Paane Ki Koshish Baar-Baar Karte Hain.");

            setLoveShayariJson("000044",
                    "Pyar Ka Badla Kabhi Chuka Na Sakenge, \n" +
                            "Chaah Kar Bhi Aapko Bhula Na Sakenge, \n" +
                            "Ek Tum Hi Ho Mere Labon Ki Hansi, \n" +
                            "Tumse Bichhade Toh Fir Muskura Na Sakenge.");

            setLoveShayariJson("000045",
                    "Tere Shahar Mein Aake Benaam Se Ho Gaye, \n" +
                            "Teri Chahat Mein Apni Muskaan Hi Kho Gaye, \n" +
                            "Jo Doobe Teri Mohabbat Mein To Aise Doobe, \n" +
                            "Ke Jaise Teri Aashiqi Ke Gulam Hi Ho Gaye.");

            setLoveShayariJson("000046",
                    "Najron Ko Tere Pyar Se Inkar Nahi Hai, \n" +
                            "Ab Mujhe Kisi Aur Ka Intezar Nahi Hai, \n" +
                            "Khamosh Agar Hoon Main To Ye Wajood Hai Mera, \n" +
                            "Tum Ye Na Samajhna Ki Tumse Pyar Nahi Hai.");

            setLoveShayariJson("000047",
                    "Din Raat Hum Har Kaam Likh Lete Hain, \n" +
                            "Teri Yaad Me Gujri Har Shaam Likh Lete Hain, \n" +
                            "Tujhe Dekhe Bina Ek Pal Bhi Kat-ta Nahi, \n" +
                            "Akele Me Hatheli Pe Tera Naam Likh Lete Hain.");

            setLoveShayariJson("000048",
                    "Khamoshiyon Se Mil Rahe Khamoshiyon Ke Jawaab, \n" +
                            "Ab Kaise Kahun Unse Meri Baat Nahi Hoti.\n\n\n+" +
                            "Gila Bhi Tujhse Bahut Hai, Magar Mohabbat Bhi, \n" +
                            "Wo Baat Apni Jagah Hai Ye Baat Apni Jagah.");

            setLoveShayariJson("000049",
                    "Badalna Nahi Aata Humein Mausam Ki Tarah, \n" +
                            "Har Ek Rut Mein Tera Intezaar Karte Hain, \n" +
                            "Na Tum Samjh Sakoge Jise Qayaamat Tak, \n" +
                            "Kasam Tumhari Tumhein Itna Pyaar Karte Hain.");

            setLoveShayariJson("000050",
                    "Tujhe Bhool Kar Bhi Na Bhool Payenge Hum, \n" +
                            "Bas Yahi Ek Vaada Nibha Jayenge Hum, \n" +
                            "Mita Denge Khud Ko Iss Jahan Se Lekin, \n" +
                            "Tera Naam Dil Se Na Mita Payenge Hum.");
        } catch (JSONException jex) {
            jex.printStackTrace();
        }
    }

    public void setLoveShayariJson(String jsonId, String jsonMessage) throws JSONException {
        loveJson = new JSONObject();
        loveJson.put(JSON_ID, JSON_LOVE_ID + jsonId);
        loveJson.put(JSON_TITLE, JSON_LOVE_TITLE);
        loveJson.put(JSON_MESSAGE, jsonMessage);
        loveJsonArray.put(loveJson);
    }

    public JSONArray getLoveJsonArray() {
        return loveJsonArray;
    }

    public void setLoveJsonArray(JSONArray loveJsonArray) {
        this.loveJsonArray = loveJsonArray;
    }
}
