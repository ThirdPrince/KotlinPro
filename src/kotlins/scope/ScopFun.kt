package kotlins.scope

/**
 * @Author dhl
 * @Date 2023/4/19
 */
fun main(args: Array<String>) {
    letScope()
}

/**
 * Let经常用于非空值执行代码块，通过与安全操作符
 */
fun letScope(){
    val list = listOf(1,2,3,4,5,6)
    list.let {
        println(it[0])
        it.forEach(::println)
    }
    val ele1 = list.let { it[5] }.let { it *2 }
    println(ele1)
}
