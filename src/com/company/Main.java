package com.company;

import java.util.Scanner;
public class Main {
    static int pilihan;

    public static void main(String[] args) {
        pilihMenu();
    }

    static void pilihMenu(){
        do{
            System.out.print("pilih angka 1-9 : ");
            Scanner scanner = new Scanner(System.in);
            pilihan = scanner.nextInt();

            if (pilihan == 0 || pilihan>=10){
                System.out.println("Anda Memilih angka yang salah");
                pilihMenu();
            }else {
                Buah buah1 = new Buah();
                buah1.showBuah();
                DetailBuah buah = new DetailBuah();
                buah.showBuah(pilihan);
            }
        }while (pilihan!=0 && pilihan<=10);
    }
}
