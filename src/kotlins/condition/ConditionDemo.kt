package kotlins.condition


/**
 * @Author dhl
 * @Date 2023/4/6
 * if when
 *分支与循环
 */
fun main(args: Array<String>) {

    val local = "en"
    var name = ""
    name = if (local == "em") "无语" else "吴彦祖"
    println(name)
    val x = 5
    when(x){
        5 -> println("x is 5")
        is Int -> println("Hello $x")
        in 1..100-> println("$x is in 1..1000")
    }

    val hero = when(local){
        "en" -> "Hero"
        else ->"未知"
    }
    println(hero)

    val arrayList = arrayListOf(0,1,2,3,4,6)
    for (arg in arrayList){
        println(arg)
    }

    for((index,value)in arrayList.withIndex()){
        println("$index:$value")
    }
}