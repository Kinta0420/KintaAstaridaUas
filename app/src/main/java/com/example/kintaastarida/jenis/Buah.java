package com.example.kintaastarida.jenis;

public class Buah {

    String namaBuah, asalBuah, descBuah;
    int gambarBuah;

    public Buah(String namaBuah, String asalBuah, String descBuah, int gambarBuah) {
        this.namaBuah = namaBuah;
        this.asalBuah = asalBuah;
        this.descBuah = descBuah;
        this.gambarBuah = gambarBuah;
    }

    public String getNamaBuah() {
        return namaBuah;
    }

    public String getAsalBuah() {
        return asalBuah;
    }

    public String getDescBuah() {
        return descBuah;
    }

    public int getGambarBuah() {
        return gambarBuah;
    }
}
