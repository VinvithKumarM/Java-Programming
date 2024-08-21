package arrays;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args){
        RemoveDupsFromSortedArray removeDupsFromSortedArray = new RemoveDupsFromSortedArray();

        System.out.println((Arrays.toString(removeDupsFromSortedArray.removeDuplicates())));
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDupsFromSortedArray.removeDuplicatesAndSendCount(nums));
        int[] prices = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStocks bestTimeToBuyAndSellStocks = new BestTimeToBuyAndSellStocks();
        System.out.println(bestTimeToBuyAndSellStocks.getBestTimeToBuyAndSellStocks(prices));
    }
}
