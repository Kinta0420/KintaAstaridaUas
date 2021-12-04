package com.example.kintaastarida.jenis;

import com.example.kintaastarida.R;
import java.util.ArrayList;
public class DataBuah {

    static ArrayList<Buah> buahs = new ArrayList<>();

    public static ArrayList<Buah> getBuahByJenis (String jenis_buahn) {
        buahs.clear();

        switch (jenis_buahn.toLowerCase()) {
            case "anggur":
                dataAnggur(); break;
            case "jeruk":
                dataJeruk(); break;
            case "mangga":
                dataMangga(); break;
        }
        return buahs;
    }

    static void dataAnggur () {
        buahs.add(
                new Buah("Anggur Hijau", "Timur Tengah", "Anggur hijau merupakan varian anggur yang tidak kalah populer dibanding jenis lainnya. Manfaat anggur hijau sangat beragam, bahkan anggur hijau menjadi alternatif buah yang sehat dan rendah kalori, tidak memiliki lemak dan banyak nutrisi.", R.drawable.anggur_hijau)
        );
        buahs.add(
                new Buah("Anggur Hitam", "Asia dan Yunani", "Tidak kalah dengan warna buah anggur lainya, buah anggur warna hitam sangat digemari konsumen maupun kolektor, dari segi rasa dan penampilan sangat menggoda.", R.drawable.anggur_hitam)
        );
        buahs.add(
                new Buah("Anggur Merah", "Timur Tengah", "Dalam bahasa latin buah anggur dikenal dengan Vitis vinefera atau vitis labrusca. Buah ini termasuk tanaman buah berupa perdu yang merambat dan digolongkan dalam keluarga vitaceae.", R.drawable.anggur_merah)
        );
    }

    static void dataJeruk () {
        buahs.add(
                new Buah("Jeruk Bali", "Bali", "Jeruk bali, jeruk besar, atau pomelo (bahasa Inggris: pomelo, ilmiah: Citrus grandis, C. maxima) merupakan jeruk penghasil buah terbesar.", R.drawable.jeruk_bali)
        );
        buahs.add(
                new Buah("Jeruk Kintamani", "Bali", "Jeruk Kintamani memang sangat populer di pulau Bali, rasanya yang manis membuat para pelangganya setia.", R.drawable.jeruk_kintamani)
        );
        buahs.add(
                new Buah("Jeruk Nipis", "Asia dan Amerika", "Jeruk nipis (Lat Citrus aurantifolia; Famili: Rutaceae) merupakan jenis tumbuhan yang masuk kedalam suku jeruk-jerukan, tersebar di Asia Dan Amerika Tengah dikenal juga sebagai jeruk pecel.", R.drawable.jeruk_nipis)
        );
    }

    static void dataMangga () {
        buahs.add(
                new Buah("Mangga Golek", "Probolinggo", "Jenis ini populer di kalangan pecinta mangga dengan bentuk lonjongnya. Mangga unggulan ini memiliki rasa manis dengan tekstur buahnya yang tidak berserat.", R.drawable.mngga_golek)
        );
        buahs.add(
                new Buah("Mangga Apel", "Bekasi", "Disebut mangga apel karena bentuknya bulat seperti buah apel. Mangga asal Singapura ini berwarna hijau kemerahan.", R.drawable.mangg_apel)
        );
        buahs.add(
                new Buah("Mangga Manalagi", "Probolinggo", "Mangga manalagi tergolong ke dalam varietas mangga yang berukuran kecil hingga sedang.", R.drawable.mangga_manalagi)
        );
    }
}
