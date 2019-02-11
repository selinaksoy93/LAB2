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
    print("kulanıcı adını girin\n")
    val name: String? = readLine()

    print("kullanıcı soyadını giriniz\n")
    val soyad: String? = readLine()

    print("vize notu giriniz\n")
    val vizeNotu = readLine()?.toInt()

    print("final notunu giriniz\n")
    val finalNotu = readLine()?.toInt()

    print("Ortalamanız: ")
    vizeNotu?.Average(finalNotu!!)

}

infix fun Int.Average(finalNotu: Int) = print("toplam not:" + (this * 40 / 100 + finalNotu * 60 / 100))



