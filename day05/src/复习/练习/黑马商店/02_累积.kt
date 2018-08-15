package com.itcast.kotlin.黑马商店

/**
 * 类    名:  Test
 * 创 建 者:  黑马程序员
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    println("--------黑马商店,小王买东西花了多少钱？--------")
    val sum = heimaShop.customers.find { it.name == "小王" }?.orders?.flatMap { it.products }?.sumByDouble { it.price }
    println(sum)

}


