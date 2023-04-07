package kotlins.classes

/**
 * @Author dhl
 * @Date 2023/4/6
 */
data class Person(val name :String,var age:Int){
    override fun toString(): String {
        return "age = $age"
    }
}

open class Human( nature: String,appearence:String,sound:String){
    init {
        println("${this.javaClass.simpleName}的性格:$nature，长相：$appearence,声音：$sound")
    }
}
class Girl constructor( nature:String, appearance:String, sound:String):Human(nature,appearance,sound){
    init {
        println("女孩的性格：$nature，长相：$appearance,声音：$sound")
    }
    constructor(nature: String,appearance: String):this(nature,appearance,sound= "未知"){
        println("次构造器")
    }
}

class Boy constructor( nature:String, appearance:String, sound:String):Human(nature,appearance,sound){
    //    init {
//        println("女孩的性格：$nature，长相：$appearance,声音：$sound")
//    }
    constructor(nature: String,appearance: String):this(nature,appearance,sound= "未知"){
        println("boy 次构造器")
    }
}



fun main(args: Array<String>) {
    val person = Person("dhl", 29)
    person.age = 26
    println(person.toString())

    val girl = Girl("温柔","甜美")

    val boy = Boy("阳光","可爱")
    //println(girl.toString())

}