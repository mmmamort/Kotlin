package day05


/**
 * ClassName:`17.常见的lambda表达式`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- foreach ----------------------------*/
    val str = "张三"
    //给CharSequence定义扩展函数forEach
    //forEach只有一个参数,参数是函数类型  forEach是高阶函数
    //调用
//    str.forEach({ele->
//        println("$ele")
//    })
    //()前移
//    str.forEach{ele->
//        println("$ele")
//    }

    //lambda表达式只有一个参数  可以省略参数使用it
//    str.forEach{
//        println(it)
//    }

    str.forEach(::println)

    /*---------------------------- indexof ----------------------------*/
    //indexOfFirst是泛型函数
    //indexOfFirst是Array的扩展函数
    //函数参数是函数类型  参数就是泛型类型  函数返回值boolean
    val array = arrayOf("张三","李四","王五")
//    val index = array.indexOfFirst ({m->
//        m =="张三"
//    })

//    val index = array.indexOfFirst {m->
//        m =="张三"
//    }

    val index = array.indexOfFirst {
        it =="张三"
    }
    println(index)

    /*---------------------------- List ----------------------------*/
    val list = List<String>(10){
        if(it==0){
            "第一个"
        }else{
            "其他"
        }
    }
}