fun main() {
    try{
    println("Введите a,b,c,d (a < b, c < d),x")
    var a = readln()!!.toByte()
    var b = readln()!!.toByte()
    var c = readln()!!.toByte()
    var d = readln()!!.toByte()
    var x = readln()!!.toByte()
    var count: Int = 0

    when (x)
    {
        in a..b -> println("х принадлежит отрезку ab")
        in c..d -> println("х принадлежит отрезку сd")
        in b..c -> println("х принадлежит общей части отрезков")
        in d..a -> println("х принадлежит общей части отрезков")
        else -> println("х не принадлежит отрезкам")
    }
}
catch (e: NumberFormatException) { println("Введено недопустимое значение") }
}