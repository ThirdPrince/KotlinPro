package kotlins.advancefunc

/**
 * @Author dhl
 * @Date 2023/4/14
 */
fun main(args: Array<String>) {
    /**
     * myFun1 接收了同函数类型的匿名函数
     * myFun2 接收了同函数类型的lambda表达式
     * 两者没有区别 ，功能也一样 lambda 表达式也是一种匿名函数
     * myFun1 myFun2 都是函数的引用
     */
    val myFun1: (String) -> Unit = fun(value: String) {
        println(value)
    }
    val myFun2: (String) -> Unit = {
        println(it)
    }
    myFun2("3")

   // val myFun: (String) -> Unit = { value -> println(value) }
    val myFun = { value: String -> println(value) }
    val array = arrayOf("1", "2", "3")
    array.forEach(::println)

    val myPrinter = MyPrinter()
    // MyPrinter:: myFun 报错
    array.forEach(myPrinter::muFun)
    val opear: (String, String) -> String = String::plus
    val result = opear("hello","world")
    println(result)


}

/**
 * 函数名不是函数引用，不过Kotlin 提供:: 语法限定符，可以把函数名转成函数引用
 * array.forEach(::myFun4)
 * println 本身就符合（T）->Unit要求
 * array.forEach(::println)
 */
fun myFun4(value:String){
    println(value)
}

class MyPrinter{
    fun muFun(value:String){
        println(value)
    }
}