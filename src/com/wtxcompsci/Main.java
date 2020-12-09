package com.wtxcompsci;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) throws IOException {
//        Scanner inf = new Scanner(new File(("input.dat")));
//
//        int largest = -1;
//
//        ArrayList<String> list = new ArrayList<>();
//
//        while(inf.hasNext()){
//            list.add(inf.nextLine());
//        }
//
//        ArrayList<Integer>  seats = new ArrayList<>();
//        boolean[][] seatMap = new boolean[128][8];
//
//        for(String item: list){
////            System.out.println(item);
//            int val = getSeatID(item, seatMap);
//
//            seats.add(val);
//
//            if(val>largest){
//                largest = val;
//            }
//        }
//
//        Collections.sort(seats);
//        System.out.println(largest);
//        System.out.println(seats);
//        System.out.println(seats.size());
//        for(int z = 0; z < seats.size()-1; z++){
//            if((seats.get(z+1)-seats.get(z))==2)
//                System.out.println(seats.get(z) + " " + seats.get(z+1));
//        }
//
//        for(int c=0; c<8; c++) {
//            for (int r = 0; r < 128; r++)
//                System.out.print(r+" "+c+": "+seatMap[r][c] + " | ");
//            System.out.println();
//        }

        Scanner reader = new Scanner(new File("input.dat"));
        SortedSet<Integer> seats = new TreeSet<Integer>();

        int max = 0;
        while (reader.hasNext()) {
            String bin = reader.nextLine().replaceAll("[FL]", "0").replaceAll("[BR]",
                    "1");
            seats.add(Integer.parseInt(bin, 2));
            max = Math.max(max, seats.last());
        }

// part 1
        System.out.println("max seat id: " + max);

        int seat = max;
        while (seats.contains(seat)) {
            seat--;
        }

// part 2
        System.out.println("missing seat: " + seat);


    }
}
//    public static int getSeatID(String pass, boolean[][] s){
//        int seatID=8;
//
////        boolean[] rows = new boolean[128];
////        boolean[] seats = new boolean[8];
////
////        Arrays.fill(rows,true);
////        Arrays.fill(seats,true);
//
////        System.out.println(pass);
//
//        String[] steps = pass.split("");
//        int start = 0, end = 127;
//        for(int i = 0; i<7; i++){
////            System.out.println(i+": "+steps[i]);
//            if(steps[i].equals("F")){
//                end = (start + end) / 2 ;
//            }
//            if(steps[i].equals("B")){
//                start = (start + end+1)/2;
//            }
////           flipList(rows,start,end);
////            System.out.println(start+" "+ end);
//
//        }
//        int row = end;
//        start = 0;
//        end = 7;
////        System.out.println(Arrays.toString(seats));
//        for(int i= 7; i<10; i++){
////            System.out.println(i+": "+steps[i]);
//            if(steps[i].equals("R")){
//                end = (start + end) / 2 ;
//            }
//            if(steps[i].equals("L")){
//                start = (start + end+1)/2;
//            }
////            flipList(seats,start,end);
////            System.out.println(Arrays.toString(seats));
////            System.out.println(start+" "+ end);
//        }
//
//        int col = start;
//        seatID = seatID * row + col;
//
//        s[row][col]=true;
//        return seatID ;
//    }
//
////    public static void flipList(boolean[] l, int s, int f){
////
////        for(int i=s; i<f; i++)
////            l[i]=false;
////    }
//}
