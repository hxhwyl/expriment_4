abstract class Shape{
    abstract double area();
    abstract double perimeter();
}
class Circle extends Shape{                   //圆形
    private double R;
    Circle(double R)
    {
        this.R=R;
    }
    int ass = 1;
    double area() {
        return R*R;
    }
    double perimeter() {
        return 3.14*2*R;
    }
}
class Rectangle extends Shape{               //矩形

    private int looong;
    private int wide;
    Rectangle(int looong,int wide){
        this.looong=looong;
        this.wide=wide;
    }
    @Override
    double area() {
        return looong*wide;
    }

    @Override
    double perimeter() {
        return 2*(looong+wide);
    }
}
class Triangle extends Shape{              //三角
    private int s1,s2,s3;
    Triangle(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
public boolean isvilid(){
        if(s2+s1<s3||s1+s3<s2||s2+s3<s1) return false;
        else return true;
}
    @Override
    double area() {
        double p=s1+s2+s3;
        return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
    }

    @Override
    double perimeter() {
        return s1+s2+s3;
    }
}
class Ellipse extends Shape{               //椭圆
    int a,b;
    Ellipse(int a,int b){
     this.a=a;
     this.b=b;
    }

    @Override
    double area() {
        return 3.14*a*b;
    }

    @Override
    double perimeter() {
        return 0000;
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        Ellipse e=new Ellipse(5,7);
        Triangle t=new Triangle(5,6,7);
        Rectangle r=new Rectangle(10,8);
        if(t.isvilid()){
            System.out.println("三角面积为"+t.area());
            System.out.println("三角周长为"+t.perimeter());
        }
        else System.out.println("构不成三角形");
        System.out.println("椭圆面积为"+e.area());
        System.out.println("椭圆周长为"+e.perimeter());
        System.out.println("圆面积为"+c.area());
        System.out.println("圆周长为"+c.perimeter());
        System.out.println("矩形面积为"+r.area());
        System.out.println("矩形周长为"+r.perimeter());
    }
}
