package day03


/**
 * ClassName:`03.元素符重载联系`
 * Description:
 * 第一步:官网查找++对应的方法
 * 第二步:在Teacher对象里面实现++方法
 */
fun main(args: Array<String>) {
    //助教
    var 助教 = Teacher()
//    println(助教)
    //讲师
    var 讲师 = 助教++
//    println(讲师)
    //副教授
    var 副教授 = 讲师++
//    println(副教授)
    //教授
    var 教授 = 副教授++

    println(教授)
    println(助教)
}
class Teacher{
    //等级
    var level = 1
    //薪资
    var salary = 6000

    operator fun inc():Teacher{
        level ++
        salary += 1000
        return this
    }

    override fun toString(): String {
        return "Teacher(level=$level, salary=$salary)"
    }

}