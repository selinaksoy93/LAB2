fun main() {
    print("Adınız?")
    val name: String? = readLine()
    print("Soyadınız?")
    val surname: String? = readLine()
    print("Vize?")
    val vize = readLine()
    print("Final?")
    val final = readLine()

    println(vize!!.toInt() not (final!!.toInt()))
}

infix fun Int.not(final: Int): String {
    val total = (this * 40 / 100 + final * 60 / 100)
    return when (total) {
        in 90..100 -> "Your total:$total Note:AA"
        in 80..89 -> "Your total:$total Note:BB"
        in 70..79 -> "Your total:$total Note:CC"
        in 60..69 -> "Your total:$total Note:DD"
        in 50..59 -> "Your total:$total Note:EE"
        else -> "kaldın"
    }
}