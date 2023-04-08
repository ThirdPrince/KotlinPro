package kotlins.infix

/**
 * @Author dhl
 * @Date 2023/4/8
 */

class PersonBuilder{
    var name:String = ""
    var age:Int = 0

     infix fun name(name:String){
        this.name = name
    }

    infix fun age(age:Int){
        this.age =age
    }

    fun build():Person{
        return Person(name,age)
    }


}
fun person(block:PersonBuilder.() -> Unit):Person{
    val builder = PersonBuilder()
    builder.block()
    return builder.build()
}


fun main(args: Array<String>) {
    val person = person{
        name("John")
        age(30)
    }
    println("Name:${person.name},age:${person.age}")
}