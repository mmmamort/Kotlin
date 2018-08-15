package 老师代码.hehe


/**
 * ClassName:`16.when表达式返回值`
 * Description:
 */
fun main(args: Array<String>) {
    println(todo(7))
}
//when表达式有返回值
//如果返回when表达式必须要有else操作
//对于when表达式返回值是{}最后一行
fun todo(age: Int): Any {
    return when  {
        age==7 ->  {
            "haha"
            println("hello")//如果方法没有返回值,返回默认是Unit
            10
            "开始上小学"
        }

        age==12 ->  "开始上中学"

        age==15 ->  "开始上高中"

        age==18 ->  "开始上大学"

        age is Int-> "传递的是Int数据类型"

        age.equals("sjdjg")-> ""

        else ->  "开始上社会大学"
    }

//    when  {
//        age==7 -> return "开始上小学"
//
//        age==12 -> return "开始上中学"
//
//        age==15 -> return "开始上高中"
//
//        age==18 -> return "开始上大学"
//
//        age is Int->return "传递的是Int数据类型"
//
//        age.equals("sjdjg")->return ""
//
//        else -> return "开始上社会大学"
//
//    }
}

fun todo1(age: Int): Any = when  {
        age==7 ->  {
            "haha"
            println("hello")//如果方法没有返回值,返回默认是Unit
            10
            "开始上小学"
        }

        age==12 ->  "开始上中学"

        age==15 ->  "开始上高中"

        age==18 ->  "开始上大学"

        age is Int-> "传递的是Int数据类型"

        age.equals("sjdjg")-> ""

        else ->  "开始上社会大学"
    }
