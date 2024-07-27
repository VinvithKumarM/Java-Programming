package matrices;

public class MatricesMainApp {
   public static void main(String args[]){
       int i, j;
       int n=5;
       for(i=0;i<n;i++){
        for(j=i; j<n-1;j++){
            System.out.print("+");
        }
        for(j= n-1-i;j<n ;j++){
            System.out.print("-");
        }
        System.out.println();
       }
   }


}
