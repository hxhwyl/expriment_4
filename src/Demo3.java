class Employees{
    private String name;
    private int age;
    private String sex;
    Employees(){}
    Employees(String name,int age,String sex){
        this.age=age;
        this.sex=sex;
        this.name=name;
    }
    public String visit(){
        return "name:" + name + " age:" + age + " sex:" + sex;
    }
}
class Management extends Employees{
    private String jobTitle;
    private int yearWages;
    Management(){}
    Management(String name,int age,String sex){
        super(name,age,sex);
    }
    Management(String name, int age, String sex,String jobTitle,int yearWages) {
        super(name, age, sex);
        this.jobTitle=jobTitle;
        this.yearWages=yearWages;
    }
    public String visit(){
        return super.visit()+" jobTitle:"+jobTitle+" yearWages:"+yearWages;
    }
}
class Staff extends Employees{
    private String apartment;
    private int monthWages;
    Staff(){}
    Staff(String name,int age,String sex){
        super(name,age,sex);
    }
    Staff(String name,int age,String sex,String apartment,int monthWages){
        super(name,age,sex);
        this.apartment=apartment;
        this.monthWages=monthWages;
    }
    public String visit(){
        return super.visit()+" apartment:"+apartment+" monthWages"+monthWages;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Employees e=new Employees("shazi",23,"male");
        Management m=new Management("aaa",65,"famale","会计",67965);
        Staff s=new Staff("bbb",88,"male","主管",5234);
        System.out.println(e.visit());
        System.out.println(m.visit());
        System.out.println(s.visit());
    }
}
