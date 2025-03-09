class Peoson{
    private String name;
    private String addr;
    private char sex;
    private int age;
    Peoson(){}
    Peoson(String name,String addr){
        this.name=name;
        this.addr=addr;
    }
    Peoson(String name,String addr,char sex,int age){
        this.name=name;
        this.addr=addr;
        this.age=age;
        this.sex=sex;
    }
    public String visit(){
        return "name:" + name + " " + "addr:" + addr + " " + "sex:" + sex + " " + "age:" + age;
    }
}
class Student extends Peoson{
    private double math;
    private double english;
    Student(String name,String addr,char sex,int age,double math,double english){
        super(name, addr, sex, age);
        this.math=math;
        this.english=english;
    }
    Student(){}
    Student(String name,String addr){
        super(name, addr);
    }
    public String visit(){
        return super.visit()+" math:"+math+" "+"english:"+english;
    }

}
public class Demo2 {
    public static void main(String[] args) {
        Peoson per=new Peoson("aaa","江南",'m',38);
        System.out.println(per.visit());
        Student stu=new Student("bbb","南疆",'f',55,96.3,94.2);
        System.out.println(stu.visit());
    }
}
