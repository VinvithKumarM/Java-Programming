package generalCoding;

import java.util.HashMap;
import java.util.Map;

public class countOfCharacters {

    public String getCountOfChars(){
        StringBuilder sb = new StringBuilder();
        String  input = "abcbeaa";

        if(input.length() ==1) return input+"1";

        Map<Character, Integer> inputMap = new HashMap<>();
        for(Character c: input.toCharArray()){
            if(inputMap.containsKey(c)){
                int count = inputMap.getOrDefault(c, 0);
                inputMap.put(c, count+1);
            }else{
                inputMap.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> k : inputMap.entrySet()){
            sb.append(k.getKey()).append(k.getValue());
        }

        return sb.toString();
    }
}
