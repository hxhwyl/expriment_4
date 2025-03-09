interface className{
    public abstract String getClassName();
}
class Company implements className{
    public  String getClassName(){
        return getClass().getName();
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Company c=new Company();
        System.out.println(c.getClassName());
    }
}
