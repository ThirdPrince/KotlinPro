package kotlins.nulls

/**
 * @Author dhl
 * @Date 2023/4/6
 */
fun main(args: Array<String>) {
    val man:Parent = Child()
   // println((man as Child).getName())
    if(man is Child){
        println(man.getName()?:"defaultName")
    }

}

open class Parent{}

class Child:Parent(){
    fun getName():String?{
        return null
    }
}