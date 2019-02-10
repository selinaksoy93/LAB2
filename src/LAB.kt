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

fun main (){
    print("kullanıcı adını giriniz:")
    val userName:String? = readLine()

    print("kullanıcı soyadını giriniz:")
    val userSurName:String? = readLine()

    print("vize notunuzu giriniz:")
    val vizeNotu:String? = readLine()

    print("final notunuzu giriniz:")
    val finalNotu:String? = readLine()

    println(concatenate(userName, userSurName))

    println(" ${calcGPA(vizeNotu!!.toDouble(), finalNotu!!.toDouble())}")

    println(" ${vizeNotu.toDouble().notHesapla(finalNotu.toDouble())}")

}


fun calcGPA (vize:Double , final:Double) : Double =(vize * .4) + (final * .6)

fun concatenate(s1:String?, s2:String?): String = "$s1 + $s2"

infix fun Double.notHesapla(final: Double): Double = this + (final * .6)