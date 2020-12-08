package com.wtxcompsci;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner inf = new Scanner(new File(("input.dat")));

        int largest = -1;

        ArrayList<String> list = new ArrayList<>();

        while(inf.hasNext()){
            list.add(inf.nextLine());
        }

        for(String item: list){
            System.out.println(item);
            int val = getSeatID(item);
            System.out.println(val);
            if(val>largest){
                largest = val;
            }
        }
        
        
        System.out.println(largest);
    }

    public static int getSeatID(String pass){
        int seatID=8;

//        boolean[] rows = new boolean[128];
//        boolean[] seats = new boolean[8];
//
//        Arrays.fill(rows,true);
//        Arrays.fill(seats,true);

        System.out.println(pass);

        String[] steps = pass.split("");
        int start = 0, end = 127;
        for(int i = 0; i<7; i++){
            System.out.println(i+": "+steps[i]);
            if(steps[i].equals("F")){
                end = (start + end) / 2 - 1;
            }
            if(steps[i].equals("B")){
                start = (start + end)/2;
            }
//           flipList(rows,start,end);
            System.out.println(start+" "+ end);

        }
        int row = end;
        start = 0;
        end = 7;
//        System.out.println(Arrays.toString(seats));
        for(int i= 7; i<10; i++){
            System.out.println(i+": "+steps[i]);
            if(steps[i].equals("R")){
                end = (start + end) / 2 -1;
            }
            if(steps[i].equals("L")){
                start = (start + end)/2+1;
            }
//            flipList(seats,start,end);
//            System.out.println(Arrays.toString(seats));
            System.out.println(start+" "+ end);
        }

        int col = end;
        seatID = seatID * row + col;

        return seatID ;
    }

//    public static void flipList(boolean[] l, int s, int f){
//
//        for(int i=s; i<f; i++)
//            l[i]=false;
//    }
}
