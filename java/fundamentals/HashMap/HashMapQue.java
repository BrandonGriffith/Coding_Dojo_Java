import java.util.HashMap;

public class HashMapQue {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("beep", "beep beep beeeeeeep");
        map.put("boop", "boop boop booooooop");
        map.put("la la", "la la la la laaaaa");
        map.put("ha ha", "ha ha ha ha haaaaa");

        String val = map.get("boop");
        System.out.println(val);

        for (String key : map.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, map.get(key)));
        }
    }
}
