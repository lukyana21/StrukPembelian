package id.lukyana.strukpembelian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val idPengguna:EditText = findViewById(R.id.isiID)
        val idBarang: EditText = findViewById(R.id.isiIDBarang)
        val jumlah: EditText = findViewById(R.id.isiJumlah)
        val btn: Button = findViewById(R.id.submit)
        val valid: TextView = findViewById(R.id.peringatan)

        btn.setOnClickListener {
            val idUser = idPengguna.text.toString()
            val idItem = idBarang.text.toString()
            val count = jumlah.text.toString()

            if (idUser.isNullOrBlank() || idItem.isNullOrBlank() || count.isNullOrBlank()){
                valid.text = "Tidak Boleh Ada yang Kosong!"
            }else{
                val nama: String =
                if (idUser == "1"){
                    "Luky"
                }else if (idUser == "2"){
                    "Nugroho"
                }else if (idUser == "3"){
                    "Ridian"
                }else if (idUser == "4"){
                    "Marcell"
                }else if (idUser == "5"){
                    "Fahrul"
                }else{
                    "Salah ID Pengguna"
                }

                val barang: String = if (idItem == "1"){
                    "Samsung"
                }else if (idItem == "2"){
                    "Xiaomi"
                }else if (idItem == "3"){
                    "Iphone"
                }else{
                    "Salah Input ID Barang"
                }

                val harga: String = if (idItem == "1"){
                    "Rp. 4.800.000"
                }else if (idItem == "2"){
                    "Rp. 3.000.000"
                }else if (idItem == "3"){
                    "Rp. 8.000.000"
                }else{
                    "-"
                }

                val data  = Struk(
                    "$nama",
                    "$barang",
                    "$count",
                    "$harga"
                )

                val i = Intent(this@MainActivity, TampilanActivity::class.java)
                i.putExtra(TampilanActivity.EXTRA_DATA, data)
                startActivity(i)
            }
        }
    }
}