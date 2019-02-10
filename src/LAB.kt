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
    print("Kullanıcı adınızı giriniz:")
    val userName: String? = readLine()

    print("Kullanıcı soyadını giriniz:")
    val userSurname: String? = readLine()

    print("Kullanıcı vize notu:")
    val vizeScore: Double = readLine()!!.toDouble()

    print("Kullanıcı final notu:")
    val finalScore: Double = readLine()!!.toDouble()

    print(userName?.extName(userSurname!!))
    print(vizeScore extCalculator (finalScore))


}

infix fun Double.extCalculator(final: Double): Double = this * 0.4 + final * 0.6
infix fun String.extName(surname: String): String = "$this $surname"
