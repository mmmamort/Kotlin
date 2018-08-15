package day01


/**
 * ClassName:`18.字符串模板`
 * Description:
 */
fun main(args: Array<String>) {
    println(createDiary("中山公园"))
}
//创建字符串模板
//字符串拼接
fun createDiary(place:String):String{
    return "今天天气晴朗，万里无云，我们去$place 游玩，首先映入眼帘的是，${place}${place.length} 个镏金大字。"
}