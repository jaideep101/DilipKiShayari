package com.manorama.dilipkishayari.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class InspiralShayariHandler {

    public static String JSON_TITLE = "JSON_TITLE";
    public static String JSON_MESSAGE = "JSON_MESSAGE";
    public static String JSON_ID = "JSON_ID";
    public static String JSON_INSPIRAL_ID = "INSPIRAL_ID_";
    public static String JSON_INSPIRAL_TITLE = "Inspiral Shayari";
    private JSONObject inspiralJson;
    private static JSONArray inspiralJsonArray;

    public void createInspiralJson() {
        inspiralJsonArray = new JSONArray();

        try {
            setInspiralShayariJson("000001",
                    "Zindgi Me Itni Tezi Se Aage Dodo,\n" +
                            "Ki Logo Ke Burai Ke Dhaage,\n" +
                            "Aapke Pairo Me Aakar Tut Jaaye!");

            setInspiralShayariJson("000002",
                    "Kuch Aarambh Karne Ke Liye,\n" +
                            "Aapka Mahan Hona Aawashyak Nahi,\n" +
                            "Lekin Aapke Mahan Hone Ke Liye,\n" +
                            "Aapka Kuch Aarambh Karna Atyant Aawashyak Hai.");

            setInspiralShayariJson("000003",
                    "Zindgi Aasan Nahi Hoti,\n" +
                            "Isse Aasan Banana Padta Hai,\n" +
                            "Kuch Apne ANDAAZ Se,\n" +
                            "Kuch Nazar ANDAAZ Se!!!");

            setInspiralShayariJson("000004",
                    "Aap Apna Future Nahi Badal Sakte,\n" +
                            "Lekin Aap Apni Habbit Badal Sakte Hai,\n" +
                            "Aur Nishchit Roop Se Aapki Habbits,\n" +
                            "Aapka Future Badal Sakta hai.");

            setInspiralShayariJson("000005",
                    "Jaha Dusro Ko Samjhana Mushkil Ho Jaaye,\n" +
                            "Waha Khud Ko Samjhana Lena Behtar Hai!!!");

            setInspiralShayariJson("000006",
                    "Mushkil Me Koi Salaah Maange,\n" +
                            "Toh Salaah Ke Saath Apna Saath Bhi Jarur Dena,\n" +
                            "Kyuki Salaah Galat Ho Sakti Hai,\n" +
                            "SAATH NAHI!!!");

            setInspiralShayariJson("000007",
                    "Acche Logo Ki Sabse Badi Khubi,\n" +
                            "Yeh Hoti Hai Ki Unhe Yaad Nahi Rakhna Padta,\n" +
                            "Wo Yaad Reh Jaate Hai!!!");

            setInspiralShayariJson("000008",
                    "Zindgi Me 2 Logo Se Hamesha Door Rehna,\n" +
                            "Ek Busy Or Dusra Dhamandi, Kyuki,\n" +
                            "Busy Apni Marzi Se Baat Karega, Or,\n" +
                            "Dhamandi Apne Matlab Se Yaad Karega!!!");

            setInspiralShayariJson("000009",
                    "Dusro Ki Galtiyo Se Seekhe,\n" +
                            "Aap Kabhi Itna Lambha Nahi JEE Sakte,\n" +
                            "Ki Saari Galtiya Khud Karne Ka Mauka Mile!!!");

            setInspiralShayariJson("000010",
                    "Acchi Books Aur Acche Insaan,\n" +
                            "Turant Samjh Me Nahi Aate,\n" +
                            "Unhe Padhna Padta Hai!!!");

            setInspiralShayariJson("000011",
                    "Degree Naa Hona Fayademand Bhi Hai,\n" +
                            "Degree Wale Ek Hi Kaam Karte Hai,\n" +
                            "Jinke Pass Degree Nahi Hoti,\n" +
                            "Wo Kuch Bhi Kar Sakte Hai!!!");

            setInspiralShayariJson("000012",
                    "Rishta Dil Se Hona Chahiye, Sabhdo Se Nahi,\n" +
                            "Narazgi Sabhdo Se Honi Chahiye, Dil Se Nahi!\n");

            setInspiralShayariJson("000013",
                    "Zindgi Woh Nahi Hai, Jo Aapko Milti Hai,\n" +
                            "Zindgi Woh Hai, Joh Aap Banate Hai!");

            setInspiralShayariJson("000014",
                    "Duniya Ke Liye Aap Shayad Sirf Ek Insaan Ho,\n" +
                            "Lekin Kisi Insaan Keliye, Aap Uski Saari Duniya HOo!!!");

            setInspiralShayariJson("000015",
                    "Kamiyab Log Apne Faisle Se, Duniya Badal Dete Hai, Jabki,\n" +
                            "Naakamiyab Log Duniya Ke Darr Se, Apne Faisle Badal Lete Hai!!!");

            setInspiralShayariJson("000016",
                    "Beech Raste Se Lautne Ka Koi Fayda Nahi,\n" +
                            "Lautne Par Bhi Utni Hi Doori Tye Karni Padegi,\n" +
                            "Jitni Doori Tye Kar Lakhshya Tak Pahush Sakte Hai!!!");

            setInspiralShayariJson("000017",
                    "Thokare Kha Kar Bhi Naa Sambhle Toh Musafir Ka Naseeb,\n" +
                            "Warna Pathro Ne Toh Apna Farz Nibha Hi Diya!!!");

            setInspiralShayariJson("000018",
                    "Jo Aapke Saath Dil Se Baat Karta Ho,\n" +
                            "Usko Kabhi Dimaag Se Jawaab Mat Dena!!!");

            setInspiralShayariJson("000019",
                    "Vichaar Se Karya Ki Unnati Hoti Hai,\n" +
                            "Karm Se Aadat Ki Unnati Hoti Hai, Aur\n" +
                            "Charitra Se Aapke Bhagya Ki Unnati Hoti Hai!!!");

            setInspiralShayariJson("000020",
                    "Hum Apni Galtiyo Keliye,\n" +
                            "Bahut Acche Vakil Ban Jaate Hai,\n" +
                            "Aur Dusro Ki Galtiyo Keliye,\n" +
                            "Bahut Acche Nayay Dheesh!!!");

            setInspiralShayariJson("000021",
                    "Pitaah Ki Daulat Par Kya Ghamand Karna,\n" +
                            "Maza Toh Tab Hai, \n" +
                            "Jab Daulat Apni Ho, Aur Ghamand Pitaah Kare!!!");

            setInspiralShayariJson("000022",
                    "Apni Chahat Ki Cheezo Ko, Paane Ki Koshish  Ke Saath Saath,\n" +
                            "Jo Cheeze Aapke Paas Hai, Unhi Se Khush Rehna Seekhe!!!");

            setInspiralShayariJson("000023",
                    "Pyar Usse Hota Hai, Jab Aap Uski Khushiyo Ko,\n" +
                            "Apni Khushiyo Se Jyada Mayne Dete Hai!!!");

            setInspiralShayariJson("000024",
                    "Tumhari Karwat Ke Dusri Taraf, Mere Arman So Rahe Hai,\n" +
                            "Tum Utho Toh Shayad Wo Bhi Jaag Jaaye!!!");

            setInspiralShayariJson("000025",
                    "Pachtave Se Accha Hai,\n" +
                            "Koshish Karke Fail Ho Jaana!!!");

            setInspiralShayariJson("000026",
                    "Uttar Chadhav Zindgi Ka Hissa Hai,\n" +
                            "Kai Baar Aap Unki Nazro Se Bhi Gir Jaate Hai,\n" +
                            "Jinke Din Ki Shuruwat, Aapko Yaad Kar Ke Hua Karti Thi,\n" +
                            "Aap Taaumar Kisi Ke Hero Nahi Bane Reh Sakte!!!");

            setInspiralShayariJson("000027",
                    "Jab Dimag Kamjoor Hota Hai,\n" +
                            "Toh Paristitiya Samsya Ban Jaati Hai,\n" +
                            "Jab Dimag Sthir Hota Hai,\n" +
                            "Toh Paristitiya Aasan Ban Jaati Hai,\n" +
                            "Lekin Jab Dimag Swasth Hota Hai,\n" +
                            "Toh Paristitiya Avsar Ban Jaati Hai!!!");

            setInspiralShayariJson("000028",
                    "Aap Hamesha Itne Chote Baniye Ki,\n" +
                            "Har Insaan Aapke Saath Beth Sake,\n" +
                            "Aur Aap Itne Bade Baniye Ki,\n" +
                            "Aap Jab UTHE Toh Koi BETHA Naa Rahe!!!");

            setInspiralShayariJson("000029",
                    "Zindgi Jeena Aasan Nahi Hota,\n" +
                            "Beena Sangharsh Ke Koi Mahan Nahi Hota,\n" +
                            "Jab Tak Naa Pade Hathode Ki Choot,\n" +
                            "Pathar Bhi Bhagwan Nahi Hota!!!");

            setInspiralShayariJson("000030",
                    "Kisi Ke Pairo Me Gir kar,\n" +
                            "Kamyabi Paane Ke Badle,\n" +
                            "Apne Pairo Par Chal Kar,\n" +
                            "Kuch Banne Ki Thaan Lena!!!");

            setInspiralShayariJson("000031",
                    "Zindgi Badalne Keliye Ladna Padta Hai,\n" +
                            "Aur Aasan Karne Keliye Samjhna Padta Hai!!!");

            setInspiralShayariJson("000032",
                    "Unn Par Dhayan Mat Dijiye ,\n" +
                            "Jo Aapki Peeth Peeche Baat Karte Hai,\n" +
                            "Iska Seedha Saa Arth Hai,\n" +
                            "Aap Unse Do Kadam Aage Hai!!!");

            setInspiralShayariJson("000033",
                    "Samjhni Hai Zindgi Ho Peeche Dekho,\n" +
                            "Jeeni Hai Zindgi Toh Aage Dekho!!!");

            setInspiralShayariJson("000034",
                    "Jis Insaan Ne Kabhi Galti Nahi Ki,\n" +
                            "Usne Kabhi Kuch Naya Karne Ki,\n" +
                            "KOSHISH Nahi Ki!!!");

            setInspiralShayariJson("000035",
                    "Zindgi Me Agar Bura Waqt Nahi Aata,\n" +
                            "Toh Aapno Me Chupe Huye Gair,\n" +
                            "Aur Gairo Me Chupe Huye Apno,\n" +
                            "Ka Kabhi Pata Nahi Chalta!!!");

            setInspiralShayariJson("000036",
                    "Khud Ko Ek Sone Ke Sikke Ke Jaisa Banaiye,\n" +
                            "Jo Agar Naale Me Bhi Gir Jaaye,\n" +
                            "Toh Bhi Uski Keemat Kam Nahi Hoti!!!");

            setInspiralShayariJson("000037",
                    "Acche Ke Saath Accha Bane,\n" +
                            "Lekin Bure Ke Saath Bura Nahi,\n" +
                            "Kyuki Heere Ko Heere Se Tarasha Jaa Sakta Hai,\n" +
                            "Lekin Kichad Ko Kichad Se Saaf Nahi Hota!!!");

            setInspiralShayariJson("000038",
                    "Kuch Alag Karna Hai, Toh Bheed Se Hat Kar Chalo,\n" +
                            "Bheed SAHAS To Deti Hai, Par Pehchan Cheen Leti Hai!!!");

            setInspiralShayariJson("000039",
                    "Asafalta Aur Safalta Do Sthiti Me Log Tumhari Baate Karege,\n" +
                            "Safal Hone Par Prerna Ke Roop Me,\n" +
                            "Aur Asafal Hone Par Seekh Ke Roop Me!!!");

            setInspiralShayariJson("000040",
                    "Apno Par Bhi Utna Hi Vishwas Rakho,\n" +
                            "Jitna Dawaiyo Par Rakhte Ho,\n" +
                            "Beshak Thode Kadwe Hoge Lekin,\n" +
                            "Aapke Fayde Ke Liye Hote!!!");

            setInspiralShayariJson("000041",
                    "Agar Aap Rait Par Apne Kadmo Ke Nishaan Chodna Chahte Hai Toh,\n" +
                            "Ek Hi Upaye Hai,\n" +
                            "Apne Kadam Peeche Nahi Aage Badhao!!!");

            setInspiralShayariJson("000042",
                    "Jisse Kisi Ko Umeed Nahi Hoti,\n" +
                            "Aksar Wahi Log KAMAAL Karte Hai!!!");

            setInspiralShayariJson("000043",
                    "Tahzeeb Sikha Di Mujhe Chote Se Makan Ke Darwaje Ne,\n" +
                            "Uspe Likha Tha THODA JHUK KAR CHALIYE!!!");

            setInspiralShayariJson("000044",
                    "Sacchai Aur Aacchai Ki Talash Me Puri Duniya Ghoom Le,\n" +
                            "Agar Weh Hamesha Andar Nahi To Kahi Nahi!!!");

            setInspiralShayariJson("000045",
                    "Zindgi Jeene Ke Do Tarike Hote Hai!\n" +
                            "Pehla: Jo Pasand Hai Usse Hasil Karna Seekh Lo,\n" +
                            "Dusra: Jo Hasil Hai, Usse Pasand Karna Seekh Lo!");

            setInspiralShayariJson("000046",
                    "Kisi Ke Bure Waqt Par, Hasne Ki Galti Mat Karna,\n" +
                            "Yeh Waqt Hai JANAB, Chehre Yaad Rakhta Hai!!!");

            setInspiralShayariJson("000047",
                    "Sab Kuch Mila Hai Hamko,\n" +
                            "Fir bhi Sabar Nahi Hai,\n" +
                            "Barso Ki Sochte Hai,\n" +
                            "Pal ki Khabar Nahi Hai!!!");

            setInspiralShayariJson("000048",
                    "Bharosa Jeeta Jata Hai,\n" +
                            "Manga Nahi Jata,\n" +
                            "Yeh Woh Daulat Hai,\n" +
                            "Jise Paya Jata Hai,\n" +
                            "Kamaya Nahi Jata!!!");

            setInspiralShayariJson("000049",
                    "Log Chahte Hai Ki Aap Behtar Kare,\n" +
                            "Lekin Yeh Bhi Satya Hai Ki,\n" +
                            "Unme se Adhikansh Yeh Nahi Chahte,\n" +
                            "Ki Aap Unse Behtar Kare!!!");

            setInspiralShayariJson("000050",
                    "Almari Se Nikalne Bachpan Ke Khilone,\n" +
                            "Mujhe Udaas Dekhkar Bole,\n" +
                            "Tumhe Hi Shauk Tha Bade Hone Kaa!!!");

            setInspiralShayariJson("000051",
                    "Jyada Nahi Bas Itne Safal Ho Jao,\n" +
                            "Ki Apne Mata - Pitaah Ki,\n" +
                            "Har Khwaish Puri Kar Sako!!!");

            setInspiralShayariJson("000052",
                    "Dekh Lena Zindgi Me,\n" +
                            "Mehnat Se Mile Fal Ka Swad,\n" +
                            "Kismat Se Mile Fal Se,\n" +
                            "Jayda Meetha Lagega!!!");

            setInspiralShayariJson("000053",
                    "Moan Se Jo Kaha Jaa Sakta Hai, Wo Sabd Se Nahi!!\n" +
                            "Dil Se Jo Diya Jaa Sakta Hai, Wo Haatho Se Nahi!!");

            setInspiralShayariJson("000054",
                    "Waqt Aur Rishto Ne Sikha Di Hosiyari!!\n" +
                            "Warna Hum Bhi Masoomiyat Ki Hadd Tak Masoom The!!");

            setInspiralShayariJson("000055",
                    "APNAPAN, PARWAH, AADAR Aur Thoda SAMAY,\n" +
                            "Yeh Wo Daulat Hai,\n" +
                            "Jo Humare Apne Humase Chahte Hai!!!");
        } catch (JSONException jex) {
            jex.printStackTrace();
        }
    }

    public void setInspiralShayariJson(String jsonId, String jsonMessage) throws JSONException {
        inspiralJson = new JSONObject();
        inspiralJson.put(JSON_ID, JSON_INSPIRAL_ID + jsonId);
        inspiralJson.put(JSON_TITLE, JSON_INSPIRAL_TITLE);
        inspiralJson.put(JSON_MESSAGE, jsonMessage);
        inspiralJsonArray.put(inspiralJson);
    }

    public JSONArray getInspiralJsonArray() {
        return inspiralJsonArray;
    }

    public void setInspiralJsonArray(JSONArray inspiralJsonArray) {
        this.inspiralJsonArray = inspiralJsonArray;
    }
}
