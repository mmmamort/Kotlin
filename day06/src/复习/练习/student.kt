package 复习.练习

//统计一个学生的成绩:姓名 年纪 学号 性别 分数包括:语文
//数学 英语
fun main(args: Array<String>) {
    val student: Student =
            student {
                name = "王小明"
                age = 12
                id = 1
                score {
                    chinese = 99
                    math = 100
                    english = 97
                }
            }
    println(student)
}

fun student(block: Student.() -> Unit): Student {
    return Student().apply(block)
}

fun Student.score(block: Score.() -> Unit) {
    this.score = Score().apply(block)
}

//学生的成绩:姓名 年纪 学号 性别 分数
data class Student(var name: String? = null, var age: Int? = null, var id: Int? = null, var sex: String? = null, var score: Score? = null)

//分数包括:语文 数学 英语
data class Score(var chinese: Int? = null, var math: Int? = null, var english: Int? = null)
