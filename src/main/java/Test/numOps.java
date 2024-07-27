package Test;

public class numOps {
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int r1 = Operation.sub(a, b);
        int r2 = new Operation().add(a,b);
        System.out.println(r1+" "+r2);
    }
}
