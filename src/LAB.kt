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
    print("Kullanici Adi Giriniz: ")
    val userName = readLine()

    print("Kullanici Soyadi Giriniz: ")
    val userSurname = readLine()

    print("Kullanici Vize Notu Giriniz: ")
    val notVize = readLine()!!

    print("Kullanici Final Notu Giriniz: ")
    val notFinal = readLine()!!

    print(notVize.toInt() printResult (notFinal.toInt()))
}

infix fun Int.printResult(notFinal: Int): String {
    val result = (this * 0.4) + (notFinal * 0.6)
    return result.toString()
}