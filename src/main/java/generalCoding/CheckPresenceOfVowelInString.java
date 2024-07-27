package generalCoding;

public class CheckPresenceOfVowelInString {

    public boolean presenceOfVowel(String str){
        if(str== null || str.isEmpty()){
            throw new IllegalArgumentException("Not a valid input");
        }
        for(char c : str.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) return true;
        }
        return false;
    }
}
