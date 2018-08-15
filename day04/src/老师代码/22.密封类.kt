package day04


/**
 * ClassName:`22.密封类`
 * Description:
 */
fun main(args: Array<String>) {
    println(isLegel(JonSnow()))
}

/**
 * 判断是否合法
 */
fun isLegel(stark: NedStark): Boolean {
    when (stark) {
        is NedStark.AryaStark -> return true
        is NedStark.RobStark -> return true
        is NedStark.SansaStark -> return true
        is NedStark.BrandonStark -> return true
        else -> return false
    }
}

//只要把合法的继承人确定出来  其他人过来都是不合法的
//密封类密封的是类型
sealed class NedStark {
    class RobStark : NedStark()
    class SansaStark : NedStark()
    class AryaStark : NedStark()
    class BrandonStark : NedStark()
}


//私生子
class JonSnow : NedStark()

class KonSnow : NedStark()

