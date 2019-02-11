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
    print("Adınız: ")
    val name = readLine()

    print("Soyadınız: ")
    val surName = readLine()

    print("Vize notunuz: ")
    val midterm = readLine()

    print("Final notunuz: ")
    val final = readLine()

    println(midterm!!.toInt() calculateTotal(final!!))
}

infix fun Int.calculateTotal(final: String): String {
    val intMidterm: Int = "$this".toInt()
    val intFinal: Int = final.toInt()
    val total = (intMidterm * 40) / 100 + (intFinal * 40) / 100;

    return total.toString()

}