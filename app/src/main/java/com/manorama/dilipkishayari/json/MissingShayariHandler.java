package com.manorama.dilipkishayari.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MissingShayariHandler {

    public static String JSON_TITLE = "JSON_TITLE";
    public static String JSON_MESSAGE = "JSON_MESSAGE";
    public static String JSON_ID = "JSON_ID";
    public static String JSON_MISSING_ID = "MISSING_ID_";
    public static String JSON_MISSING_TITLE = "Missing Shayari";
    private JSONObject missingJson;
    private static JSONArray missingJsonArray;

    public void createMissingJson() {
        missingJsonArray = new JSONArray();

        try {
            setMissingShayariJson("000001",
                    "Teri Yaadon Ke Sahare Duniya Mein Rah Lete Hai,\n" +
                            "Teri Juddai Ka Gam Chupchap Sah Lete Hai,\n" +
                            "Samjhaya Dilko Yeh Raaz Chupana Hai,\n" +
                            "Par Aansu Banke Wo Sab Kah Dete Hai.");

            setMissingShayariJson("000002",
                    "Safar Wahi Tak Hain Jaha Tak Tum Ho,\n" +
                            "Nazar Wahi Tak Hain Jaha Tak Tum Ho,\n" +
                            "Phool Bahut Dekhe Hain Is Gulshan Mein,\n" +
                            "Khusbu Wahi Tak Hain Jaha Tak Tum Ho.");

            setMissingShayariJson("000003",
                    "Chupke se dhadkan me utar jaayenge,\n" +
                            "Raahen Ulfat me had se guzar jaayenge,\n" +
                            "Aap jo hamen itna chahenge,\nHum to aapki saanson me pighal jaayenge.");

            setMissingShayariJson("000004",
                    "Har kadam Har pal saath hai,\nDur hokar bhi hum aapke pass hai,\nAapko ho na ho par hume aapki kasam,\nAapki kami ka har pal ehsaas hai.");

            setMissingShayariJson("000005",
                    "Aankho ki gehrai ko samajh nahi sakte,\nHonto se kuch keh nahi sakte,\nKaise baya kare hum aapko yeh dil ka haal ki,\nTumhi ho jiske bageir hum reh nahi sakte.");

            setMissingShayariJson("000006",
                    "Khoya itna kuch ki hume paana na aaya,\nPyar kar to liya par jatana na aaya,\nAa gaye tum is dil mein pehli hi nazar mei,\nBas hame aaoke dil mein samana na aaya.");

            setMissingShayariJson("000007",
                    "Jis Din Sapno Me Unka Didaar Ho Jata Hai,\nUs Raat Sona Bhi Duswaar Ho Jata Hai,\nMarta Hai Koi Hum Par Bhi,\nYe Soch Kar Apne Aap Se Pyaar Ho Jata Hai");

            setMissingShayariJson("000008",
                    "Chehre pe mere zulfo ko phailao kisi din,\nKyu roz sirf garajate ho,\nBaras jao kisi din,\nKhushbu ki tarah guzro mere dil ki gali se,\nPhulon ki tarah mujpe bikhar jao kisi din.");

            setMissingShayariJson("000009",
                    "Na gulfaam chahiye,\nNa salaam chahiye,\nNa mubarak ka koi paigam chahiye,\nJisko pee ker hosh urr jayain,\nLabon ko aisa.. jaam chahiye!!");

            setMissingShayariJson("000010",
                    "Tujhe palko pe bithane ko jee chahta hai\nTeri baho se lipatne ko jee chahta hai,\nKhubsurti ki intehaa hain tu,\nTuje zindagi me basane ko jee chahta hai.");

            setMissingShayariJson("000011",
                    "Zindagi Me Apki ahmiyat Ham Apko Bata Nahi Sakte\nDil Me Apki Jagah Ham Apko Dikha Nahi Sakte\nKuch Rishtey Bhut Anmol Hote Hai\nIsse Zyada Ham Apko Samjha Nahi Sakte");

            setMissingShayariJson("000012",
                    "Na chaho kisiko itna ki,\n Chahat tumhari majburi ban jaaye, \n" +
                            "Chaho kisiko itna ki tumhara,\n pyar uske liye jaruri ban jaaye.");

            setMissingShayariJson("000013",
                    "Ankho me aansu aa jate hai, \n" +
                            "phir bhi labo pe hasi rakhni padti hai, \n" +
                            "Yeh mohobbat bhi kya cheez hai yaarro, \n" +
                            "jisse karte hai usise chupani padti hai");

            setMissingShayariJson("000014",
                    "Chale gaye ho dur kuchh pal keliye,\n" +
                            "Door rehkar bhi kareeb ho har pal ke liye,\n" +
                            "Daise yaad na aye aapki ek pal ke liye,\n" +
                            "Jab dil mein ho aap har pal ke liye!");

            setMissingShayariJson("000015",
                    "Jaha sar juk jaye, vahi kudda ka ghar hai,\n" +
                            "Jaha har nadhi mil jaye, vahi samudar hai,\n" +
                            "Iss zindgi me dard to sab dete hai,\n" +
                            "Jo dard samjhe vahi saccha humsafar hai.");

            setMissingShayariJson("000016",
                    "Ek Ada Aapki Dil Churaane Ki \n" +
                            "Ek Ada Aapki Dil Main Bus Jaane Ki \n" +
                            "Ek Chehra Aapka Chaand Sa\n" +
                            "Ek Zid Humari Chaand Ko Paane Ki.");

            setMissingShayariJson("000017",
                    "Usne Kaha Bhool Jao Mujhe\n" +
                            "Hum ne bi Rotay Hoye Keh Diya\n" +
                            "Kon Ho tum");

            setMissingShayariJson("000018",
                    "Shaam Hote Hi Chiragon Ko Bujha Deta Hoon \n" +
                            "Yeh Dil Hi Kaafi Hai Teri Yaad Main Jalne Ke Liye");

            setMissingShayariJson("000019",
                    "Aaj Muddat Baad Deedar E Yaar Hua Tha\n" +
                            "Wohi Galiyan Wohi Raasta\n" +
                            "Jaha Mujhe Pyar Hua Tha.");

            setMissingShayariJson("000020",
                    "Suni Jindagi me halchal si mehsoos hui \n" +
                            "Bejaan dil ki aaj dhadkan mehsus hui \n" +
                            "Jane aaj kyu aisa laga \n" +
                            "Shayad aapki kami mehsoos hui");

            setMissingShayariJson("000021",
                    "Kismat Kisi Ki Kisi Se Ruthe Na\n" +
                            "Yeh Saath Kisi Ka Bhi Kisi Se Chhute Na\n" +
                            "Jara Pyar Karna Soch Samajhkar\n" +
                            "Dekhna Dil Kahin Kisi Ka Tute Na");

            setMissingShayariJson("000022",
                    "Aadat hai unki yaad aane ki\n" +
                            "In aankho ko unki ek jhalak pane ki \n" +
                            "Hamari to tammana thi unhe pane ki,\n" +
                            "par unki aadat hai hame tadpane ki.");

            setMissingShayariJson("000023",
                    "Had se ziyada jab unka intzaar ho gaya, \n" +
                            "Aayenge wo nazar hume aitbaar ho gaya, \n" +
                            "Chand lamhon k liye band hoi thin ye aankhain, \n" +
                            "Un lamhon me hi unka deedar ho gaya.");

            setMissingShayariJson("000024",
                    "Aankhe Aksar Woh Baatein Kah Jaati Hain\n" +
                            "Jo Baatein Hum Jubaa Par La Nahi Paate");

            setMissingShayariJson("000025",
                    "Kuchh Is Tarha Se Saudaa Kiya Mujhse Waqt Ne\n" +
                            "Ke Tajurbe De Kar Wo Meri Maasoomiyat Le Gaya");

            setMissingShayariJson("000026",
                    "Adat Badal Don Kese Tere Intizar Ki\n" +
                            "Ye Bat Ab Nahi Hai Mere Ikhtiyar Ki");

            setMissingShayariJson("000027",
                    "Tere Pyar Ne Inna Menu Deewana Krta\n" +
                            "Hor Koi Tenu Dekhe Sanu Changa Ni Lagda");

            setMissingShayariJson("000028",
                    "Ajab Apna Haal Hota\n Jo Vishaale Yaar Hota\n" +
                            "Kabhi Jaan Sadke Hoti\n Kabhi Dil Nishaar Hota");

            setMissingShayariJson("000029",
                    "Tere Waade Par Sitamgar, Abhi Aur Sabr Karte\n" +
                            "Agar Apni Zindagi Ka Hamein, Eitbaar Hota");

            setMissingShayariJson("000030",
                    "Kisiko mohabbat ki sachai mar dalegi,\n" +
                            "kisiko mohabbat ki gehrai mar dalegi, \n" +
                            "kar ke mohabbat koi nahi bachega,\n" +
                            "jo bach gaya use tanhai mar dalegi.");

            setMissingShayariJson("000031",
                    "Hum Kabhi aap se Khafa ho nahi sakte, \n" +
                            "Yeh Dil ke Rishtey Bewafa ho nahi sakte, \n" +
                            "Aap bhale hameh bhulake so jao, \n" +
                            "Hum aapko yaad kiye bina soh nahi sakte.!!");

            setMissingShayariJson("000032",
                    "Pane se khone ka maza aur hai, \n" +
                            "Band ankho se dekne ka maza aur hai, \n" +
                            "asu bane lafz aur lafz gazal, \n" +
                            "teri yadon ke sath \n" +
                            "Jine Ka Maza Kuch aur hai.");

            setMissingShayariJson("000033",
                    "Unhe to Phursat nahi milney ki humse,\n" +
                            "Aur hamara waqt guzarta hai unki fariyaad karke. \n" +
                            "Agar aye wo meri maut pe,\n" +
                            "To keh dena ABHI soye hain tumhe yaad karke.");

            setMissingShayariJson("000034",
                    "Wo kare shikwa tum karo shikayat ye to pyar nahi,\n" +
                            "ager kar sako to karo itna ki\n" +
                            "kabhi pyar me koi gila na rahe,\n" +
                            "har zakhm ko sah lo hans kar tum,\n" +
                            "magar dilme koi gam na rahe.");

            setMissingShayariJson("000035",
                    "Suno mujhe sirf itna bata do\n" +
                            "Intzaar karu ya badal jau tumhari tarah");

            setMissingShayariJson("000036",
                    "Ajab si Ik Justaju Hai Zindagi Me\n" +
                            "Ussi Ko Dhoondti Hoon Har Kisi Me");

            setMissingShayariJson("000037",
                    "Suna Hai Ishq Ka Shok Nahi Hai Tumhain\n" +
                            "Magar Barbad Tum Kamal Ka Karty Ho");

            setMissingShayariJson("000038",
                    "Akele To Hum Phale Bhi The\n" +
                            "Phir Na Jaane Kyu Tere Janne Ke Baad Tanha Hoge");

            setMissingShayariJson("000039",
                    "Kuch log mujhe apna kaha kartey they\n" +
                            "Sach kahun Woh sirf kaha hi kartey they");

            setMissingShayariJson("000040",
                    "Ya mere khuda kuch to reham kr\n" +
                            "Ya to use dil se nikal de ya uske dil me panaah de");

            setMissingShayariJson("000041",
                    "Dhund Ne Par Wohi Milenge Jo Kho Gaye The\n" +
                            "Wo Kabhi Nahi Milenge Jo Badal Gaye Hai");

            setMissingShayariJson("000042",
                    "Mujhe Bhi Sikha Do Bhool Jane Ka Huner\n" +
                            "Mujh Se Raaton Ko Uth Uth Kar Roya Nahi Jata");

            setMissingShayariJson("000043",
                    "Kisi ki yaad main itna udaas na huwa kar\n" +
                            "Log naseeb se milte hain udaasiyon se nahi");

            setMissingShayariJson("000044",
                    "Ye laazmi nahi ke hamein har din yaad karo\n" +
                            "Magar bilkul hi bhool jao ijazat nahi tumhein");

            setMissingShayariJson("000045",
                    "Aaro gye yad ik din\n tum humko ro ro ke dost\n" +
                            "Ke tha koi pagal tum ko\n tum se zada chahny wala");

            setMissingShayariJson("000046",
                    "Mere Alfazo Ko sunne Wale To Hazaro Hai\n" +
                            "Par Meri Khamoshi Ko Samjhne Wala Ek Bhi Nahi");

            setMissingShayariJson("000047",
                    "Muskurati Aankho Se Afsaana Likha Tha,\n" +
                            "Shayad Aapka Meri Zindagi Mein Aana Likha Tha,\n" +
                            "Taqdeer To Dekho Mere Aansuon Ki,\n" +
                            "Inka Bhi Aapki Yaad Mein Beh Jan");

            setMissingShayariJson("000048",
                    "Baithe hain tanha kisi ki aas mein,\n" +
                            "kuch nahin yaadon ke siwa ab mere paas mein,\n" +
                            "Sochte hain kya hua jo koi nahin kareeb mere,\n" +
                            "Registaan bhi toh jeeta hai baarish Aas me.");

            setMissingShayariJson("000049",
                    "Kaise Bhula Doon Main Usko,\n" +
                            "Maut Insanon Ko Aati Hai Yadon Ko Nahi");

            setMissingShayariJson("000050",
                    "Kash Tu Bhi Ban Jaye Teri Yaadon Ki Tarah,\n" +
                            "Na Waqt Dekhe Na Bahana Bas Chali Aaye");

            setMissingShayariJson("000051",
                    "Dil ki halat kisi se kahi nahi jati,\n" +
                            "Dil ki halat aab humse sahi nahi jati,\n" +
                            "Tadapti toh hogi woh bhi meri tarha,\n" +
                            "Warna yoon kisi ki yaad har p");

            setMissingShayariJson("000052",
                    "Daru aur Cigarette peenewala insaan\n" +
                            "Kabhi matlabi nahi hota,\n" +
                            "Jise apni khudki jaan ki chinta nahi\n" +
                            "Woh bhala matlabi kaise..");

            setMissingShayariJson("000053",
                    "Bhooli Huyi Sabaa Hoon Mujhe Yaad Ki Jiye,\n" +
                            "Tum Se Kahin Milaa Hoon Mujhe Yaad Ki Jiye");

            setMissingShayariJson("000054",
                    "Yaad Rakhna Hi Mohabbat Mein Nahi Hai Sab Kuch,\n" +
                            "Bhool Jana Bhi Badi Baat Hua Karti Hai");

            setMissingShayariJson("000055",
                    "Bhoolna Tumhe Na Asaan Hoga,\n" +
                            "Jo Bhule Tumhe Vo Nadan Hoga,\n" +
                            "Aap To Baste Ho Rooh Mein Hamari,\n" +
                            "Aap Hume Na Bhule Ye Apka Ehsan Hoga");

            setMissingShayariJson("000056",
                    "Wo Jo Apna Tha Humse Hai Khafa,\n" +
                            "Pata Nahi Kis Se Huyi Thi Kya Khata,\n" +
                            "Be-Wajah Dil Nahi Tut-Taa Kisi Ka,\n" +
                            "Tum The Ya Hum The Bewafa");

            setMissingShayariJson("000057",
                    "Waqt Kehta Hai Mujhe Gawana Mat,\n" +
                            "Dil Kehta Hai Mujhe Lagana Maat,\n" +
                            "Dost Kehta Hai Mujhe Azamana Mat,\n" +
                            "Or Hum Kehta Hai Hame Bhulana Mat");

            setMissingShayariJson("000058",
                    "Sapno Ki Tarha Aakar Chali Gayi,\n" +
                            "Apno Ko Bhula Kar Chali Gayi,\n" +
                            "Kis Bhool Ki Saja Di Hamein,\n" +
                            "Usne Pahele Hasaya,\n" +
                            "Pir Rula Kar Chali Gayi");

            setMissingShayariJson("000059",
                    "Apno Ne Zehar Ka Jaam De Diya,\n" +
                            "Gairon Ne Bewafa Ka Naam De Diya,\n" +
                            "Jo Kehte They Hamein Bhool Na Jana,\n" +
                            "Unho Ne Hi Bhoolne Ka Paigam De Diya");

            setMissingShayariJson("000060",
                    "Ruthna Mat Hume Manana Nahi Aata,\n" +
                            "Diye Mat Jalana Bujhana Nahi Aata,\n" +
                            "Tum Bhul Jao Toh Tumhari Marzi,\n" +
                            "Hamein To Yoon Bhulana Bhi Nahi Aata");

            setMissingShayariJson("000061",
                    "Aaj shayari nahi bas itna sun lo \n" +
                            "Main tanha hun aur wajah tum ho.");

            setMissingShayariJson("000061",
                    "Takleef Btanay ka Man Nai Bus Itna Sunty Jao\n" +
                            "Tumhari Yaad Mai Dil Bechain Bohat Aaj Hai");

            setMissingShayariJson("000062",
                    "Tujhae khabar hai tujhe sochne ki khatir hum\n" +
                            "Bohat say kaam muqaddar pay daal dete hain");



        } catch (JSONException jex) {
            jex.printStackTrace();
        }
    }

    public void setMissingShayariJson(String jsonId, String jsonMessage) throws JSONException {
        missingJson = new JSONObject();
        missingJson.put(JSON_ID, JSON_MISSING_ID + jsonId);
        missingJson.put(JSON_TITLE, JSON_MISSING_TITLE);
        missingJson.put(JSON_MESSAGE, jsonMessage);
        missingJsonArray.put(missingJson);
    }

    public JSONArray getMissingJsonArray() {
        return missingJsonArray;
    }

    public void setMissingJsonArray(JSONArray missingJsonArray) {
        this.missingJsonArray = missingJsonArray;
    }
}
