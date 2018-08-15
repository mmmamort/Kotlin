package day03.封装_洗衣机实战


/**
 * ClassName:Customer
 * Description:消费者
 */
fun main(args: Array<String>) {
    //买洗衣机
    val washMachine = WashMachine("小天鹅",5)
    //开门
    washMachine.openDoor()
    //放衣服
    println("放入衣服了")
    //关门
    washMachine.closeDoor()
    //选择模式
    washMachine.setMode(1)

//    washMachine.setMotorSpeed(6000)

    //洗衣服
    washMachine.start()
}