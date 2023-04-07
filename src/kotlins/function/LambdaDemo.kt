package kotlins.function

/**
 * @Author dhl
 * @Date 2023/4/6
 */
fun main(args: Array<String>) {
    val sum = {x:Int,y:Int -> x+y}
     println(sum(1, 2))
     calculate(1, 2, sum)

    val printLambda = {t:Any -> println(t)}
    val array = arrayListOf(1,2,3,4,5,6)
    array.forEach(printLambda)
//    array.forEach{
//        printLambda(it)
//    }

    val args = arrayOf("1","2","3","1","q","r")
    args.forEach {
        if(it == "q") return@forEach
        println("$it")
    }
    args.takeWhile {
        it != "q"
    }.forEach {

        println("$it")
    }

    println("The end")

}
fun calculate(x:Int,y:Int,operation:(Int,Int)->Int):Int{
    return  operation(x,y)
}