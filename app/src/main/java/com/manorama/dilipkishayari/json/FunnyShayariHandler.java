package com.manorama.dilipkishayari.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FunnyShayariHandler {

    public static String JSON_TITLE = "JSON_TITLE";
    public static String JSON_MESSAGE = "JSON_MESSAGE";
    public static String JSON_ID = "JSON_ID";
    public static String JSON_FUNNY_ID = "FUNNY_ID_";
    public static String JSON_FUNNY_TITLE = "Funny Shayari";
    private JSONObject funnyJson;
    private static JSONArray funnyJsonArray;

    public void createFunnyJson() {
        funnyJsonArray = new JSONArray();

        try {
            setFunnyShayariJson("000001",
                    "Dakh Baby Post Meri Achi hai\n" +
                            "Soch Meri Sachi hai\n" +
                            "Lakin main tujhe abhi bhi\n" +
                            "Pasand nahi aaya to sweet\n" +
                            "Heart tu abhi bachi hai");//F

            setFunnyShayariJson("000002",
                    "Hansi Ke Liye Gam Kurbaan,\n" +
                            "Khushi Ke Lie Aansoo Kurbaan,\n" +
                            "Dost Ke Liye Jaan Bhi Kurbaan,\n" +
                            "Aur...\n" +
                            "Agar Dost Ki Girlfriend Mil Jaye To,\n" +
                            "Saala Dost Bhi Kurbaan.");

            setFunnyShayariJson("000003",
                    "Kis Kis Ka Naam Le Apni Barbadi Me,\n" +
                            "Bahut Log Aaye The Duayen Dene Shadi Me.");

            setFunnyShayariJson("000004",
                    "Umr Ki Raah Me Jazbaat Badal Jaate Hain,\n" +
                            "Waqt Ki Aandhi Me Halat Badal Jaate Hain,\n" +
                            "Sochta Hun Ki Kaam Kar-Kar Ke Ricord Tord Dun,\n" +
                            "Par Office Aate Aate Khayalaat Badal Jate Hain.");

            setFunnyShayariJson("000005",
                    "Ai Khuda Hichkiyon Me\n" +
                            "Kuchh To Fark Dala Hota,\n" +
                            "Ab Kaise Pata Karun Ke\n" +
                            "Kaun Si Wali Yaad Kar Rahi Hai.");

            setFunnyShayariJson("000006",
                    "Mat Kar Mere Dost Haseena Se Mohabbat,\n" +
                            "Wo To Aankhon Se Waar Karti Hain.\n" +
                            "Maine Teri Wali Ki Aankhon Me Dekha Hai,\n" +
                            "Wo To Mujh Se Bhi Pyar Karti Hai.");

            setFunnyShayariJson("000007",
                    "Sumundar Se Keh Do Apni Mojain Sanbhal Ke Rakhe,\n" +
                            "Zindagi Me Tofaan Laane Ke Liye Susral Wale Hi Kaafi Hain.");

            setFunnyShayariJson("000008",
                    "Shadi Karni Thi Par Kismat Khulti Nahi,\n" +
                            "Taaj Banana Tha Par Mumtaj Milti Nahi,\n" +
                            "Ek Din Kismat Khuli Aur Shadi Ho Gayi,\n" +
                            "Ab Taaj Banana Hai Par Mumtaj Marti Nahi.");

            setFunnyShayariJson("000009",
                    "Bewaafa Tum Ho To Wafadaar Hum Bhi Nahi,\n" +
                            "Besharam Tum Ho To Sharmdar Hum Bhi Nahi,\n" +
                            "Pyaar Ke Iss Maud Par Kehte Ho Ke Shadishuda Ho,\n" +
                            "To Kya Hua Darling, Kunware Hum Bhi Nahi.");

            setFunnyShayariJson("000010",
                    "Husband: Darling!!! Tumhara Naam Haath Pe Likhu Ya Dil Pe??\n" +
                            "Wife: Idhar Udhar Kyun Likhte Ho? Agar Sachcha Pyar Karte Ho Toh Seedha Apne Property Ke Papers Pe Likho !!!");

            setFunnyShayariJson("000011",
                    "Prabhu: Yeh Kya Moh-Maya Hai?\n" +
                            "Apna Bachcha Roye,\nToh Dil Mein Dard Hota Hai Aur Doosre Ka Roye,\nToh Sir Mein!\n" +
                            "Apni Biwi Roye,\nToh Sir Mein Dard Hota Hai Aur Doosre Ki Roye\nToh Dil Mein....\n" +
                            "Sab Prabhu Ki Maya Hai.\n");

            setFunnyShayariJson("000012",
                    "A Man Praying in Kumbh Mela:\n" +
                            "Hey Prabhu, Nyaye Karo...\n" +
                            "Hey Prabhu, Nyaye Karo...\n" +
                            "Hamesha Bhai-Bhai Bichhadte Hain Is Kumbh Ke Mele Mein...\n" +
                            "Kabhi Pati-Patni Pe Bhi Try Karo!!!!");//F

            setFunnyShayariJson("000013",
                    "Wife: Jaanu, Kaash Aap Message Hote,\n" +
                            "Main Aapko Save Karti Aur Jab Dil Chahta Ta Padh Leti.\n" +
                            "Husband: Kanjoos Hee Rahiyo,\nSave Hee Karke Rakhiyo,\n" +
                            "Apni Kisi Saheli Ko Forward Na Kariyo!!!");

            setFunnyShayariJson("000014",
                    "Ghalib ne girlfriend ko date par bulaya wo late aayi,\n" +
                            "Girl: Am I late ?,\n" +
                            "Ghalib: Arz hai Falak pe chand sitaron ko neend aa rahi hai,\n" +
                            "Falak pe chand sitaron ko neend aa rahi hai,\n" +
                            "Dusri ka time ho gaya hai tu ab aa rahi hai");

            setFunnyShayariJson("000015",
                    "Wife: Khana kha liya?\n" +
                            "Husband: Khana kha liya?\n" +
                            "Wife: Batao na Husband: Batao na,\n" +
                            "Wife: Pleaseee batao na,\n" +
                            "Husband: Pleaseee batao na,\n" +
                            "Wife: Achcha ji Meri naqal?\n" +
                            "Husband: Achcha ji Meri naqal?" +
                            "\nWife: I Love U,\n" +
                            "Husband: Haan yaar khana kha liya maine");

            setFunnyShayariJson("000016",
                    "Wife:\n" +
                            "Jab Tum Desi Sharab peete Ho To Mujhe Paaro Kehte ho\n" +
                            "Beer Peete ho To Darling…\n" +
                            "Par Aaj Bhootni kyun kaha…?\n" +
                            "Husband:\n" +
                            "Aaj maine SPRITE Pee hai\n" +
                            "“Seedhi Baat No Bakwas");

            setFunnyShayariJson("000017",
                    "Pappu: Dekho.. Main Chahe Jaisa Bhi Hoon..\n" +
                            "Par Baccha Ek Dum Sunder Hona Chahiye..\n" +
                            "Wife: Dekho Ji.. Choice Is Yours.. Baccha Yaa\n" +
                            "Toh Sunder Hoga Yaa Aap Ka Hoga!!!");

            setFunnyShayariJson("000018",
                    "Taj Mahal ko dekh kar\n" +
                            "bola shahjahan ka pota..\n" +
                            "Taj Mahal ko dekh kar\n" +
                            "bola shahjahan ka pota..\n" +
                            "Aaj apna bhi bank balance hota\n" +
                            "Agar dada aashiq na hota!");

            setFunnyShayariJson("000019",
                    "Papa: Pappu Beta, teri Mummy aaj itni chup kaise baithi hain?\n" +
                            "Pappu Bola:\n" +
                            "Kuchh nahin papa\n" +
                            "Mummy ne Lipstick maangi thi…\n" +
                            "Maine…\n" +
                            "Maine Fevistick de di\n" +
                            "Papa: Jug jug jiyo mere laal..\n" +
                            "Bhagwan aisa beta sabko de!!!");

            setFunnyShayariJson("000020",
                    "Train mein TT Sadhu se bola : Kahan jana hai?\n" +
                            "Sadhu : Jahan Ram ka janam hua tha… Ayodhya\n" +
                            "TT : Ticket hai?\n" +
                            "Sadhu : Nahin\n" +
                            "TT : Chalo\n" +
                            "Sadhu : Kahan?\n" +
                            "TT : Jahan Krishan ka janam hua tha..\n" +
                            "Jail mein.");

            setFunnyShayariJson("000021",
                    "Gabbar: Yeh hath mujhe de de thakur…\n" +
                            "Thakur: Le Le, mere hath le le\n" +
                            "Basanti ke bhi le le…\n" +
                            "Jai aur Veeru ke bhi le le…\n" +
                            "Ramu kaka ke bhi le le…\n" +
                            "Octopus ban ja Kutteee!!\n" +
                            "Gabbar: Sorry yaar, tu to Emotional ho gaya!!!");

            setFunnyShayariJson("000022",
                    "Sita ji k vanvaas jaane mein bahut badi seekh hai.\n" +
                            "Wah wah…\n" +
                            "Sita ji k vanvaas jaane mein bahut badi seekh hai..\n" +
                            "arey aage to kaho….\n" +
                            "Ghar me 3-3 saas ho to jungle hi theek hai!!!");

            setFunnyShayariJson("000023",
                    "Girl: Main kisi aur se shaadi kar rahi hoon,\n" +
                            "Mujhe bhool jao…\n" +
                            "Boy: Na tere aane ki khushi,\n" +
                            "Aur na tere jaane ka gham,\n" +
                            "Dusri patayenge tu jaa behen,\n" +
                            "Aaj se tera kissa khatam!");//F

            setFunnyShayariJson("000024",
                    "Mujh se break-up kar ke tu ban gayi ullu\n" +
                            "Mujh se break-up kar ke tu ban gayi ullu\n" +
                            "Maine toh nayi patta li tujhe kya milla ?\n" +
                            "Babaji ka thullu??");

            setFunnyShayariJson("000025",
                    "Loving couple before Marriage:\n" +
                            "Janu.. tum nahin to main nahin, main nahin to tum nahin!!!\n" +
                            "The same couple after Marriage:\n" +
                            "Maa kasam… Aaj tu nahin ya main nahin!!!");

            setFunnyShayariJson("000026",
                    "Jatt : Mujhe mobile me MP3 songs dalwane hai.\n" +
                            "Mobile Shop Wala : Memory card hai kya?\n" +
                            "Jatt : Nahi memory card nahi hai, RASAN CARD chalega?");

            setFunnyShayariJson("000027",
                    "Do judwa baache kamare me baithe the\n" +
                            "Ek haans ke lot pot ho raha tha aur dusra udaas tha\n" +
                            "Dad : Tum itna kyun haans rahe ho\n" +
                            "Son : Mummy ne itni thand me dono baar isi ko nehla diya!");

            setFunnyShayariJson("000028",
                    "Sasur ne Daamaad se kaha : 6 saale me 8 baache.Ye kya hai?\n" +
                            "Daamaad : Maine aapse kaha tha Gareeb jarur hu par aapki beti ko kabhi khali pet nahi rakhunga!");

            setFunnyShayariJson("000029",
                    "\t\n" +
                            "Patni: Main tumse jo kuch bhi kahti hu tum ek kaan se sunkar doosre se nikaal dete ho. \n" +
                            "Pati: Aur main tumse kuch bhi kahta hu to tum dono kaan se sunkar muh se nikaal deti ho.");

            setFunnyShayariJson("000030",
                    "Husband to Wife : Mein shaadi se pehle 20 auraton ke saath so chuka hoon.\n" +
                            "Wife : Mujhe pata tha ki jab kundli mili hai to aadatein bhi zarur milti hogi!!!");

            setFunnyShayariJson("000031",
                    "Sardar: Meri Biwi Itna Mazak Karti Hai Ki Kya Bataon.\n" +
                            "Dost: Kya Mazak Karti Ha?\n" +
                            "Sardar: Kal Mai Ghar Gya Uski Ankhon Par Hath Rakha Or Wo Mazak Ma Boli\n" +
                            "Dudhwala.");

            setFunnyShayariJson("000032",
                    "Dil Ka Dard Dil Todne Wala Kya Jaane,\n" +
                            "Pyar Ke Riwajo Ko Ye Zamana Kya Jaane,\n" +
                            "Hoti Hai Kitni Takleef Ladki Pataane Me,\n" +
                            "Ye Ghar Baitha Uska Baap Kya Jaane.");

            setFunnyShayariJson("000033",
                    "Girl- Jab Savan Ata He Teri Yad Ati Hai,\n" +
                            "Jab Badal Chate He Teri Yad Ati Hai,\n" +
                            "Jab Bunde Girti He Teri Yad Ati Hai,\n" +
                            "Boy- Kamini Taane Mat De Pata H Tera Chhata Dena Hai!!!");

            setFunnyShayariJson("000034",
                    "Ek Aadmi: Bhagwan aapne aurat ko itna sundar kyon banaya hai? \n" +
                            "Bhagwan: Taki tum unse pyaar kar sako.\n" +
                            "Aadmi: To phir unhe itna bevkoof kyon banaya hai?\n" +
                            "Bhagwan: Taki wo tumse pyaar kar sake!!!");//F

            setFunnyShayariJson("000035",
                    "Chota baby: Mummy raat ko jab me susu karne gaya to bathroom Ki light jal gayi, \n" +
                            "Mummy- Haramjade tu aaj fir freeze me susu kar aaya…!! !");

            setFunnyShayariJson("000036",
                    "Ek Aadmi Librarian se: Mujhe suicide karni hai. Kya aap mujhe suicide per koi achchi book de sakte hain. \n" +
                            "Librarian: Nahin bilkul nahin, Mujhe pata hai aap mujhe wo wapas nahin denge.");

            setFunnyShayariJson("000037",
                    "Ek padosan Ne Sunita Se Kaha: Are sunita gajab Ho Gaya.dekh to Pados Ki do Auraten teri Saas ki pitaai kar Rahi Hain. \n" +
                            "Sunita padosan Ke Sath chat per Aayi Aur chhupkar pitaai Dekhane Lagi. padosan Ne Pucha, Aap Madad Karane Nahi Jayengi ? \n" +
                            "Sunita: Nahi nahin do Hi bahot Hain ");

            setFunnyShayariJson("000038",
                    "Student: sir, kya aap mujhe us kaam ke liye bhi saza denge jo main nahin kiya hai?\n" +
                            "Sir: Nnahin Nahin, Bilkul Nahin.\n" +
                            "Student: Sir, maine aaj ka homework nahin kiya hai.\n");

            setFunnyShayariJson("000039",
                    "Ek aurat: Jab tumhara talak hua tha tab to tumhara ek hi bachcha tha.ab 3 kaise? \n" +
                            "Doosri: Who kabhi kabhi maafi mangne aa jate the. ");

            setFunnyShayariJson("000040",
                    "Boy: Bus,train or ladki ek jesi hoti hai,ek jati hai to dusri aa jati hai \n" +
                            "Girl: Taxi, Autoriksha or ladke ek jaise hote hai, ek bulao 4 chale \n" +
                            "Aate hai..!!!");

            setFunnyShayariJson("000041",
                    "Teacher: Jis aadmi ko sunai naa de use English me kya kahenge?\n" +
                            "Santa: Sir jo marzi keh do usko konsa kuch sunai\n" +
                            "dega.");

            setFunnyShayariJson("000042",
                    "Aishwarya's Baby in school..\n" +
                            "Teacher- Who is ur grandpa?\n" +
                            "Baby- Big B :)\n" +
                            "Teacher- Who is ur mother?\n" +
                            "Baby- Miss World\n" +
                            "Teacher- Who is ur father?\n" +
                            "Baby- No Idea Sir Ji..");

            setFunnyShayariJson("000043",
                    "Interviewer: Alia, according to you, which is the best team in IPL 7 so far?\n" +
                            "Alia Bhatt: Sunrisers Hyderabad because all have orange caps.");

            setFunnyShayariJson("000044",
                    "Alia Bhatt in Arnab Goswami's studio\n" +
                            "Arnab Goswami: Alia, Who will win the elections?\n" +
                            "Alia: Aam aadmi party because its 'aam' ka season.");

            setFunnyShayariJson("000045",
                    "Jija: Suno jara.\n" +
                            "Saali: Chup jiju, Khate time baat nahi karte,\n" +
                            "Khaane ke baad\n" +
                            "Saali: Ab bolo\n" +
                            "Jija: Teri plate mein cockroch tha, aur ban le Heroine!");//F

            setFunnyShayariJson("000046",
                    "Saali: kya kar rahe ho?\n" +
                            "Jija: Makhiyan maar raha hoon.\n" +
                            "Saali: kitni maari?\n" +
                            "Jija: 3 male or 2 female\n" +
                            "Saali: Kaise?\n" +
                            "Jija: 3 sharab ki bottle pe thi or do phone pe!!!");

            setFunnyShayariJson("000047",
                    "Chotu ko dadi godi me sula rhi thi tab\n" +
                            "Chotu bola : Dadi ham log hamesa 5 hi rahenge, Tum Papa, Mammy, Mein aur Didi.\n" +
                            "Dadi : Nahi re, Teri shadi hote hi 6 ho jayenge.\n" +
                            "Chotu : Didi ki shadi hone par fir 5 ho jayenge.\n" +
                            "Dadi : Tuje bachha hoga to fir 6 ho jayenge.\n" +
                            "Chotu : Aur Tum marogi to fir 5 Ho jayenge.\n" +
                            "Dadi : So ja kutte……");

            setFunnyShayariJson("000048",
                    "Purani soch: Karo ya Maro.\n" +
                            "Nai soch: Marne se Phle kuch karo!\n" +
                            "Ekdam Nai soch: Jab tak kuch kar nahi lete maro mat!\n" +
                            "Hamari Soch: Koi Bataega Sala karna kya hai?");

            setFunnyShayariJson("000049",
                    "Kaash Pyaar Ka Insurance Karwaya Jata,\n" +
                            "Pyar Karne Se Pehle Premium Bharwaya Jata,\n" +
                            "Agar Pyar Me Wafa Mili To Theek Varna,\n" +
                            "Jo Kharcha Hota Uska Claim Dilwaya Jata.");

            setFunnyShayariJson("000050",
                    "Bahut Khoobsurat Ho Tum Phool Ki Tareh,\n" +
                            "Khud Ko Duniya Ki Nazar Se Bachaya Karo,\n" +
                            "Sirf Aankhon Me Kajal Hi Kafi Nahi,\n" +
                            "Gale Me Nimbu-Mirch Bhi Latkaya Karo.");
            
        } catch (JSONException jex) {
            jex.printStackTrace();
        }
    }

    public void setFunnyShayariJson(String jsonId, String jsonMessage) throws JSONException {
        funnyJson = new JSONObject();
        funnyJson.put(JSON_ID, JSON_FUNNY_ID + jsonId);
        funnyJson.put(JSON_TITLE, JSON_FUNNY_TITLE);
        funnyJson.put(JSON_MESSAGE, jsonMessage);
        funnyJsonArray.put(funnyJson);
    }

    public JSONArray getFunnyJsonArray() {
        return funnyJsonArray;
    }

    public void setFunnyJsonArray(JSONArray funnyJsonArray) {
        this.funnyJsonArray = funnyJsonArray;
    }
}
