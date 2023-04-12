package kotlins.inner

/**
 * @Author dhl
 * @Date 2023/4/12
 * 静态内部类：在某个类像普通类一样声明即可，可以认为静态内部类与外部类没有关系，只是定义宰了外部类"体内"而已，而使用静态内部类需要待审”外部类
 *
 * 非静态内部类 会持有外部类的作用，而静态内部类不会（可以认为两者没有关系）
 * 非静态内部类 使用时需要基于外部类对象(Outer().Inner())而静态内部类是基于外部类（Out.Inner())
 * 因为静态内部类会持有外部类的引用，所以内部类可以直接使用外部类成员，当非静态内部类与外部类存在同名成员，可以使用@标记来解决歧义。
 *
 */
/**
 * 静态内部类
 */
class Outer {
    val a:Int = 0
    class Inner{
        val a :Int = 5
        fun test(){
            println("Outer a = $a")
        }
    }
}

/**
 * 非静态内部类
 */
class Outer2{
    val a:Int = 10
    inner class Inner{
        val a :Int = 5
        fun test(){
            println("Outer a = ${this@Outer2.a}")
        }
    }
}

fun main(args: Array<String>) {
    val outer = Outer()
    println(outer.a)
    val inner = Outer.Inner()
    println(inner.a)

    val inner2 = Outer2().Inner()
    inner2.test()
}