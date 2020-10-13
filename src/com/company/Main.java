package com.company;

public class Main {

    public static void main(String[] args) {
	int[] randomArray = new int[20];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() *100 + 1);
        }
    }
}
