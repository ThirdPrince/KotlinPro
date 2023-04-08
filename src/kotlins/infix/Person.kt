package kotlins.infix

/**
 * @Author dhl
 * @Date 2023/4/8
 * 中缀表达式实现链式调用
 */
class Person(var name:String,var age:Int = 18){
    infix fun say(message:String):Person{
        println("$name says :$message")
        return this
    }
}

fun main(args: Array<String>) {
    val person = Person("John")
    person say "hello" say "how are you ?"
}