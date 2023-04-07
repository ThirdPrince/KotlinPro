package kotlins.field

/**
 *
 *
 * @Author wujun
 * @Date 2023/4/6
 */

class X
class AClass {
    var b = 0
        get() {
            println("some one tries to get b")
            return field
        }
        set(value) {
            field = value
        }

    val e:X by lazy {
        println("init X")
        X()
    }


}
class Book{
    infix fun on(any: Any):Boolean{
        return false
    }
}
class DeskTop
fun main(args: Array<String>) {
    val aClass = AClass()
    aClass.b = 777
    println(aClass.b)
    println(aClass.e)
    val book = Book()
    val deskTop = DeskTop()
    println(book on deskTop)
}