package day04


/**
 * ClassName:`19.枚举`
 * Description:
 */
fun main(args: Array<String>) {

}
fun todo(week:Week){
    when(week){
//        Week.星期一,Week.星期二,Week.星期三-> println("工作")
//        Week.星期二-> println("工作")
//        Week.星期三-> println("工作")
//        Week.星期四-> println("工作")
//        Week.星期五-> println("工作")

        in Week.星期一..Week.星期五-> println("工作")


        Week.星期六-> println("休息")
        Week.星期日-> println("休息")
    }
}
//枚举里面保存的就是有限的实例对象
//枚举里面保存的是数据
enum class Week{
    星期一,星期二,星期四,星期五,星期六,星期日,星期三
}