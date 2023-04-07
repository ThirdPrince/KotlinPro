package kotlins.param

/**
 * @Author dhl
 * @Date 2023/4/6
 */
fun sum(arg1:Int,arg2:Int) = arg1 + arg2
fun hello(vararg ints:Int,string: String){
    ints.forEach(::println)
    println(string)
}
fun main(args: Array<String>) {
    println(sum(arg1 = 4, arg2 = 5))
    hello(1,2,3,4,5,string = "hello")
    val(myName,myAge) = multiRetrunValues()
    println("myName = $myName  = $myAge")
    val(name,age,height) = multiReturnValues(180.0)
    println("name = $name age = $age  height = $height")
}

/**
 * 多返回值
 */
fun multiRetrunValues():Pair<String,Int>{
    return "lqr" to 18
}

fun multiReturnValues(height:Double):Triple<String,Int,Double>{
    return Triple("dhl",18,height)
}
