package day05


/**
 * ClassName:`16.lambda表达式使用it`
 * Description:
 */
fun main(args: Array<String>) {
    var a = 10
//    val result = add(a,{m->
//        m+10   //m+10 就是block(m)的结果
//    })

    //有2个参数  lambda表达式在最后一行 将()前移
//    val result = add(a){m->
//        m+10
//    }
    //lambda表达式只有一个参数m  省略掉这个参数  可以使用it来表示这个参数
    val result = add(a) {
        it + 10
    }
    println(result)
}

fun add(m: Int, block: (Int) -> Int): Int {//block输入Int，输出Int
    return block(m)
}