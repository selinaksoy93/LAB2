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
    print("Adınızı giriniz: ")
    val name = readLine()
    print("Soyadınızı giriniz: ")
    val surname = readLine()
    print("Vize notunuzu giriniz: ")
    val midtermScore = readLine()
    print("Final notunuzu giriniz: ")
    val finalScore = readLine()
    print(midtermScore!!.toInt() calc finalScore!!.toInt())
}

infix fun Int.calc(finalScore: Int) {
    val average = (this * 0.4 + finalScore * 0.6)
    print("Geçme notunuz: $average")

}









