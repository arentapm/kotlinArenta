package com.example.kotlinarenta

class Biodata(
    val nama: String,
    val TTL: String,
    val umur: Int,
    val alamat: String,
    val hobi: List<String>
) {
    fun displayBiodata() {
        println("===== BIODATA PRIBADI =====")
        println("Nama: $nama")
        println("TTL: $TTL")
        println("Umur: $umur tahun")
        println("Alamat: $alamat")
        println("Hobi: ")
        hobi.forEach { println("- $it") }
    }
}

fun main() {
    val biodata = Biodata(
        nama = "Arenta Putri Maharani",
        TTL = "Madiun, 13 Maret 2005",
        umur = 18,
        alamat = "Ds. Bader, Kec.Dolopo, Kab. Madiun",
        hobi = listOf("Makan enak", "suka main tik tok")
    )

    biodata.displayBiodata()
}


