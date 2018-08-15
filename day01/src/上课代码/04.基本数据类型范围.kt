package day01


/**
 * ClassName:`04.基本数据类型范围`
 * Description:计算机采用的存储方式是二进制 2^32/2
 */
fun main(args: Array<String>) {
    //byte类型范围
    var maxByte:Byte = Byte.MAX_VALUE
    var minByte:Byte = Byte.MIN_VALUE
    println(maxByte)
    println(minByte)

    var maxShort:Short = Short.MAX_VALUE
    var minShort:Short = Short.MIN_VALUE
    println(maxShort)
    println(minShort)

    var maxInt:Int = Int.MAX_VALUE
    var minInt:Int = Int.MIN_VALUE
    println(maxInt)
    println(minInt)

    var maxLong:Long = Long.MAX_VALUE
    var minLong:Long = Long.MIN_VALUE
    println(maxLong)
    println(minLong)


    /*---------------------------- 浮点类型:float double ----------------------------*/
    var maxFloat:Float = Float.MAX_VALUE
    var minFloat:Float = Float.MIN_VALUE
    println(maxFloat)
    println(-maxFloat)//

    var maxDouble:Double = Double.MAX_VALUE
    var minDouble:Double = Double.MIN_VALUE
    println(maxDouble)
    println(-maxDouble)//

    /*---------------------------- 二进制 ----------------------------*/
    var b:Int = 0b1110
    println(b)
}