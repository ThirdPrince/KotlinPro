package kotlins.sealed

import java.util.zip.DeflaterOutputStream

/**
 * @Author dhl
 * @Date 2023/4/12
 */
enum class LogLevel{
    VERBOSE,DEBUG,INFO,WARN,ERROR,ASSERT
}

/**
 * 和上面的等价
 */
class LogLevel2 private constructor(){
    companion object {
        val VERBOSE = LogLevel2()
        val DEBUG = LogLevel2()
        val INFO = LogLevel2()
        val WARN = LogLevel2()
        val ERROR = LogLevel2()
        val ASSERT = LogLevel2()
    }
}
enum class LogLevel3(val id:Int){
    VERBOSE(0),DEBUG(1),INFO(2),WARN(3),ERROR(4),ASSERT(5);

    override fun toString(): String{
        return "LogLevel3(id=$id),name=$name,ordinal = $ordinal"
    }
}

fun main(args: Array<String>) {
    println(LogLevel3.INFO.ordinal)
    println(LogLevel3.values().map(::println))
    println(LogLevel3.valueOf("ERROR"))
}
