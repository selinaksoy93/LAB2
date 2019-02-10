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
    print("Adınızı yazın")
    val name = readLine()
    println("Soyadınızı yazın")
    val Surname = readLine()
    println("Vize Notunuzu girin")
    val Vize = readLine()!!.toInt()
    println("Final notunuzu girin")
    val final = readLine()!!.toInt()
    print("$name $Surname geçiş notunuz=")
    print(Vize extCalculate final)

}

infix fun Int.extCalculate(final: Int) = this * 0.4 + final * 0.6

