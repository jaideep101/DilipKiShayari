package com.manorama.dilipkishayari.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WishesShayariHandler {

    public static String JSON_TITLE = "JSON_TITLE";
    public static String JSON_MESSAGE = "JSON_MESSAGE";
    public static String JSON_ID = "JSON_ID";
    public static String JSON_WISHES_ID = "WISHES_ID_";
    public static String JSON_WISHES_TITLE = "Wishes Shayari";
    private JSONObject wishesJson;
    private static JSONArray wishesJsonArray;

    public void createWishesJson() {
        wishesJsonArray = new JSONArray();

        try {
            setWishesShayariJson("000001",
                    "Sab ke hatho mein kuch lakire hai,\n" +
                            "Banti jinse sab ki takdire hai.\n" +
                            "Dua hai apke hatho mein wo lakire kuch khas ho,\n" +
                            "Aur duniya ki saari khushiya AAPKE paas ho.");

            setWishesShayariJson("000002",
                    "Har phool apko armaan de,\n" +
                            "Har subah aapko salam de,\n" +
                            "Hum dua karte hain,\n" +
                            "Aapka ek aansu bhi agar nikle,\n" +
                            "To khuda aapko us se dugani muskaan de..");

            setWishesShayariJson("000003",
                    "Har niyamat har khushi apki ho,\n" +
                            "Mahak uthe wo mahfil jisme hansi apki ho,\n" +
                            "Koi bhi lamha ap udas na ho,\n" +
                            "Hhuda kare Zannat jaisi zindagi apki ho.");

            setWishesShayariJson("000004",
                    "Zindagi Ko Khush Rahkar Jio\n" +
                            "Kyoki Roz Sham Sirf\n" +
                            "Suraj He Nahi Dhalta\n" +
                            "Aapki Anmol Zindagi Bhi Dhalti Hai!");

            setWishesShayariJson("000005",
                    "Chhoti Chhoti Khushiya He To\n" +
                            "Jeene Ka Sahara Banti Hai,\n" +
                            "Khuwaisho Ka Kya Hai,\n" +
                            "Wo To Pal-Pal Badalti Hai!!");

            setWishesShayariJson("000006",
                    "Sraddha Gyan Deti Hai,\n" +
                            "Namrita Maan Deti Hai,\n" +
                            "Aur Yogyata Sthan Deti Hai,\n" +
                            "Aur Ye Teeno Mil Jaye To Viyakti Ko\n" +
                            "Har Jagah Samman Deti Hai!!");

            setWishesShayariJson("000007",
                    "Zindagi Tasveer Bhi Hai Aur Takdeer Bhi,\n" +
                            "Fark To Sirf Rango Ka Hai,\n" +
                            "Manchahe Rangon Se Bane To Tasveer, Aur\n" +
                            "Anchahe Rango Se Bane To Takdeer.");

            setWishesShayariJson("000008",
                    "Aankho Ko Ashq Ka Pata Na Chalta,\n" +
                            "Dil Ko Dard Ka Ehsaas Na Hota,\n" +
                            "Kitna Haseen Hota Zindagi Ka Safar,\n" +
                            "Agar Milkar Kabhi Bchadna Na Hota.");

            setWishesShayariJson("000009",
                    "Dard Kaisa Bhi Ho Aankh Nam Na Karo,\n" +
                            "Raat Kaali Sahi Lekin Gham Na Karo,\n" +
                            "Ek Sitara Ban Jagmagate Raho,\n" +
                            "Zindagi Me Yun Hi Sada Muskurate Raho");

            setWishesShayariJson("000010",
                    "Chehre Ki Hansi Se Gham Ko Bhula Do,\n" +
                            "Kam Bolo Par Sb Kuch Bata Do,\n" +
                            "Khud Na Rutho Par Sabko Hansa Do,\n" +
                            "Yahi Raaz Hai Zindagi Ka Jio Aur Jeena Sikha Do.");

            setWishesShayariJson("000011",
                    "Phool Banke Khushbu Failna Hi Hai Zindagi,\n" +
                            "Har Dard Ko Hansi Me Chhupa Lena Hi Hai Zindagi,\n" +
                            "Zindagi Me Jeet Mili To Kya Hua,\n" +
                            "Haar Kar Bhi Khushi Jatana Hi Hai Zindagi.");

            setWishesShayariJson("000012",
                    "Karne Lage Hisab -Ai-Zindagi To Ro Baithe,\n" +
                            "Ginte Rahe Salon Ko Aur Lamhon Ko Kho Baithe.\n\n\n" +
                            "Jee Rahe Hain Teri Sharto Ke Mutaabiq-E-Zindagi,\n" +
                            "Daur Aaega Kabhi, Hamari Farmaisho Ka Bhi.");

            setWishesShayariJson("000013",
                    "Zindagi Ke Raaz Ko Raaz Rahne Do,\n" +
                            "Agar Hai Koi Aitraz To Rahne Do,\n" +
                            "Par Jab Dil Kare Hame Yaad Karne Ko,\n" +
                            "To Use Ye Mat Kahna Ke Aaj Rahne Do.");

            setWishesShayariJson("000014",
                    "Roothi Si Zindagiko Manana To Ataa Hai,\n" +
                            "Ruthe Huye Logon Ko Hasana To Ataa Hai,\n" +
                            "Kya Huaa Jo Na Bus Sake Kisi Ke Dil Me,\n" +
                            "Logo Ko Apne Dil Me Basana To Ataa Hai.");

            setWishesShayariJson("000015",
                    "Bahut Kuchh Sikha Jaati Hai Zindagi,\n" +
                            "Hansa Ke Rula Jaati Hai Zindagi,\n" +
                            "Jee Sako Jitna Utna Jee Lo Dosto,\n" +
                            "Kyoki Bahut Kuchh Baaki Rah Jaata Hai,\n" +
                            "Aur Khatm Ho Jaati Hain Zindagi.");

            setWishesShayariJson("000016",
                    "Deep Jale To Roshan Aapka Jahan Ho,\n" +
                            "Poora Aapka Har Ek Araman Ho,\n" +
                            "Maa Laxmi Jee Ki Krpa Bani Rahe Aap Par,\n" +
                            "Is Dhanteras Par Aap Bahut Dhanvaan Hon.");

            setWishesShayariJson("000017",
                    "Har Lamha Aapke Hothon Pe Muskan Rahe,\n" +
                            "Har Gam Se Aap Anjaan Rahen,\n" +
                            "Jiske Saath Mahak Uthe Aapki Zindagi,\n" +
                            "Hamesha Aapke Saath Wo Insan Rahe.");

            setWishesShayariJson("000018",
                    "Wafaon Ki Baatein Ki Zafaon Ke Samne,\n" +
                            "Le Chale Hum Chirag Hawaon Ke Saamne,\n" +
                            "Uthhe Hain Jab Bhi Haath Badli Hain Kismatein,\n" +
                            "Majboor Hai Khuda Bhi Duaaon Ke Saamne.");

            setWishesShayariJson("000019",
                    "Chaand Niklega Toh Log Duaa Maagenge,\n" +
                            "Hum Bhi Apne Mukaddar Ka Likha Maagenge,\n" +
                            "Hum Talabgaar Nahi Duniya Ki Daulat Ke,\n" +
                            "Hum Rab Se Sirf Aapki Wafaa Maagenge.");

            setWishesShayariJson("000020",
                    "Jeene Ki Usne Hamein Nayi Adaa Di Hai,\n" +
                            "Khush Rehne Ki Usne Humein Dua Di Hai,\n" +
                            "Aye Khuda Usko Khushiyan Tamaam Dena,\n" +
                            "Jisne Apne Dil Mein Humein Jagah Di Hai.");

            setWishesShayariJson("000021",
                    "Hamare Sabr Ka Imtihaan Na Lijiye,\n" +
                            "Hamare Dil Ko Yun Sazaa Na Dijiye,\n" +
                            "Jo Aapke Bina Jee Na Sake Ek Pal,\n" +
                            "Unhein Aur Jeene Ki Dua Na Dijiye.");

            setWishesShayariJson("000022",
                    "Ye Aaine Kya De Sakenge Tumhein\n" +
                            "Tumhari Shakhsiyat Ki Khabar,\n" +
                            "Kabhi Humari Aankhon Se Aakar Puchho\n" +
                            "Kitne LaJawab Ho Tum.");

            setWishesShayariJson("000023",
                    "Mujhe Duniya Ki Eidon Se Bhala Kya Vasta Yaaro,\n" +
                            "Humara Chaand Dikh Jaye Humari Eid Ho Jaye.");

            setWishesShayariJson("000024",
                    "Aisa Na Ho TujhKo Bhi Deewana Bana Daale,\n" +
                            "Tanhai Mein Khud Apni Tasvir Na Dekha Kar.");

            setWishesShayariJson("000025",
                    "Kaise Bayaan Karein,\n" +
                            "Saadgi Apne Mahboob Ki,\n" +
                            "Parda Humin Se Tha Magar,\n" +
                            "Najar Bhi Humin Pe Thi.");

            setWishesShayariJson("000026",
                    "Kuchh Mausam Rangeen Hai,\n" +
                            "Kuchh Aap Haseen Hain,\n" +
                            "Tareef Karun Ya Chup Rahun,\n" +
                            "Jurm Dono Sangeen Hain.");

            setWishesShayariJson("000027",
                    "Nahi Bhaata Ab Tere Siwa,\n" +
                            "Kisi Aur Ka Chehra,\n" +
                            "Tujhe Dekhna Aur Dekhte Rehna,\n" +
                            "Dastoor Ban Gaya.");

            setWishesShayariJson("000028",
                    "Falsafa Samjho Na Asraar-e-Siyasat Samjho,\n" +
                            "Zindagi Sirf Hakiqat Hai Hakiqat Samjho,\n" +
                            "Jaane Kis Din Hon Hawayein Bhi Neelam Yahan,\n" +
                            "Aaj To Saans Bhi Lete Ho Ghaneemat Samjho.");

            setWishesShayariJson("000029",
                    "Jo Teer Bhi Aata Woh Khaali Nahi Jata,\n" +
                            "Mayoos Mere Dil Se Sawali Nahi Jata,\n" +
                            "Kaante Hi Kiya Karte Hain Phoolo Ki Hifazat,\n" +
                            "Phoolo Ko Bachane Koi Maali Nahi Aata.");

            setWishesShayariJson("000030",
                    "Waqt Kahta Hai Ki Phir Na Aaunga,\n" +
                            "Teri Aankhon Ko Ab Na Rulaunga,\n" +
                            "Jeena Hai Toh Iss Pal Ko Jeele,\n" +
                            "Shayad Main Kal Tak Na Ruk Paunga.");

            setWishesShayariJson("000031",
                    "Na Jaane Kitni Ankahi Baatein,\n" +
                            "Kitni Hasrate Saath Le Jayenge,\n" +
                            "Log Jhoothh Kehte Hain Ke,\n" +
                            "Khali Haath Aaye The Aur Khali Haath Jayenge.");

            setWishesShayariJson("000032",
                    "Ab Na Main Hun, Na Baaki Hai Zamane Mere,\n" +
                            "Fir Bhi MashHoor Hain Shaharon Mein Fasane Mere,\n" +
                            "Zindagi Hai Toh Naye Zakhm Bhi Lag Jayenge,\n" +
                            "Ab Bhi Baaki Hain Kayi Dost Puraane Mere.");

            setWishesShayariJson("000033",
                    "Haath Khali Hain Tere Shahar Se Jate Jate,\n" +
                            "Jaan Hoti Toh Meri Jaan Lutate Jate,\n" +
                            "Ab Toh Har Haath Ka Patthar Humein Pehchanta Hai,\n" +
                            "Umr Gujri Hai Tere Shahar Mein Aate Jate.");

            setWishesShayariJson("000034",
                    "Haath Khali Hain Tere Shahar Se Jate Jate,\n" +
                            "Jaan Hoti Toh Meri Jaan Lutate Jate,\n" +
                            "Ab Toh Har Haath Ka Patthar Humein Pehchanta Hai,\n" +
                            "Umr Gujri Hai Tere Shahar Mein Aate Jate.");

            setWishesShayariJson("000035",
                    "Aankhon Mein Pani Rakho Hontho Pe Chingari Rakho,\n" +
                            "Zinda Rahna Hai Toh Tarkeebein Bahut Saari Rakho,\n" +
                            "Ek Hi Nadi Ke Hain Yeh Do Kinare Dosto,\n" +
                            "Dostana Zindagi Se Maut Se Yaari Rakho.");

            setWishesShayariJson("000036",
                    "Ajnabi Khwahishein Seene Mein Daba Bhi Na Sakun,\n" +
                            "Aise Ziddi Hain Parinde Ke Uda Bhi Na Sakun,\n" +
                            "Foonk Dalunga Kisi Roj Main Dil Ki Duniya,\n" +
                            "Yeh Tera Khat To Nahi Ke Jala Bhi Na Sakun.");

            setWishesShayariJson("000037",
                    "Roj Taaron Ki Numaaish Mein Khalal Padta Hai,\n" +
                            "Chand Pagal Hai Andhere Mein Nikal Padta Hai,\n" +
                            "Roj Patthar Ki Himayat Mein Ghazal Likhte Hain,\n" +
                            "Roj Sheeshon Se Koi Kaam Nikal Padta Hai.");

            setWishesShayariJson("000038",
                    "Kahin Behtar Hai Teri Ameeri Se Muflisi Meri,\n" +
                            "Chand Sikkon Ki Khaatir Tune Kya Nahi Khoya Hai,\n" +
                            "Mana Nahi Hai Makhmal Ka Bichhauna Mere Paas,\n" +
                            "Par Tu Yeh Bataa Kitni Raatein Chain Se Soya Hai.");

            setWishesShayariJson("000039",
                    "Iss Shahar Ki Bheed Mein Chehre Saare Ajnabi,\n" +
                            "Rahnuma Hai Har Koi Par Rasta Koi Nahi,\n" +
                            "Apni Apni Kismaton Ke Sabhi Maare Yahan,\n" +
                            "Ek-Duje Se Kisi Ka Wasta Koi Nahi.");

            setWishesShayariJson("000040",
                    "Dilon Ki Band Khidki Kholna Ab Zurm Jaisa Hai,\n" +
                            "Bhari Mehfil Mein Sach Bolna Ab Zurm Jaisa Hai,\n" +
                            "Har Ek Jyadti Ko Sahen Kar Lo Chupchap,\n" +
                            "Shahar Mein Iss Tarah Se Cheekhna Zurm Jaisa Hai.");

            setWishesShayariJson("000041",
                    "Jaruri Toh Nahi Jeene Ke Liye Sahara Ho,\n" +
                            "Jaruri Toh Nahi Hum Jinke Hain Woh Humara Ho,\n" +
                            "Kuchh Kashtiya Doob Bhi Jaya Karti Hai,\n" +
                            "Jaruri Toh Nahi Har Kashti Ka Kinara Ho.");

            setWishesShayariJson("000042",
                    "Kashti Hai Purani Magar Dariya Badal Gaya,\n" +
                            "Meri Talash Ka Bhi Toh Jariya Badal Gaya,\n" +
                            "Na Shakl Badli Na Hi Badla Mera Kirdar,\n" +
                            "Bas Logo Ke Dekhne Ka Najariya Badal Gaya.");

            setWishesShayariJson("000043",
                    "Kafiron Ko Kabhi Bhi Jannat Nahi Milti,\n" +
                            "Yahi SochKar Humse Mohabbat Nahi Milti,\n" +
                            "Koi Shaakh Se Tode Tumhein Toh Toot Jana Tum,\n" +
                            "Khud-Ba-Khud Toote Toh Izzat Nahi Milti.");

            setWishesShayariJson("000044",
                    "Waqt Noor Ko Benoor Kar Deta Hai,\n" +
                            "Chhote se Zakhm Ko Nasoor Kar Deta Hai,\n" +
                            "Kaun Chahta Hai Apno Se Dur Rehna,\n" +
                            "Par Waqt Sabko Majboor Kar Deta Hai.");

            setWishesShayariJson("000045",
                    "Waqt Ka Pata Nahi Chalta Apno Ke Saath,\n" +
                            "Par Apno Ka Pata Chalta Hai Waqt Ke Saath,\n" +
                            "Waqt Nahi Badalta Apno Ke Saath,\n" +
                            "Par Apne Jarur Badal Jate Hain Waqt Ke Saath.");

            setWishesShayariJson("000046",
                    "Ek Ajeeb Si Daud Hai Yeh Zindgi,\n" +
                            "Jeet Jao Toh Kayi Apne Pichhe Chhut Jate Hain,\n" +
                            "Aur Haar Jao Toh Apne Hi Pichhe Chhod Jate Hain.");

            setWishesShayariJson("000047",
                    "Kehne waalon ka kuch nahi jaata,\n" +
                            "Sehne waale kamaal karte hain,\n" +
                            "Kaun dhoonde jawaab dardon ke,\n" +
                            "Log toh bas sawaal karte hain.");

            setWishesShayariJson("000048",
                    "Zindagi Ne Kai Sawalat Badal Dale,\n" +
                            "Waqt Ne Mere Haalaat Badal Dale,\n" +
                            "Main to Aaj bi wahi hun Jo main kal tha,\n" +
                            "Bas mere liye Kuch apno ne,\n" +
                            "Apne Khyalat badal dale.");

            setWishesShayariJson("000049",
                    "Zindagi Se Pucho Ye Kya Chahti Hai,\n" +
                            "Bas Ek Dil Se Wafa Chahti Hai,\n" +
                            "Kitni Masoom Or Nadaan Hai Zindagi,\n" +
                            "Khud To Bewafa Hai Aur,\n" +
                            "Dusro Se Wafa Chahti Hai !!!");

            setWishesShayariJson("000050",
                    "Kuchh Rishte Upar wala Banata Hai,\n" +
                            "Kuchh Rishte Log Banaate Hain,\n" +
                            "Woh Log Bahut Khaas Hote Hain,\n" +
                            "Jo Bina Rishte, Rishta Nibhaate Hai.");
        } catch (JSONException jex) {
            jex.printStackTrace();
        }
    }

    public void setWishesShayariJson(String jsonId, String jsonMessage) throws JSONException {
        wishesJson = new JSONObject();
        wishesJson.put(JSON_ID, JSON_WISHES_ID + jsonId);
        wishesJson.put(JSON_TITLE, JSON_WISHES_TITLE);
        wishesJson.put(JSON_MESSAGE, jsonMessage);
        wishesJsonArray.put(wishesJson);
    }

    public JSONArray getWishesJsonArray() {
        return wishesJsonArray;
    }

    public void setWishesJsonArray(JSONArray wishesJsonArray) {
        this.wishesJsonArray = wishesJsonArray;
    }
}
