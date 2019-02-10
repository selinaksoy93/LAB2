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
    print("Adınız: ")
    val isim = readLine() ?: ""
    print("Soyadınız: ")
    val soyisim = readLine() ?: ""

    try {
        print("Vize notunuz: ")
        val vize = readLine()?.toInt() ?: 0

        print("Final notunuz: ")
        val final = readLine()?.toInt() ?: 0

        if (vize !in 0..100 || final !in 0..100) throw GecersizSayiException()

        print("$isim $soyisim ${vize extOrtalama final}")

    } catch (exception: NumberFormatException) {
        print("Geçersiz bir sayı girdiniz")
    } catch (exception: GecersizSayiException) {
        print("Sonuçlar 0 ile 100 arasında olmalı")
    }
}


/**
 * Int.extOrtalama(final)
 * this = Vize
 * final = Final
 *
 * return value = "Sonuç {vize*0.4 + final*0.6}"
 */
infix fun Int.extOrtalama(final: Int): String {
    return "Sonuç ${this * 0.4 + final * 0.6}"
}

class GecersizSayiException() : Exception()