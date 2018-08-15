package 老师代码;

/**
 * ClassName:P
 * Description:
 */
class P extends PersonD{
    public P(String name,int age){
        super(name, age);
    }

    interface D{
        String name = "";
        public void sayHello();
    }
}
