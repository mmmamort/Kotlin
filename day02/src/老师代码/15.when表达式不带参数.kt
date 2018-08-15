package 老师代码.haha


/**
 * ClassName:`15.when表达式不带参数`
 * Description:
 * when表达式每一个分支只要满足true这个条件就可以处理
 */
fun main(args: Array<String>) {
    println(todo(7))
}

fun todo(age: Int): String {
    when  {
        age==7 -> return "开始上小学"

        age==12 -> {
            return "开始上中学"
        }
        age==15 -> {
            return "开始上高中"
        }
        age==18 -> {
            return "开始上大学"
        }
        age is Int->{//instanceof
            return "传递的是Int数据类型"
        }
        age.equals("sjdjg")->return ""

        else -> {
            return "开始上社会大学"

        }
    }
}