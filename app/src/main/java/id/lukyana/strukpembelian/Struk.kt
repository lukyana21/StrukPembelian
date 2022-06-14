package id.lukyana.strukpembelian

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Struk(
    val namaOrang: String,
    val namaBarang: String,
    val kuantitas: String,
    val harga: String
): Parcelable
