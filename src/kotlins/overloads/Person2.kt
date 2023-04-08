package kotlins.overloads

/**
 * @Author dhl
 * @Date 2023/4/8
 *
 * Kotlin 提供了 @JvmOverloads 可以将带有默认参数的方法转换成对应的重载方法。
 * 不加上 JvmOverloads ，Java 不能调用有默认参数的方法。
 */
class Person2 {

//    fun say(){
//        println("哈哈")
//    }

    @JvmOverloads
    fun say(what:String="哈哈哈哈"){
        println(what)
    }
    fun say(obj:Any){
        println("this is ${obj.javaClass.simpleName}")
    }
}

fun main(args: Array<String>) {

    val person2 = Person2()
    person2.say()
    person2.say("hhhhhhe")
    person2.say(person2)
}