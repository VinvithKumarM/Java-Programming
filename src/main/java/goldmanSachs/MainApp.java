package goldmanSachs;

public class MainApp {

    public static void main(String[] args){
        int[] arr = {10, 20, 20, 10, 10, 20, 5,5,5,5,10, 20};
        IntegerFrequencies integerFrequencies = new IntegerFrequencies();
        boolean a = integerFrequencies.getIntegerFrequencies(arr);
        System.out.println("Frequencies of Numbers in Array are unique : "+a);
        int[] pivotArray = {1, 2, 3, 4, 3, 2, 1};
        int[] a1 = {4,2,0,3,2,5};
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println("Water trapped method1 :  "+trappingRainWater.getTrappedRainWater(a1));
        System.out.println("Water trapped method2 :  "+trappingRainWater.trapping_rain_water(a1));
        MergeIntervals mergeIntervals = new MergeIntervals();
        mergeIntervals.merge();
    }
}
