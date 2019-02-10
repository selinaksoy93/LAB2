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

    println("Adınızı giriniz : ")
    val name = readLine()

    println("Soyadınızı giriniz : ")
    val surName = readLine()

    println("Vize notunuzu giriniz : ")
    val midtermPoint = readLine()

    println("Final notunuzu giriniz : ")
    val finalPoint = readLine()

    print("Ortalamanız : ")
    print(midtermPoint!!.toDouble() extAverage (finalPoint!!.toDouble()))

}

infix fun Double.extAverage(passPoint : Double) : Double = this * 0.4 +  passPoint * 0.6



