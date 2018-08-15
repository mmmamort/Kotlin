package com.itcast.kotlin.黑马商店

fun main(args: Array<String>) {
    println("--------黑马商店,用户来自哪些城市？--------")

    val customerList = heimaShop.customers

    val list1 = customerList.map { it.city }.distinct()

    println(list1)

    println("--------黑马商店,小王买过的所有商品？--------")

    val xiaoWang = customerList.find { it.name == "小王" }!!

    val xiaoWangList = xiaoWang.orders//商品清单集合

    val list2 = xiaoWangList.flatMap { it.products }.distinctBy { it.name }//把集合组成新的集合
    println(list2)

    println("--------黑马商店,所有用户买过的所有商品？--------")

    val orderList = customerList.flatMap { it.orders }

    val productList = orderList.flatMap { it.products }.distinct()

    println(productList)
}


