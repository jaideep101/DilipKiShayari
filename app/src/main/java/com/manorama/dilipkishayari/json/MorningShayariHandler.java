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
                    "Ho Sakta Hai Har Din Accha Na Ho,\n" +
                            "Lekin Har Din Me Kuch Na Kuch Accha Hota Hai!!!");

            setMorningShayariJson("000002",
                    "Har Subeh Aapko Satana Pyara Lagta Hai,\n" +
                            "Soye Huye Ko Neend Se Jagana Accha Lagta Hai,\n" +
                            "Jab Bhi Kisi Yaad Aati Hai,\n" +
                            "To Usko Bhi Apni Yaad Dilana Accha Lagta Hai!");

            setMorningShayariJson("000003",
                    "Har Subeh Teri Muskurati Rahe,\n" +
                            "Har Shaam Teri Gungunati Rahe,\n" +
                            "Meri Dua Hai, Ki Tu Jisse Bhi Mile,\n" +
                            "Har Milne Wale Ko Teri Yaad Satati Rahe!");

            setMorningShayariJson("000004",
                    "Subeh Ki Har Dhoop Kuch Yaad Dilati hai,\n" +
                            "Har Mahekti Khushbu Ek Jaadu Jagati Hai,\n" +
                            "Kitni Bhi Busy Kyu Naa Ho Yeh Zindgi,\n" +
                            "Subeh Subeh Apno Ki Yaad Aa Hi Jaati Hai!");

            setMorningShayariJson("000005",
                    "Har Jalte Deepak Tale Andhera Hota Hai,\n" +
                            "Har Raat Ke Baad Ek Savera Hota Hai,\n" +
                            "Musibat Dekh Kar Dar Jaate Hai Log,\n" +
                            "Lekin Har Musibat Ke Peech,\n" +
                            "Sach Ka Savera Hota Hai!");

            setMorningShayariJson("000006",
                    "Raat Subeh Ka Intezaar Nahi Karti,\n" +
                            "Khushbu Mosum Ka Intezaar Nahi Karti,\n" +
                            "Jo Bhi Khushi Mile Uska Aanand Liya Karo,\n" +
                            "Kyuki Zindgi Waqt Ka Intezaar Nahi Karti!");

            setMorningShayariJson("000007",
                    "Savera Savera Ho Khushiyo Ka Mela,\n" +
                            "Naa Logo Ki Parwah, Naa Duniya Ka Jhamela,\n" +
                            "Pakshiyo Ka Sangeet Ho, Aur Mosum Albela,\n" +
                            "Mubarak Ho Aapko Yeh Khubsurat Savera!!!");

            setMorningShayariJson("000008",
                    "Wada Kiya Hai To Nibhayege,\n" +
                            "Surat Ki Kirne Bankar Teri Chat Par Aayege,\n" +
                            "Hum Hai To Judaai Ka Gum Kaisa,\n" +
                            "Teri Har Subeh Ko Phoolo Se Sajaayege!!!");

            setMorningShayariJson("000009",
                    "Surat Nikalne Ka Waqt Ho Gaya hai,\n" +
                            "Phool Khilne Ka Waqt Ho Gaya Hai,\n" +
                            "Meethi Neend Se Jaago Mere Dost,\n" +
                            "Kyuki Sapno Ko Haqiqat me,\n" +
                            "Badalne Ka Waqt Hogaya Hai!!!");

            setMorningShayariJson("000010",
                    "Khubsurati Hamesha Dekhne Wale Ke,\n" +
                            "Mann Aur Nazaro Me Hoti Hai,\n" +
                            "Warna Galti Nikalne Walo Ko To,\n" +
                            "Taj Mahel Me Bhi Kami Nazar Aati Hai!!!");

            setMorningShayariJson("000011",
                    "Khubsurati Hamesha Dekhne Wale Ke,\n" +
                            "Mann Aur Nazaro Me Hoti Hai,\n" +
                            "Warna Galti Nikalne Walo Ko To,\n" +
                            "Taj Mahel Me Bhi Kami Nazar Aati Hai!!!");

            setMorningShayariJson("000012",
                    "Acche Kaam Karte Rahiye, Chahe Log Taarif Kare Yaa Naa Kare!!\n" +
                            "Aadhi Se Jyada Duniya Soti Rehti hai, Subeh Fir Bhi Hoti Hai!!");

            setMorningShayariJson("000013",
                    "Raah Sangharsh Ki Jo Jalta Hai,\n" +
                            "Wo Hi Sansar Ko Badalta Hai,\n" +
                            "Jisne Raasto Se Hai Jung Jeeti,\n" +
                            "Wahi Surya Bankar Nikalta Hai!!!");

            setMorningShayariJson("000014",
                    "Mushkilo Se Udas Mat Hoiye,\n" +
                            "Mushkil Kirdar, Sirf Acche Actor Ko Hi Milte hai!!!");

            setMorningShayariJson("000015",
                    "Beeta Huya Din Yaado Keliye Hai,\n" +
                            "Aane Wala Din Sapno Keliye Hai,\n" +
                            "Lekin Aaj Ka Din Hi Aapka Anmol Uphar Hai,\n" +
                            "Aapka Din Khushnuma Ho!!!");

            setMorningShayariJson("000016",
                    "Ek Bure Din,\n" +
                            "Or Ek Acche Din,\n" +
                            "Me Bus Aapki,\n" +
                            "Soch Ka Fark Hota Hai!!!");

            setMorningShayariJson("000017",
                    "Ek Mahekte Ehsaas Ke Saath,\n" +
                            "Ek Naye Vishwas Ke Saath, \n" +
                            "Baagh Me Kaliyo Ke Khilne Ke Saath,\n" +
                            "Aap Ka Din Shuru Ho,\n" +
                            "Ek Pyari Si Muskan Ke Saath!!!");

            setMorningShayariJson("000018",
                    "Subeh Ka Pranaam Sirf Ek Rivaz Hi Nahi,\n" +
                            "Balki Aapki Fikr Ka Ehsaas Bhi Hai,\n" +
                            "Subeh Ka Namaskar!!!");

            setMorningShayariJson("000019",
                    "Sabke Dilo Ka Ehsaas Alag Hota Hai,\n" +
                            "Es Duniya Me Sabka Vyavhar Alag Hota Hai,\n" +
                            "Aakhe Toh Sabki Ek Jaisi Hoti Hai,\n" +
                            "Par Sabko Dekhne Ka Andaaz Alag Hota Hai!!!");

            setMorningShayariJson("000020",
                    "Bindaas Muskhurao Kya Gum Hai,\n" +
                            "Zindgi Me Tension Kisko Kam Hai,\n" +
                            "Accha Yaa Bura Ho Kewal Bram Hai,\n" +
                            "Zindgi Ka Naam Hai,\n" +
                            "Kabhi Khushi Kabhi Gum Hai!!!");

            setMorningShayariJson("000021",
                    "Beet Gayi Raato Wali Sunhari Raat,\n" +
                            "Yaad Aayi Fir Wahi Pyari Si Baat,\n" +
                            "Khushiyo Se Har Pal Ho Aapki Mulakat,\n" +
                            "Isliye Muskura Kar Karna Din Ki Shuruwat!");

            setMorningShayariJson("000022",
                    "Har Nayi Subeh Ka Naya Nazara,\n" +
                            "Thandi Hawa Lekar Aaye Paigam Humara,\n" +
                            "Jaago, Uthoo, Tyar Ho Jao,\n" +
                            "Khushiyo Se Bhara Rahe Aaj Ka Din Tumhara!");

            setMorningShayariJson("000023",
                    "Raat Ki Chandni Se Mangta Hu Savera,\n" +
                            "Phoolo Ki Chamak Se Mangta Hu Rang Gehra,\n" +
                            "Daulat Shohrat Se Tallukh Nahi Hai Mera,\n" +
                            "Mujhe Chahiye Har Subeh Me Bus Saath Tera!!!");

            setMorningShayariJson("000024",
                    "Nayi Nayi Subeh, Naya Naya Savera,\n" +
                            "Suraj Ki Kirne, Hawa Ka Basera,\n" +
                            "Aur Muskurata Hua, Aapka Yeh Chehra,\n" +
                            "Mubarak HO Aapko Yeh Hasi Savera!!!");

            setMorningShayariJson("000025",
                    "Sapno Ke Jaha Se Ab Laut Aao,\n" +
                            "Huyi Hai Subeh Ab Tum Jaag Jao,\n" +
                            "Chand Taaro Ko Kehkar Ab Alvida,\n" +
                            "Iss Naye Din Ki Khushiyo Me Kho Jao!!!");

            setMorningShayariJson("000026",
                    "Yeh Subeh Jitni Khubsurat Hai,\n" +
                            "Utna Hi Khubsurat Aapka Har Ek Pal Ho,\n" +
                            "Jitni Bhi Khushiya Aapke Pass Aaj Hai,\n" +
                            "Usse Bhi Jyada Kal Ho!!!");

            setMorningShayariJson("000027",
                    "Aakhe Kholo Bhagwan Ka Naam Lo,\n" +
                            "Saas Lo Thandi Hawa Ka Jaam Lo,\n" +
                            "Fir Jara Mobile Hath Me Thaam Lo,\n" +
                            "Aur Humse Dilkash Subeh Ka Paigam Lo!");

            setMorningShayariJson("000028",
                    "Khushiya Batoorte Batoorte Ek Umar Gujar Gayi,\n" +
                            "Baad Me Pata Chala Khush Toh Wo Log The,\n" +
                            "Jo Khushiya Baant Rahe The!!!");

            setMorningShayariJson("000029",
                    "Aye Subeh Tum Jab Bhi Aana,\n" +
                            "Sab Ke Liye Bas Khushiya Lana,\n" +
                            "Har Chehre Par Hasi Sajana,\n" +
                            "Har Aangan Phool Khilana!!!");

            setMorningShayariJson("000030",
                    "Jiski Soch Me Aatm Vishwas Ki Mehak Hai,\n" +
                            "Jiske Irado Me Houslo Ki Meethas Hai,\n" +
                            "Aur Jiski Niyat Me Sacchai Ka Swad Hai,\n" +
                            "Ussi Insaan Ki Puri Zindgi Mehakta Hua Gulab Hai!");

            setMorningShayariJson("000031",
                    "Gulsan Me Bhavro Ka Fera Ho Gaya,\n" +
                            "Purab Me Suraj Ka Dera Ho Gaya,\n" +
                            "Muskaan Ke Saath Aakhe Khol Mere Pyare Dost,\n" +
                            "Ek Baar Fir Se Savera Ho Gaya!!!");

            setMorningShayariJson("000032",
                    "Manzile Bahut Hai, Afsaane Bahut Hai,\n" +
                            "Imtihan Zindgi Me Aane Bahut Hai,\n" +
                            "Jo Mila Nahi Uska Kya Geela Karna,\n" +
                            "Duniya Me Khush Rehne Ke Bahane Bahut Hai!!!");

            setMorningShayariJson("000033",
                    "Beena Sawan Barsaath Nahi Hoti,\n" +
                            "Suraj Dube Beena Raat Nahi Hoti,\n" +
                            "Kya Kare Ab Kuch Aise Halat Hai,\n" +
                            "Dosto Ki Yaad Aaye Beena, \n" +
                            "Din Ki Shuruwat Nahi Hoti!!");

            setMorningShayariJson("000034",
                    "Kamiyabi Kabhi Badi Nahi Hoti,\n" +
                            "Paane Wale Hamesha Bade Hote Hai,\n" +
                            "Dosti Kabhi Badi Nahi Hoti,\n" +
                            "Nibhane Wale Hamesha Bade Hote Hai!");

            setMorningShayariJson("000035",
                    "Suraj Tu Unko Mera Paigam Dena,\n" +
                            "Khushi Ka Din Or Hasi Ki Shaam Dena,\n" +
                            "Jab Wo Dekhe Tujhe Bahar Aakar,\n" +
                            "To Unko Mera Salaam Dena!!!");

            setMorningShayariJson("000036",
                    "Zindgi Hasaye Tab Samjhna Ki,\n" +
                            "Acche Karmo Ka Fal Mil Raha Hai,\n" +
                            "Aur Jab Zindgi Rulaye Tab Samjhna Ki,\n" +
                            "Acche Karam Karne Ka Samay Aa Gaya Hai!!");

            setMorningShayariJson("000037",
                    "Har Subeh Teri Duniya Me Roshni Kar De,\n" +
                            "Rabb Tere Gam Ko Teri Khushi Kar De,\n" +
                            "Jab Bhi Tutne Lage Meri Saase,\n" +
                            "Khuda Tumse Shamil Meri Zindgi Kar De!!!");

            setMorningShayariJson("000038",
                    "Jo Log Dusro Ko Apni Duao Me Shamil Karte Hai!\n" +
                            "Khushiya Sabse Pehle Unke Hi,\n" +
                            "Darwaje Par Dastak Deti Hai!!");

            setMorningShayariJson("000039",
                    "Paani Ki Bunde Phoolo Ko Beega Rahi Hai,\n" +
                            "Thandi Lehre Ek Taajgi Jaga Rahi Hai,\n" +
                            "Ho Jaao Aap Bhi Isme Shamil,\n" +
                            "Ek Pyari Si Subeh Aap Ko Jaga Rahi Hai!!!");

            setMorningShayariJson("000040",
                    "Paani Ki Bunde Phoolo Ko Beega Rahi Hai,\n" +
                            "Thandi Lehre Ek Taajgi Jaga Rahi Hai,\n" +
                            "Ho Jaao Aap Bhi Isme Shamil,\n" +
                            "Ek Pyari Si Subeh Aap Ko Jaga Rahi Hai!!!");

            setMorningShayariJson("000041",
                    "Rahat Bhi Apno Se Milti Hai,\n" +
                            "Chahat Bhi Apno Se Milti Hai,\n" +
                            "Apno Se Kabhi Ruthna Nahi, Kyuki,\n" +
                            "Muskurahat Bhi Sirf Apno Se Milti Hai!!!");

            setMorningShayariJson("000042",
                    "Subeh Ke Phool Khil Gaye,\n" +
                            "Panchi Apne Safar Par Udd Gaye,\n" +
                            "Suraj Aate Hi Taare Chip Gayi,\n" +
                            "Kya Aap Bhi Meethi Neend Se Uth Gaye!");

            setMorningShayariJson("000043",
                    "Rakh Hausla Wo Manjar Bhi Aayega,\n" +
                            "Pyase Ke Paas Chal Ke Samandar Bhi Aayega,\n" +
                            "Thak Kar Na Beth Aye Manjil Ke Musafir,\n" +
                            "Manjil Bhi Milegi Aur,\n" +
                            "Milne Ka Maza Bhi Aayega!!!");

            setMorningShayariJson("000044",
                    "Jeevan Me Jyada Rishtedari Hona Jaruri Nahi!!\n" +
                            "Par Jo Rishta Hai, Unme Jeevan Hona Jaruri Hai!!");

            setMorningShayariJson("000045",
                    "Dunia Ka Sabse Badi Haar Wo Hai Ki,\n" +
                            "Kisi Ki Aakho Me Aasu Humari Wajah Se Hai!!\n" +
                            "Aur Duniya Ki Sabse Badi Vijay Yahi Hai Ki,\n" +
                            "Kisi Ki Aankho Me Aasu Humare Liye Hai!!");

            setMorningShayariJson("000046",
                    "Chirag Se Naa Pucho Baki Tel Kitna Hai,\n" +
                            "Saaso Se Naa Pucho Baki Khel Kitna Hai,\n" +
                            "Pucho Uss Kafan Me Lipte Murde Se,\n" +
                            "Zindgi Me Gam Aur Kafan Me Chain Kitna Hai!!");

            setMorningShayariJson("000047",
                    "Aaj Har Raste Par Mere Andhera Hi Andhera Hai!!\n" +
                            "Par Iss Andhere Ne Bata Diya Ki Kon Kon Mera Hai!!");

            setMorningShayariJson("000048",
                    "Dariya Ne Jharne Se Pucha,\n" +
                            "Tujhe Samandar Nahi Banana Hai Kya,\n" +
                            "Jharne Ne Badi Naramta Se Kaha,\n" +
                            "Bada Bankar Khara Ho Jaane SE Accha Hai,\n" +
                            "Ki Me Chota Reh Kar Meetha Hi Rahu!!!");

            setMorningShayariJson("000049",
                    "Dariya Ne Jharne Se Pucha,\n" +
                            "Tujhe Samandar Nahi Banana Hai Kya,\n" +
                            "Jharne Ne Badi Naramta Se Kaha,\n" +
                            "Bada Bankar Khara Ho Jaane SE Accha Hai,\n" +
                            "Ki Me Chota Reh Kar Meetha Hi Rahu!!!");

            setMorningShayariJson("000050",
                    "Aaj Khuda Ne Fir Pucha,\n" +
                            "Tera Hasta Chehra Udas Kyu Hai,\n" +
                            "Teri Aankho Me Pyas Kyu Hai,\n" +
                            "Jiske Pass Tere Liye Waqt Nahi,\n" +
                            "Wahi Tere Liye Khaas Kyu Hai!!!");
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
