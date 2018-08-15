package 复习

/**
 * @ 文件名:   `01.kotlin重载运算符`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 15:38
 * @ 描述:实现   职位    助教 ->讲师 ->副教授 ->教授
 *              level  1   ->2    ->3     ->4
 *              salary 6000->7000 ->8000  ->9000
 */
fun main(args: Array<String>) {
    var teacher = Teacher()
    println(teacher)
    println(++teacher)
    println(++teacher)
    println(++teacher)
    println(++teacher)
}

class Teacher {
    var level = 1
    var salary = 6000
    operator fun inc(): Teacher {
        level++
        return this
    }

    override fun toString(): String {
        var position = when (level) {
            1 -> "助教"
            2 -> "讲师"
            3 -> "副教授"
            4 -> "教授"
            else -> "职位不存在"
        }
        return "Teacher(position='$position', level=$level, salary=${salary + 1000 * (level - 1)})"
    }

}
