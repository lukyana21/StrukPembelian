package id.lukyana.strukpembelian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TampilanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan)

        val namaBarang: TextView = findViewById(R.id.isiNamabarang)
        val banyakBarang: TextView = findViewById(R.id.isiKuantitas)
        val hargaBarang: TextView = findViewById(R.id.isiHarga)
        val olehPengguna: TextView = findViewById(R.id.isiNamaOrang)

        val paket = intent.getParcelableExtra<Struk>(EXTRA_DATA) as Struk

        namaBarang.text = paket.namaBarang
        banyakBarang.text = paket.kuantitas
        hargaBarang.text = paket.harga
        olehPengguna.text = paket.namaOrang
    }

    companion object{
        const val EXTRA_DATA = "kunci"
    }
}