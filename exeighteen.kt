fun main() {
    try{
        println("Введите а")
        var a = readln()!!.toFloat()
        println("Введите b")
        var b = readln()!!.toFloat()

        println("Введите x")
        var x = readln()!!.toFloat()
        println("Введите y")
        var y = readln()!!.toFloat()
        println("Введите z")
        var z = readln()!!.toFloat()

        var vert: Boolean = false
        var horiz: Boolean = false

        if ( a > b ) horiz = true
        else if ( a < b) vert = true
        else {
            vert = true
            horiz = true
        }

        var brick: Float

        if ( horiz == true && vert == false ){
            if ( x < a && y < b) println("Влезет")
            else println("не влезет")
        }
        else if ( horiz == false && vert == true ){
            if ( x < b && y < a) println("Влезет")
            else println("не влезет")
        }
        else {
            if ( x < b && y < a || x < a && y < b) println("Влезет")
            else println("не влезет")
        }

    }
catch (e: NumberFormatException) { println("Введено недопустимое значение") }
}