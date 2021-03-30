package com.example.movieplaylist;

import java.util.ArrayList;

public class FilmData {
    private static String [] filmtitle = {
            "Ada Apa Dengan Cinta 2",
            "Avengers Endgame",
            "Annabelle",
            "Avatar",
            "Fast and Furious 7",
            "Frozen 2",
            "Imperfect",
            "Insidious",
            "Joker",
            "Jumanji The Next Level",
            "Jurasic World",
            "Money Heist",
            "Nanti Kita Cerita Tentang Hari Ini",
            "Parasite",
            "Spiderman Far From Home",
            "Star Wars The Last Jedi",
            "The Greatest Showman",
            "The Lion King",
            "To All The Boys I've Loved Before",
            "Train To Busan"
    };

    private static String [] filmdescription = {
            "Ada Apa Dengan Cinta 2 (AADC 2)  merupakan sekuel film Ada Apa Dengan Cinta? yang rilis tahun 2002 silam. Di season kedua ini, film tersebut masih menceritakan romansa Cinta dan Rangga bertahun-tahun kemudian setelah berpisah saat mereka lulus SMA.",
            "Avengers Endgame merupakan kelanjutan dari film Avengers Infinity War, dimana kejadian setelah Thanos berhasil mendapatkan semua infinity stones dan memusnahkan 50% semua mahluk hidup di alam semesta. Akankah para Avengers berhasil mengalahkan Thanos?",
            "Annabelle Annabelle adalah film horor supranatural Amerika tahun 2014 yang disutradarai oleh John R. Leonetti, diproduksi oleh James Wan, dan ditulis oleh Gary Dauberman. Film ini adalah prekuel dan spin-off dari The Conjuring dan terinspirasi oleh boneka nyata bernama Annabelle.",
            "Avatar adalah film fiksi ilmiah petualangan Amerika Serikat tahun 2009 yang disutradarai oleh James Cameron. Mengisahkan kehidupan manusia di masa depan yang mengalami krisis energi.",
            "Fast and Furious 7 adalah sebuah film aksi, laga dan balap mobil Amerika Serikat yang merupakan film ketujuh dari serial Fast & Furious. Film ini akan mengupas 'pensiunnya' Brian O'Conner dari dunia balap, sebagaimana diketahui, karena pemeran Brian, Paul Walker, telah meninggal dunia.",
            "Frozen 2 menceritakan tentang Anna, Elsa, Kristoff, Olaf dan Sven pergi meninggalkan Arendelle untuk melakukan perjalanan ke sebuah tempat asing dan penuh keajaiban. Mereka berangkat untuk menemukan asal usul kekuatan Elsa dan juga untuk menyelamatkan kerajaan mereka.",
            "Imperfect berkisah tentang Rara(Jessica Mila) yang memiliki badan gemuk dan kulit sawo matang berjuang untuk menghadapi body shaming yang ia alami.",
            "Insidious berkisah tentang osh dan dan Renai Lambert pindah ke sebuah mansion baru bersama ke-tiga anak mereka. Keadaan berubah mengerikan ketika Dalton dan anak mereka, terjatuh dan koma setelah serangan misterius di loteng.",
            "Joker menceritakan Arthur Fleck, seorang badut pesta, hidup dalam keadaan sulit bersama ibunya yang sakit-sakitan. Karena orang-orang menganggapnya aneh, ia memutuskan untuk berubah menjadi jahat dan membuat kekacauan.",
            "Jumanji The Next Level bercerita tentang Para pemain harus melaju ke wilayah-wilayah tersembunyi dan belum dijamah, dari gurun nan gersang ke pegunungan bersalju, demi meloloskan diri dari permainan paling berbahaya di dunia.",
            "Jurasic World menceritakan Taman safari yang berisi dinosaurus rekayasa genetik jadi gempar ketika salah satu dinosaurus lepas dari kandang. Seorang ahli hewan sekaligus mantan militer pun berusaha menyelamatkan semua orang.",
            "Money Heist Berkisah tentang sekelompok perampok bank tersebut yang dipimpin oleh seseorang yang bernama 'Profesor'.",
            "NKCTHI menceritaka tentang  Angkasa, Aurora dan Awan adalah kakak beradik yang hidup dalam keluarga yang tampak bahagia. Nmun, dibalik kebahagiaan keluarga tersebut terdapat rahasia yang disimpan dibaliknya.",
            "Parasite menceritakan suatu keluarga yang menjadi parasite dalam keluarga orang lain.",
            "Spiderman Far From Home menceritakan Peter Parker (Tom Holland) tengah mengunjungi Eropa untuk liburan panjang bersama temaan-temanya. Sayangnya , Parker tidak bisa dengan tenang menikmati liburannya, karena Nick Fury datang secara tiba-tiba di kamar hotelnya.",
            "Stars Wars The Last Jedi berkisag tentang Rey (Daisy Ridley) akhirnya berhasil menemukan ksatria legendaris Jedi, Luke Skywalker (Mark Hamill) di sebuah pulau dengan aura magis. Para pahlawan dari The Force Awakens yang membuka misteri kuno The Force dimasa lalu yang mengejutkan.",
            "The Greatest Showman Terinspirasi oleh imajinasi P.T. Barnum, The Greatest Showman adalah musikal asli yang menceritakan kelahiran bisnis pertunjukan dan bercerita tentang seorang visioner yang bangkit dari nol untuk menciptakan tontonan yang menjadi sensasi di seluruh dunia.",
            "The Lion King bercetita tentang Simba singa muda melarikan diri dari kelompoknya hanya untuk mempelajari arti sebenarnya dari tanggung jawab dan keberanian.",
            "To All The Boys I've Loved Before berkutat pada kehidupan seorang remaja SMA, Lara Jean (Lana Condor), yang punya kepribadian cenderung pemalu. Setiap kali menyukai seorang pria, ia akan menulis surat kepada pria tersebut tentang perasaannya namun tidak pernah mengirimkannya.",
            "Train To Busan menceritakan tentang Seok-woo dan putrinya yang berulang tahun pergi ke Busan dengan kereta untuk menemui istrinya. Tapi perjalanan tersebut berubah menjadi mimpi buruk kala mereka terjebak di tengah-tengah wabah zombie."

    };

    private static int [] filmposter = {
            R.drawable.aadc,
            R.drawable.avengers_endgame,
            R.drawable.annabelle,
            R.drawable.avatar,
            R.drawable.fast_and_furious_7,
            R.drawable.frozen_2,
            R.drawable.imperfect,
            R.drawable.insidious,
            R.drawable.joker,
            R.drawable.jumanji_the_next_level,
            R.drawable.jurasic_world,
            R.drawable.money_heist,
            R.drawable.nkcthi,
            R.drawable.parasite,
            R.drawable.spiderman_far_from_home,
            R.drawable.star_wars_the_last_jedi,
            R.drawable.the_greatest_showman,
            R.drawable.the_lion_king,
            R.drawable.to_all_the_boys,
            R.drawable.train_to_busan

    };

    static ArrayList<Film> getListData(){
        ArrayList<Film> list = new ArrayList<>();
        for (int position = 0; position <filmtitle.length; position++) {
            Film film = new Film();
            film.setTitle(filmtitle[position]);
            film.setDescription(filmdescription[position]);
            film.setPoster(filmposter[position]);
            list.add(film);
        }
        return list;
    }
}
