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
    print("Adınızı yazınız")
    var name = readLine()

    print("Soyadınızı yazın")
    var surname = readLine()

    print("Vize notunuzu yazın")
    var midTerm = readLine()

    print("Final notunuzu giriniz")
    var final = readLine()


}

infix fun Int.extCalculate(final: Int): Int {
    val mid
}