public class MyClass {

    int a;
    double d;
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

        int x =10;

        System.out.println(x);



        MyClass ob = new MyClass();

        ob.a = 20;
        ob.d = 2.40;
        ob.c = 'j';
        ob.str = "java";

        ob.display();


        MyClass ob1 = new MyClass();

        ob1.a = 11;
        ob1.d = 23.4;
        ob1.c = 's';
        ob1.str ="amol";

        ob1.display();

    }
}
