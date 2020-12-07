package com.wtxcompsci;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner inf = new Scanner(new File(("input.dat")));

        int largest = -1;

        ArrayList<String> list = new ArrayList<>();

        while(inf.hasNext()){
            list.add(inf.nextLine());
        }

        for(String item: list){
            int val = getSeatID(list);
            if(val>largest){
                largest = val;
            }
        }
        
        
        System.out.println(largest);
    }

    public static int getSeatID(String pass){
        int seatID;


        return seatID;
    }
}
