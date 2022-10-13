package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Nama : Syafa Trisya H
//        NIM : 2100018507
//        Kelas : J
        int handphone;

        Scanner input=new Scanner(System.in);

        int k=0;
        do {
            System.out.print("_");
            k++;
        }
        while(k<=42);
        System.out.println("\n|          program data Handphone         |");
        int l=0;
        while(l<=42){
            System.out.print("_");
            l++;
        }
        System.out.println("");
        System.out.print("Banyak data yang akan dimasukkan : ");
        handphone=input.nextInt();
        System.out.println("");

//      input
        String data[][]=new String[handphone][3];
        System.out.print("Masukan data Handphone:");
        for (int i=0; i<handphone; i++){
            System.out.println("");
            System.out.println("Data ke-"+(i+1));
            for (int j=0; j<3; j++){
                if (j==0){
                    System.out.print("Merek Handphone : ");
                }
                else if(j==1){
                    System.out.print("Asal Negara : ");
                }
                else {
                    System.out.print("Sistem Operasi : ");
                }
                data[i][j]=input.next();
            }
        }

//      output
        System.out.println("---------------------------");
        System.out.println("\nDATA HANDPHONE ");
        System.out.println("---------------------------");
        System.out.println("Merek \t\t   Negara Asal\t\tSistem Operasi \t");
        for(int i=0; i<handphone; i++) {
            for (int j=0; j<3; j++)
            {
                System.out.print(data[i][j]+"\t\t\t");
            }
            System.out.println();
        }
    }
}