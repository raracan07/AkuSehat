package com.tiarautsalis.akusehat

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.tiarautsalis.akusehat.databinding.ActivityHomeBinding
import java.net.URLEncoder

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.weightPicker.minValue = 30
        binding.weightPicker.maxValue = 150

        binding.heightPicker.minValue = 100
        binding.heightPicker.maxValue = 250

        binding.weightPicker.setOnValueChangedListener { _, _, _ ->
            BMI()
        }

        binding.heightPicker.setOnValueChangedListener { _, _, _ ->
            BMI()
        }

        auth = FirebaseAuth.getInstance()

        binding.cardChat.setOnClickListener{
            val phoneNumber = "62895630991020"
            val message = "Halo, saya ingin konsultasi."

            val uri = Uri.parse("https://wa.me/$phoneNumber/?text=${URLEncoder.encode(message, "UTF-8")}")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.cardFaq.setOnClickListener {
            Intent(this, FaqActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.cardGizi.setOnClickListener {
            Intent(this, GiziActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.cardInfo.setOnClickListener {
            Intent(this, InfoActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.cardReproduksi.setOnClickListener {
            Intent(this, ReproduksiActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.cardVideo.setOnClickListener {
            Intent(this, VideoActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnLogout.setOnClickListener {
            auth.signOut()
            Intent(this, LoginActivity::class.java).also {
                it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(it)
            }

        }
    }

    private fun BMI() {
        val height = binding.heightPicker.value
        val doubleHeight = height.toDouble() / 100
        val weight = binding.weightPicker.value
        val bmi = weight.toDouble() / (doubleHeight * doubleHeight)

        binding.resultsTV.text = String.format("Indeks Massa Tubuh kamu adalah : %.2f", bmi)
        binding.healthyTV.text = String.format("Hasil: %s", healthyMessage(bmi))
    }
    private fun healthyMessage(bmi: Double): String{
        if (bmi < 18.5)
            return "Kurus"
        if (bmi <25.0)
            return "Sehat"
        if (bmi < 30.0)
            return "Gemuk"
        return "Obesitas"
    }
}