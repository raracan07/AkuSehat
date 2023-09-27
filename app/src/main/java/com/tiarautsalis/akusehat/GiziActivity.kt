package com.tiarautsalis.akusehat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class GiziActivity : AppCompatActivity() {

    private var titlesList = mutableListOf(
        "Apa itu anemia?",
        "Kenapa remaja putri rentan mengalami anemia?",
        "Cara mencegah anemia",
        "Cara konsumsi tablet tambah darah",
        "Siap menjaga gizi dalam tubuh tetap sehat seimbang? Siapa takut!",
        "Bagaimana porsi sekali makan yang benar?",
        "Manfaat melakukan aktivitas fisik 30 menit setiap hari",
        "Apa aja sih aktivitas fisik itu?",
        "Bagaimana cara mendapatkan hasil yang maksimal dari aktivitas fisik?")
    private var descList = mutableListOf(
        "Anemia adalah kondisi ketika tubuh kekurangan sel darah merah sehingga tubuh tidak mendapat cukup oksigen. Biasanya wajah terlihat pucat, mudah Lelah, pusing dan sakit kepala.",
        "Karena remaja putri mengalami menstruasi, sehingga kehilangan banyak darah, sedang tumbuh sangat pesat sehingga perlu zat gizi lebih banyak, kurang asupan kaya zat besi dan protein dalam makanan sehari-hari, sering melakukan diet yang keliru untuk menurunkan berat badan.",
        "1.\tMakan-makanan sehat bergizi seimbang, terutama tinggi protein, kaya zat besi.\n" +
                "2.\tJangan lupa buah dan sayur yang kaya dengan vitamin C, E dan A.\n" +
                "3.\tMinum tablet tambah darah secara teratur, satu tablet setiap minggu.\n" +
                "4.\tMelakukan aktivitas fisik secara teratur.\n" +
                "5.\tMinum air mineral minimal 8 gelas sehari.\n" +
                "6.\tPerlu periksa kadar HB di pelayanan kesehatan.\n",
        "1.\tMakan-makanan gizi seimbang sebelum minum TTD.\n" +
                "2.\tKonsumsi buah-buahan sumber vitamin c seperti jeruk, pepaya, mangga, jambu biji, dan sebagainya.\n" +
                "3.\tJangan minum TTD dengan teh, kopi atau susu, karna akan menghambat penyerapan zat besi, minumlah dengan air mineral.\n",
        "Terapkan kebiasaan sarapan pagi, minum air mineral yang cukup, banyak makan buah dan sayur, konsumsi aneka ragam makanan pokok, biasakan membaca label pada kemasan pangan, batasi makanan manis, asin, dan berlemak, konsumsi lauk pauk yang mengandung protein tinggi, lakukan aktifitas fisik yang cukup dan pertahankan berat badan ideal, cuci tangan pakai sabun dengan air mengalir, dan yang terpenting mensyukuri dan menikmati makanan.",
        "Terapkan anjuran makan 4 sehat 5 sempurna, yang meliputi nasi, daging, sayur, buah dan susu sebagai pelengkapnya. Dan jangan lupa untuk minum air mineral 8 gelas sehari atau setara dengan 2 liter per hari.",
        "1.\tMenjaga kesehatan agar terhindar dari penyakit.\n" +
                "2.\tMeningkatkan kekuatan otot dan daya tahan tubuh.\n" +
                "3.\tMeningkatkan kualitas hubungan seks.\n" +
                "4.\tMembakar kalori mencegah kelebihan berat badan.\n" +
                "5.\tMeningkatkan rasa percaya diri.\n" +
                "6.\tMengurangi stress dan emosional.\n" +
                "7.\tMembuat tidur lebih nyenyak.\n" +
                "8.\tMembuat wajah dan tubuh lebih segar.\n",
        "Aktivitas fisik dapat dibagi menjadi 3 bagian, yaitu :\n" +
                "1.\tAktivitas fisik harian, seperti mencuci baju, mengepel, jalan kaki, membersihkan jendela, berkebun, menyetrika, bermain, dan sebagainya.\n" +
                "2.\tLatihan fisik, seperti jalan kaki, jogging, push up, peregangan senam, aerobic, bersepeda, dan sebagainya.\n" +
                "3.\tOlahraga, seperti sepakbola, bulu tangkis, basket, berenang, dan sebagainya.\n",
        "Gunakan prinsip BBTT\n" +
                "1.\tBaik yaitu melakukan aktivitas fisik sesuai dengan kemampuannya.\n" +
                "2.\tBenar yaitu aktivitas yang dilakukan secara bertahap, mulai dari pemanasan dan di akhiri dengan pendinginan atau peregangan.\n" +
                "3.\tTerukur yaitu aktivitas fisik yang diukur intensitas dan juga waktunya.\n" +
                "4.\tAktivitas fisik yang dilakukan secara teratur sebanyak 3-5 kali dalam seminggu.\n")
    private var imagesList = mutableListOf(
        R.drawable.blood,
        R.drawable.sick,
        R.drawable.cooking,
        R.drawable.vitamin,
        R.drawable.workout,
        R.drawable.makan,
        R.drawable.bola,
        R.drawable.mencuci,
        R.drawable.lari)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reproduksi)

        val view_pager2 = findViewById<ViewPager2>(R.id.view_pager2)

        view_pager2.adapter = ViewPagerAdapter(titlesList, descList, imagesList)
        view_pager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(view_pager2)
    }
}