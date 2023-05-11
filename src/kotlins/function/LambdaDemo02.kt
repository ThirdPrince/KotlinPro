package kotlins.function

import kotlins.component.User

/**
 * @Author dhl
 * @Date 2023/5/11
 * https://amitshekhar.me/blog/higher-order-functions-and-lambdas-in-kotlin
 */
fun main(args: Array<String>) {
    test1()

    passMeFunction {
        val user = User("Abc",18)
        println("user name =${user.userName}")

    }

    /**
     * 报错 本质是匿名函数
     */
//    passMeFunction(
//            fun abc(){
//                val user = User("Abc",18)
//                println("user name =${user.userName}")
//            }
//    )

}
fun test1(){
    val square :(Int) ->Int = {value -> value* value }
    val nine = square(3)
    println("nine = $nine")
}

/**
 * 高阶函数
 */
fun passMeFunction(abc:() ->Unit){
    abc()
}

fun abc(){
    val user = User("Abc",18)
    println("user name =${user.userName}")
}
