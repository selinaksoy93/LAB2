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


fun main(args: Array<String>) {
    println("isim giriniz")
    val name: String? = readLine()
    println("soyad giriniz")
    val surname: String? = readLine()
    println("vize notu")
    val vize = readLine()!!.toInt()
    println("final notu")
    var final = readLine()!!.toInt()

    print(concat(name!!, surname!!))

    val sonuc = vize.calculate(final)
    println("Ortalama: $sonuc")


}

fun concat(name: String, surname: String): String = "$name $surname"

infix fun Int.calculate(sonuc: Int): Int = ((this * 0.40) + (sonuc * 0.60)).toInt()








