public class MyClass2 {

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

    MyClass2()
    {
        a = 90;
        d = 1.1;
        c = 'g';
        str = "abcd";
    }

    public static void main(String[] args) {

        MyClass2 ob = new MyClass2();

        ob.display();



    }
}
