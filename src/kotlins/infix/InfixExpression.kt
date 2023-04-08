package kotlins.infix

/**

 * @Author dhl
 * @Date 2023/4/8
 *
 * infix 是一个修饰符，用于声明一个函数为中缀函数，中缀函数是一种特殊的函数调用语法，他允许我们使用更为简洁的方式来调用函数。
 * 具体来说，中缀函数可以使用类似于操作符的语法来调用，恶如不是使用普通函数调用语法，中缀函数的参数只能有一个，并且不能是可变参数或默认参数。
 */

infix  fun Int.add(b:Int):Int{
    return this + b
}
fun main(args: Array<String>) {

    val sum = 1 add 5
    println("sum = $sum")
}