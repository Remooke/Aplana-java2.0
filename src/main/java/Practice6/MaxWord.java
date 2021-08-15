package Practice6;

import java.util.Map;

public class MaxWord {
    private static String maxKey;
    private static int maxValue = 1;

    public static String maxCountKey(Map<String, Integer> map) {
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            if(entry.getValue() >= maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
           // System.out.println("Слово '" + entry.getKey() + "' встречается '" + entry.getValue() + "' раз(а)" );
        }
        return maxKey;
    }
}
