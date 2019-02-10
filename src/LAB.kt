// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 2019-02-10 - 13:14          │
//└─────────────────────────────┘

fun main() {

    print("Enter first name:")
    val firstName = readLine()

    print("Enter last name:")
    val lastName = readLine()

    print("Enter midterm grade:")
    val midtermGrade = readLine()

    print("Enter final grade:")
    val finalGrade = readLine()

    println(midtermGrade!!.toInt() findAverage (finalGrade!!.toInt()))
}

infix fun Int.findAverage(finalGrade: Int): String {
    val average = (this * 40 / 100 + finalGrade * 60 / 100)
    return when (average) {
        in 90..100 -> "Your final grade:$average Note:AA"
        in 80..89 -> "Your final grade:$average Note:BB"
        in 70..79 -> "Your final grade:$average Note:CC"
        in 60..69 -> "Your final grade:$average Note:DD"
        in 50..59 -> "Your final grade:$average Note:EE"
        else -> "You have failed"
    }
}
