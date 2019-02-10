// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 2019-02-10 - 13:14          │
//└─────────────────────────────┘

fun main(args: Array<String>) {

    // TODO(1) Kullanıcıdan adını alın.
    print("Adınızı giriniz: ")
    val userName = readLine()

    // TODO(2) Kullanıcıdan soyadını alın.
    print("Soyadınızı giriniz: ")
    val userSurname = readLine()

    // TODO(3) Kullanıcıdan vize notunu alın.
    print("Vize notunuzu giriniz: ")
    val midtermNote = readLine()!!.toInt()

    // TODO(4) Kullanıcıdan final notunu alın.
    print("Final notunuzu giriniz: ")
    val finalNote = readLine()!!.toInt()

    println("$userName $userSurname")
    print("Geçiş notunuz: ${midtermNote extCalculateAverage (finalNote)}")
}

// TODO(5) Vize'nin %40'ını Final'in %60'ını alan ve geciş notunu print eden bir infix-extention method yazınız.
infix fun Int.extCalculateAverage(finalNote: Int): Int {

    return (this * 0.4 + finalNote * 0.6).toInt()
}



