package kotlins.classes.visiable

/**
 * @Author dhl
 * @Date 2023/4/7
 */
open class Father{
    private val pinMoney = 200// 私房钱
    protected val gameBoy = "Switch" //游戏机
    internal  val familyTree = "Family" //族谱
    val card = "名片"
}
class Son:Father(){
    fun getFromFather(){
        //val pinMoney = super.pinMoney // 无法访问
        val gameBoy = super.gameBoy
        val familyTree = super.familyTree
        val card = super.card
    }
}

