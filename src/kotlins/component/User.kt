package kotlins.component



/**
 * @Author dhl
 * @Date 2023/4/12
 * 相比JavaBean data class 有很多好用的语法糖特性，但也有不足的地方
 * data class 默认final 无法被继承
 * 使用allOpen noArg
 */
class User(val userName:String,val age:Int) {
    operator fun component1():String{
        return userName
    }
    operator fun component2():Int{
        return age
    }
}

data class User2(val userName: String,val age: Int)

fun main(args: Array<String>) {
    val user = User("dhl",18)
    println("userName = ${user.userName}")
    val (userName,age) = user
    println("userName = $userName,age = $age")
    println(user)
    val user2 = User2("dhl2",29)
    val(userName2,age2) = user2
    println("userName2 =$userName, age2 = $age2")

}