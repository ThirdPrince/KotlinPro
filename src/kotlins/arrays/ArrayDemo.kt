package kotlins.arrays

/**
 * @Author dhl
 * @Date 2023/4/6
 * 数组
 */
fun main(args: Array<String>) {
    val arrayOfString  = arrayOf("我","你","他" )
    println(arrayOfString.joinToString("->"))
    println(arrayOfString.slice(0..1))
}