package kotlins.abs


/**
 *
 * @Author dhl
 * @Date 2023/4/6
 * 接口与抽象类的共性：
 * 1，不能直接实例化
 * 2，需要子类实现
 * 3，父类变量可以接收子类对象
 * 区别:
 * 1，抽象类有状态，接口没有状态
 * 2，抽象类有方法实现，接口没有实现
 * 3，抽象类只能单继承，接口可以多实现
 *
 * 接口是规范，抽象类是模板
 *
 */
interface InputDevice{
    fun input(event:Any)
    val version:String
}
interface USBInputDevice:InputDevice
class MyInputDevice(override val version:String):InputDevice{
    override fun input(event: Any) {
        println("011111111")
    }

}
abstract class UsbMouse(val name:String,override val version: String = "1.0"):InputDevice{
    override fun input(event: Any) {
        println("x ,y .....")
    }

    fun click(key:String){
        println("点击了$key")
    }
    abstract fun isSupport(os:String):Boolean
}
class LogitechMouse:UsbMouse("罗技鼠标"){
    override fun isSupport(os: String): Boolean {
        return when(os){
            "windows" ->true
            else ->false
        }
    }
}
fun main(args: Array<String>) {
    val myInputDevice = MyInputDevice("1.0")
    myInputDevice.input("ll")

    val logitechMouse = LogitechMouse()
    println(logitechMouse.isSupport("windows"))
}