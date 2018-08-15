package 老师代码

import java.io.BufferedReader
import java.io.File
import java.io.FileReader


/**
 * ClassName:`21.异常处理`
 * Description:
 * 异常:编译时异常(受检异常)  运行时异常 NullPointException
 * kotlin只有运行时异常  没有受检异常
 * 无论方法有没有抛出异常  编译器都不会提示处理这个异常
 */
fun main(args: Array<String>) {
    val a = 10
    val b = 0

    var c: Int =0

    try {
        c = a/b
    } catch (e: Exception) {
        println("出现了异常")
    }finally {

    }
    println(c)
}

fun readFile(){
    val file = File("a.txt")

    val bfr = BufferedReader(FileReader(file))
}