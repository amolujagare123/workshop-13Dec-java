package pack1;

public class JavaDemo {

    public int a;
    private double d;
    char c;
    String str; // data members

    void display() //member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        JavaDemo ob = new JavaDemo();

        ob.a = 20;
        ob.d = 2.40;
        ob.c = 'j';
        ob.str = "java";

        ob.display();
    }
}
