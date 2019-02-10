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
    println("Adınızı Giriniz: ")
    val name = readLine()

    println("Soyadınızı Giriniz: ")
    val surName = readLine()

    println("Vize Notunuzu Giriniz: ")
    val vizeNotu = readLine()

    println("Final Notunuzu Giriniz: ")
    val finalNotu = readLine()

    print("$name $surName ortalamanız: ")
    println(vizeNotu!!.toInt() ortalama (finalNotu!!.toInt()))

}

infix fun Int.ortalama(not: Int): Int = ((this * 40 / 100) + (not * 60 / 100))