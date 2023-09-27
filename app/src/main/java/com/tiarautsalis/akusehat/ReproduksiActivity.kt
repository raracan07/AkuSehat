package com.tiarautsalis.akusehat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class ReproduksiActivity : AppCompatActivity() {

    private var titlesList = mutableListOf(
        "Menjaga kesehatan organ reproduksi itu penting?!",
        "Kenapa kita perlu menjaga kesehatan organ reproduksi?",
        "Cara merawat organ reproduksi",
        "Hindari seks pra-nikah dan kehamilan di usia remaja!",
        "Risiko seks aktif pra-nikah",
        "Semua orang berisiko tertular HIV!",
        "Mencegah HIV")
    private var descList = mutableListOf(
        "Ya, karena organ reproduksi yang sehat dapat menjamin keberlangsungan hidup manusia dari generasi ke generasi.",
        "Supaya terhindar dari peyakit menular seksual. Herpes, gonorhea, sipilis, kandidiasis. Penyakit tersebut dapat disebabkan oleh bakteri, virus maupun jamur.",
        "1.\tMengganti pakaian dalam (CD) minimal 2 kali sehari.\n" +
                "2.\tMenggunakan pakaian dalam (CD) berbahan menyerap keringat.\n" +
                "3.\tPakai handuk bersih, kering, tidak lembab dan bau.\n" +
                "4.\tPerempuan tidak dianjurkan untuk disunat atau khitan karna tidak ada manfaat terhadap Kesehatan. Setelah buang air kecil, bersihkan dari arah depan ke belakang agar kuman dari anus tidak ikut ke organ reproduksi.\n" +
                "5.\tLaki-laki sangat dianjurkan untuk disunat atau khitan, agar terhindar dari kanker penis dan kanker leher rahim pada istrinya.\n",
        "1.\tPerempuan yang sudah menstruasi, berisiko hamil apabila melakukan hubungan seksual.\n" +
                "2.\tLaki-laki yang telah mengalami mimpi basah sudah bisa menyebabkan kehamilan, jika melakukan hubungan seksual.\n" +
                "3.\tSeks pra-nikah dapat meningkatkan risiko penularan penyakit atau infeksi HIV serta risiko kehamilan, dan persalinan.\n",
        "1.\tKehamilan yang tidak direncanakan, dapat berlanjut pada aborsi dan pernikahan di masa remaja.\n" +
                "2.\tBerdampak pada masa depan remaja tersebut, seperti putus sekolah, janin yang dikandung, dan keluarganya.\n" +
                "3.\tDampak mental, secara emosional belum stabil, secara kognitif dan pengaruh terhadap perilaku.\n" +
                "4.\tDampak kesehatan, terinfeksi penyakit menular seksual, komplikasi kehamilan hingga masa nifas.\n",
        "Ya, terutama karena adanya perilaku berisiko seperti :\n" +
                "1.\tPria risiko tinggi yaitu pria yang berpotensi membeli seks komersial.\n" +
                "2.\tLelaki seks lelaki dan waria.\n" +
                "3.\tWanita pekerja seks.\n" +
                "4.\tPengguna napza suntik bersama.\n" +
                "5.\tBayi dan anak–anak yang lahir dari orangtua dengan HIV. Maka dari itu, jaga diri dari risiko transmisi infeksi penyakit kelamin menular.\n",
        "1.\tPencegahan penularan melalui hubungan seksual, seperti tidak melakukan hubungan seksual, setia pada pasangan, menemukan dan mengobati secara cepat kasus IMS.\n" +
                "2.\tPencegahan penularan melalui darah dan cairan tubuh, seperti menggunakan jarum suntik yang steril.\n" +
                "3.\tPencegahan penularan dari ibu pada janin, seperti dengan menawarkan tes IMS dan HIV kepada Ibu hamil yang memeriksakan kehamilannya, serta pemberian obat ARV kepada Ibu hamil dengan HIV.\n")
    private var imagesList = mutableListOf(
        R.drawable.keluarga,
        R.drawable.uterus,
        R.drawable.cuci,
        R.drawable.hug,
        R.drawable.mental,
        R.drawable.vaccine,
        R.drawable.virus)

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