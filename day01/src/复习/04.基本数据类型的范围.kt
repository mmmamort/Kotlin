package 复习

fun main(args: Array<String>) {
    val byte1: Byte = Byte.MAX_VALUE//1字节   2^8/2-1
    val byte2: Byte = Byte.MIN_VALUE//1字节   -2^8/2
    val short1: Short = Short.MIN_VALUE//2字节   2^16/2-1
    val short2: Short = Short.MIN_VALUE//2字节   -2^16/2
    val int1: Int = Int.MIN_VALUE//4字节   2^32/2-1
    val int2: Int = Int.MIN_VALUE//4字节   -2^32/2
    val long1: Long = Long.MIN_VALUE//8字节   2^64/2-1
    val long2: Long = Long.MIN_VALUE//8字节   -2^64/2
    val float1: Float = Float.MIN_VALUE//1字节   为正的最大值，负的最小值
    val float2: Float = Float.MIN_VALUE//1字节   为正的最小值，负的最大值
    val double1: Double = Double.MIN_VALUE//1字节   为正的最大值，负的最小值
    val double2: Double = Double.MIN_VALUE//1字节   为正的最小值，负的最大值
}