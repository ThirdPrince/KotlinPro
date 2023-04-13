package kotlins.sealed

/**
 * @Author dhl
 * @Date 2023/4/13
 */
sealed class Human
class YellowRace:Human()//黄种人
class  WhiteRace:Human()//白种人
class BlackRace:Human()//黑种人

object Jesus:Human()//耶稣
object  MonkeyKing:Human()//齐天大圣

fun main(args: Array<String>) {
    val whiteRace = WhiteRace()

}
