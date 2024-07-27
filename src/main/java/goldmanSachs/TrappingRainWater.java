package goldmanSachs;

import java.util.Arrays;

public class TrappingRainWater {

    public int getTrappedRainWater(int[] a){

       int result = 0;
       for(int i=1; i<= a.length-2;i++){
            int lb = a[i];
            for(int j = 0; j<i;j++){
                if(a[j]>lb){
                    lb = a[j];
                }
            }

           int rb = a[i];
           for(int j = i+1; j<a.length;j++){
               if(a[j]>rb){
                   rb = a[j];
               }
           }
           int wl = Math.min(rb, lb); //water level
           int tw = wl-a[i];
           result = result+tw;
       }

        return result;
    }

    public int trapping_rain_water(int[] A) {
        int res = 0;
        if (A.length == 0) {
            return 0;
        }
        int[] leftMax = new int[A.length];

        int[] rightMax = new int[A.length];

        leftMax[0] = A[0];

        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], A[i]);
            System.out.println(" LeftMax  : "+leftMax[i]);
        }

        rightMax[A.length - 1] = A[A.length - 1];

        for (int j = rightMax.length - 2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j + 1], A[j]);
            System.out.println(" RightMax  : "+rightMax[j]);
        }
        System.out.println("Leftmax array : "+ Arrays.toString(leftMax));
        System.out.println("Rightmax array : "+ Arrays.toString(rightMax));
        for (int x = 0; x < A.length; x++) {
            res += Math.min(leftMax[x], rightMax[x]) - A[x];
        }
        return res;
    }
}
