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

    try {
        print("Isim: ")
        val isim = readLine()
        print("Soyisim: ")
        val soyIsim = readLine()
        print("Vize: ")
        val vize = readLine()!!.toInt()
        print("Final: ")
        val final = readLine()!!.toInt()

        if (vize in 0..100 && final in 0..100) {
            println("$isim $soyIsim ${vize extOrtalama final}")
        }else throw Exception()

    }catch(e: Exception) {
        println("Yanlis bilgi girisi yaptiniz!\nBilgileri dogru bir sekilde tekrar girin...")
        return main()
    }
}

infix fun Int.extOrtalama(final:Int): String{
    return "Ortalama: ${this * 0.4 + final * 0.6}"
}