package 老师代码;

/**
 * ClassName:PersonD
 * Description:
 * 外面只能访问不能修改?
 */
class PersonD {


    private String name;
    private int age;
    private String phone;


    class D{
        private String name;
        public void sayHello(){
            System.out.println(PersonD.this.name);
        }
    }
    public PersonD() {
    }

    public PersonD(String name, int age) {//函数形参只能在当前函数里面访问
        this.name = name;
        this.age = age;
    }

    public PersonD(String name, int age, String phone) {
//        this.name = name;
//        this.age = age;
        this(name,age);

        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //学生 年纪信息
    public void setAge(int age) {//100
        if(age<30&&age>18) {
            this.age = age;
        }
    }
}
