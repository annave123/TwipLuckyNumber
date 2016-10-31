package com.company;
        import java.util.Random;

public class perfectSqur {
    public int getPass(){

    private int[] items = new int[]{1,4,9,16,25,36,49,64,81,100,121,144,169,196,225,256,324,361,400,441,484,529,576,625,676,729,784,841,900};

    private Random rand = new Random();

    public int getRandArrayElement(){
        return items[rand.nextInt(items.length)];
    }
}