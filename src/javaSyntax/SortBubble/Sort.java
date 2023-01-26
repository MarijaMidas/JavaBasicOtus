package javaSyntax.SortBubble;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000);
        }
        int[] numsCopy = Arrays.copyOf(nums,1000);
        System.out.println(new Date().getTime());
        bubbleSort(nums);
        System.out.println(new Date().getTime());
        System.out.println("-------------------");
        System.out.println(new Date().getTime());
        Arrays.sort(numsCopy);
        System.out.println(new Date().getTime());
    }
    public static int[] bubbleSort(int[]num) {
        for (int i = num.length - 1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if(num[j]>num[j+1]){
                    int cashNum = num[j+1];
                    num[j+1] = num[j];
                    num[j] = cashNum;
                }
            }
        }
        return num;
    }
}
