package com.tiarautsalis.akusehat

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        cardEmail.setOnClickListener {
            val email = "tiarautsalis@student.gunadarma.ac.id"
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
            startActivity(intent)
        }

        cardInsta.setOnClickListener {
            val insta = "https://www.instagram.com/tiarautsalis/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(insta))
            startActivity(intent)
        }

        cardLink.setOnClickListener {
            val link = "https://www.linkedin.com/in/adli-tiara-utsalis"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            startActivity(intent)
        }
    }
}