package com.bilgeadam;

public class SelamTest {

    public static void main(String[] args) {
        Selam nesne = new Selam();

        String cevap = nesne.selamSoyle("ali");
        String cevap1 = nesne.selamSoyle("");

        System.out.println(cevap);
        System.out.println(cevap1);

    }

}
