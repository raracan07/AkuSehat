package com.tiarautsalis.akusehat

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class FaqActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var mList = ArrayList<FaqData>()
    private lateinit var adapter: FaqAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = FaqAdapter(mList)
        recyclerView.adapter = adapter
    }

    private fun addDataToList() {
        mList.add(
            FaqData(
                "Apakah keputihan merupakan kondisi normal?",
                "Wanita normalnya akan menghasilkan cairan vagina, berupa sebagai cairan bening atau keputihan, tidak menyebabkan iritasi, dan tidak berbau. Selama siklus menstruasi yang normal, jumlah dan konsistensi keputihan dapat bervariasi. Pada suatu periode dalam 1 bulan, mungkin ada sejumlah kecil dari cairan yang sangat tipis serta berair.\n" +
                        "\n" +
                        "Namun di lain waktu, cairan yang banyak dan kental muncul. Semua proses ini dianggap normal. Keputihan yang berbau atau mengiritasi biasanya dianggap tidak normal. Iritasi tersebut dapat berupa rasa gatal, terbakar, atau keduanya. Rasa gatal dapat hadir kapan saja, namun sering kali mengganggu saat malam hari. Oleh karena itu, penting untuk mengonsultasikan perubahan ini pada dokter.\n"
            )
        )
        mList.add(
            FaqData(
                "Bagaimana cara seseorang bisa terinfeksi HIV?",
                "Berbagi jarum suntik untuk mengambil obat, melakukan hubungan seks tanpa kondom dengan orang yang terinfeksi.\n" +
                        "\n" +
                        "Sementara itu, HIV tidak menular saat anda menyentuh atau memeluk seseorang penderita HIV, berbagi kamar mandi umum atau kolam renang dengan penderita, berbagi cangkir, peralatan, ponsel dengan seorang pengidap, dan digigit serangga.\n"
            )
        )
        mList.add(
            FaqData(
                "Apakah sifilis menular?",
                "Sifilis merupakan penyakit menular seksual. Seseorang dengan sifilis dapat menyebarkan infeksi dalam dua tahap penyakit ini. Jika anda bersentuhan dengan luka terbuka (tahap pertama) atau adanya ruam kulit (tahap kedua), maka anda dapat terjangkit bakteri yang menyebabkan infeksi. Jika bakteri masuk ke tubuh anda melalui pembukaan seperti penis, anus, vagina, mulut, atau kulit yang pecah maka anda dapat tertular sifilis."
            )
        )
        mList.add(
            FaqData(
                "Apakah minuman beralkohol bisa mempengaruhi reproduksi wanita?",
                "Minuman beralkohol yang dikonsumsi terlalu banyak dan sering tentu saja berbahaya akibatnya bagi keseluruhan tubuh manusia. Sehubungan dengan kesehatan wanita, tingginya asupan alkohol dapat meningkatkan kanker payudara dan kanker rahim."
            )
        )
        mList.add(
            FaqData(
                "Apakah menstruasi yang tidak lancar itu menunjukkan ada masalah kesehatan?",
                "Bisa ya, bisa tidak. Terlalu sering terlambat haid dan tidak lancar adalah tanda bahwa ada yang tidak beres dengan tubuh anda. Konsultasikan pada dokter untuk pemeriksaan lebih lanjut sehingga problem ini bisa dipecahkan."
            )
        )
        mList.add(
            FaqData(
                "Apakah normal merasa sakit saat menstruasi?",
                "Hal ini sangat penting untuk berbicara dengan dokter, karena bisa jadi ini tanda serius yang memengaruhi kesehatan."
            )
        )
        mList.add(
            FaqData(
                "Mengapa organ intim sering gatal?",
                "Pertanyaan ini perlu ditanyakan ke dokter. Apalagi jika anda mengalami masalah  ini. Ini adalah gejala umum yang terkait dengan infeksi jamur dan beberapa IMS (Infeksi Menular Seksual). Sebelumnya, anda dapat mencoba pembersih organ intim yang  yang memiliki pH atau derajat keasamannya sesuai dengan vagina, yaitu 3,5. Jika masih gatal, anda bisa memeriksakan ke dokter."
            )
        )
        mList.add(
            FaqData(
                "Apa itu reproduksi berbantuan?",
                "Reproduksi berbantuan adalah perawatan kesuburan medis, seperti Inseminasi Buatan atau Fertilisasi In Vitro.\n" +
                        "\n" +
                        "Tujuan dari perawatan ini adalah untuk mencapai kehamilan baik ketika ada masalah kesuburan pria atau wanita, serta pada wanita yang ingin mengalami keibuan secara individu atau berpasangan wanita.\n"
            )
        )

    }

}