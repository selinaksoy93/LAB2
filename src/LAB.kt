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
    print("Kullanıcı adınızı girin :")
    val userName = readLine()
    print("Kullanıcı soyadınızı girin :")
    val userSurname = readLine()
    print("Kullanıcı vize notunuzu girin :")
    val vize = readLine()
    print("Kullanıcı final notunuzu girin :")
    val final = readLine()
    println(vize!!.toInt() concate (final!!.toInt()))


}

infix fun Int.concate(Final: Int): String {
    val ort: Double = (this * (0.4) + Final * (0.6)) / 2
    if (ort <= 50) {
        return "Başarısız."
    } else {
        return "Başarılı."
    }
}