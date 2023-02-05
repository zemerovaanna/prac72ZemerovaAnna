fun main() {
    try{
    println("Введите a, b, c, d, e, f")
    var a:Int = readln()!!.toInt()
    var b:Int = readln()!!.toInt()
    var c:Int = readln()!!.toInt()
    var d:Int = readln()!!.toInt()
    var e:Int = readln()!!.toInt()
    var f:Int = readln()!!.toInt()
    var x:Int
    var y:Int

    x = (f/d)-(e/d)
    y=c/(a*x+b)
    x = (f/d)-(e/d)*y
    println("{"+a+"x+"+d+"y="+c)
    println("{"+d+"x+"+e+"y="+f)
    println("x="+x+" y="+y)


    }
    catch (e: NumberFormatException) { println("Введено недопустимое значение") }
}