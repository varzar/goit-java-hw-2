import java.lang.String;

public class NameEncoderDecoder {
    public String encode(String name){
        String codeName = name.replace("e", "1")
                              .replace("u", "2")
                              .replace("i", "3")
                              .replace("o", "4")
                              .replace("a", "5");
        return "NOTFORYOU" + codeName + "YESNOTFORYOU";
    }
    public String decode(String name){
        String decodeName = name.replace("1", "e")
                                .replace("2", "u")
                                .replace("3", "i")
                                .replace("4", "o")
                                .replace("5", "a");
        return decodeName.replace("YESNOTFORYOU", "")
                         .replace("NOTFORYOU", "");
    }
}
