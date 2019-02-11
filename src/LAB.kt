// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 2019-02-10 - 13:14          │
//└─────────────────────────────┘

// TODO(1) Kullanıcıdan adını alın.
// TODO(2) Kullanıcıdan soyadını alın.
// TODO(3) Kullanıcıdan vize notunu alın.
// TODO(4) Kullanıcıdan final notunu alın.
// TODO(5) Vize'nin %40'ını Final'in %60'ını alan ve geciş notunu print eden bir infix-extention method yazınız.


fun main() {
    print("Lütfen adınızı giriniz:")
    val isim: String = readLine()!!

    print("Lütfen soyadınızı giriniz:")
    val soyadi: String = readLine()!!

    print("Lütfen vize notunuzu giriniz :")
    val vizeNotu = readLine()!!.toInt()

    print("Lütfen final notunuzu giriniz:")
    val finalNotu = readLine()!!.toInt()

    val sonuc = vizeNotu hesapla finalNotu
    print("Ortalama: $sonuc")

}

infix fun Int.hesapla(sonuc: Int): Int = ((this * 40 / 100) + (sonuc * 60 / 100))
