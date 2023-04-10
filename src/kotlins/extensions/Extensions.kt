package kotlins.extensions

import java.lang.StringBuilder

/**
 * @Author dhl
 * @Date 2023/4/10
 */
fun String.multiply(time:Int):String{
    val sb = StringBuilder()
    for(i in 0 until time) sb.append(this)
    return  sb.toString()
}

/**
 * 操作符重载
 */
operator fun String.times(time:Int):String{
    val sb = StringBuilder()
    for(i in 0 until time) sb.append(this)
    return  sb.toString()
}

/**
 * 扩展属性无法使用 back field
 */
var String.size:Int
    get(){
        return this.length
    }
    set(value){
        //field = value
    }
fun main(args: Array<String>) {
    println("HHH" * 5)
    println("HelloWorld".size)
}