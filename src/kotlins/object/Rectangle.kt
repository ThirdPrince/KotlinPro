package kotlins.`object`

/**
 * @Author dhl
 * @Date 2023/4/7
 * 伴生对象顾名思义 就是与类一起诞生的对象。类一加载，它的伴生对象也就被创建了,每个类都可以对应一个伴生对象，并且该伴生对象的成员全局独一份。
 * @JvmStatic 和 @JvmField，可以让伴生对象中的方法和属性在 java 中通过类名直接调用：
 */
class Rectangle(val width:Int,val height:Int) {
    companion object {
        @JvmStatic
        fun offSzie(width: Int,height:Int):Rectangle{
            return Rectangle(width,height)
        }

        @JvmField
        val TAG = "Rectangle"
    }
}

fun main(args: Array<String>) {
    val width = 4
    val height = 5
    val rectangle1 = Rectangle(width,height)
    val rectangle2 = Rectangle.offSzie(width,height)
    val rectangle3 = Rectangle.offSzie(width,height)
}