package kotlins.delegete

import kotlin.reflect.KProperty

/**
 * @Author dhl
 * @Date 2023/4/11
 * 代理
 */
class Delegate {
    private var _value :String ? = null
    operator fun getValue(thisRef:Any?,property:KProperty<*>):String{
        println("getValue() thisRef = $thisRef,property=${property.name}")
        return _value?:""
    }
    operator fun setValue(thisRef: Any?,property: KProperty<*>,value:String){
        println("setValue() thisRef = $thisRef,property = ${property.name},value = $value")
    }
}
class Animal{
    var name:String by Delegate()
    val age:Int by lazy {
        println("设置age")
        18
    }
}

fun main(args: Array<String>) {
    val animal = Animal()
    animal.name = "旺财"
    println(animal.name)
}