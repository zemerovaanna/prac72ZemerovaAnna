fun main() {
    try{
    println("Введите a,b (a < b),x,y,z")
    var a = readln()!!.toByte()
    var b = readln()!!.toByte()
    var x = readln()!!.toByte()
    var y = readln()!!.toByte()
    var z = readln()!!.toByte()
    var count: Int = 0

    when (x)
    {
        in a..b ->
        {
            println("х в диапозоне a и b")
            count = count + 1
        }
        else -> "x не в диапозоне"
    }
    when (y)
    {
        in a..b ->
        {
            println("y в диапозоне a и b")
            count = count + 1
        }
        else -> "y не в диапозоне"
    }
    when (z)
    {
        in a..b ->
        {
            println("z в диапозоне a и b")
            count = count + 1
        }
        else -> "z не в диапозоне"
    }

    println("Количество точек в диапозоне ab: " + count)
    }
    catch (e: NumberFormatException) { println("Введено недопустимое значение") }
}