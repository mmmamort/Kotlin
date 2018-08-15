package com.itcast.kotlin.黑马商店

/**
 * 类    名:  Test
 * 创 建 者:  黑马程序员
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    println("---黑马商店,过滤用户,过滤条件 购买的商品 未发货 < 已发货---")
    val list = heimaShop.customers.partition {
        val pair = it.orders.partition { it.isDelivered }
        val deliverCount = pair.first.size
        val unDeliverCount = pair.second.size
        unDeliverCount < deliverCount
    }
    println(list)

    println("---黑马商店,所有订单里面，已发货的，最贵的商品---")
    val maxPrice = heimaShop.customers.flatMap { it.orders }.//获取所有人order集合，并整合成一个集合
            filter { it.isDelivered }.//筛选发货了的
            flatMap { it.products }.//再将所有的产品整合
            maxBy { it.price }
    println(maxPrice)
}


