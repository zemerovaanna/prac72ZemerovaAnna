fun main() {
    try{
        printLine("Введите а")
        printLine("Введите b")
        var a = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()

        if ( a <= b ) a = 0.0
        else TODO()

        println(a)
        println(b)
    }
    catch (e: NumberFormatException) { println("Введено недопустимое значение") }
}

fun printLine(s: String) {}
