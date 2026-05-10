package Static_and_Final;

class Test{
    static int x = 10;
    int y = 20;
    void show(){
        System.out.println(x+" "+y); // Non-static method can access both static and non-static members
    }
    static void display(){
        System.out.println(x); // Static method can only access static members of a class
    }
}

public class Static_Basic {
    public static void main(String[] args){
        Test t1 = new Test();
        t1.show();
        t1.x = 30;
        t1.y = 50;
        Test t2 = new Test();
        t2.show();
    }
}
