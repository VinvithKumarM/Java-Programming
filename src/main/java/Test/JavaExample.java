package Test;

public class JavaExample {

    /*
    * Input : 123456.789
Expected Output : 987654.321*/

    public String reverseString(String input){
        StringBuilder sb = new StringBuilder();
        String number = input.replaceAll("[.]","");
        char[] a = number.toCharArray();
        for(int i = a.length-1; i >=0; i--){
            sb.append(a[i]);
        }
        double b = Double.parseDouble(sb.toString());
        b = b/1000;

return Double.toString(b);
    }

}
