// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Okan AYDIN       │
//│ ─────────────────────────── │
//│ okan.aydin@isik.edu.tr      │
//│ ─────────────────────────── │
//│ 2019-02-11 - 21:18          │
//└─────────────────────────────┘

// TODO(1) Kullanıcıdan adını alın.
// TODO(2) Kullanıcıdan soyadını alın.
// TODO(3) Kullanıcıdan vize notunu alın.
// TODO(4) Kullanıcıdan final notunu alın.
// TODO(5) Vize'nin %40'ını Final'in %60'ını alan ve geciş notunu print eden bir infix-extention method yazınız.

fun main() {

    print("Enter your name: ")
    val userName:String = readLine()!!

    print("Enter your surname: ")
    val userSurname: String = readLine()!!

    print("Enter your midterm score: ")
    val midtermScore: Double = readLine()!!.toDouble()

    print("Enter your final score: ")
    val finalScore: Double = readLine()!!.toDouble()

    val averageScore = midtermScore calculator finalScore

    println(userName + " "+ userSurname + " midterm: $midtermScore" + "  final: $finalScore")

    println("Your average score is $averageScore")

}

infix fun Double.calculator(score :Double): Double = ((this * 0.40) + (score* 0.60))


