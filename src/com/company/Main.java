package com.company;

public class Main {

    public static void main(String[] args) {
        int[] randomArray = new int[20];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(maxOfArrey(randomArray));
    }

    public static int maxOfArrey(int[] nums) {
        int max = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int oddNums(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static int countEvenNumbers(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                counter ++;
            }
        }
        return counter;
    }
    
    public static int sumOfOddNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        return sum;
    }

}
