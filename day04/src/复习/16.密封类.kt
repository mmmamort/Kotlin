package 复习.密封类


/**
 * @ 文件名:   `16.密封类`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:28
 * @ 描述:密封类与普通继承不同的是，可以通过父类的名称（类型），调用子类的名称（类型），密封类之外的子类则不行
 */
fun isLegel(stark: NedStark): Boolean {
    when (stark) {
        is NedStark.AryaStark -> return true
        is NedStark.RobStark -> return true
        is NedStark.SansaStark -> return true
        is NedStark.BrandonStark -> return true
//        is NedStark.JonSnow  报错因为NedStark名号下没有JonSnow
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


//私生子 虽继承了父类的属性，但没有继承父类的名号
class JonSnow : NedStark()

class KonSnow : NedStark()