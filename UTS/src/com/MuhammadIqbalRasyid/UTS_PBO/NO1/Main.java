package com.MuhammadIqbalRasyid.UTS_PBO.NO1;

public class Main {
    public static void main(String[] args) {
        //constructor
        PemainBola[] pemain = {
                new PemainBola("Cristiano Messi",180,"Striker\t"),
                new PemainBola("Bejo Leonardo",167,"Midfielder"),
                new PemainBola("Alfa Mid\t",190,"Defender")
        };
        //cetak data pemain
        System.out.println("------------------------------------------------------------------");
        System.out.println("||\t\tNama\t\t\t||\t\tTinggi\t\t||\t\tPosisi\t\t||");
        System.out.println("||--------------------------------------------------------------||");
        for (PemainBola player : pemain){
            System.out.print("||\t" + player.getNama() + "\t\t");
            System.out.print("||\t\t" + player.getTinggi() +"\t\t");
            System.out.print("||\t" + player.getPosisi() +"\t\t");
            System.out.println("||");
        }
        System.out.println("------------------------------------------------------------------");
    }
}
