package work;
public class main {
    public static void main(String[] args) {
        System.out.println("My System start");
//        MyInter myInter = new myInterImp();
//        myInter.sayHello();
//        MyInter i = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is first anonymous class");
//            }
//        };
//        i.sayHello();
        // Using our Interface with the help of lambda expression
//        MyInter i = ()->{
//            System.out.println("This is my 1st Lambda expression");
//        };
//        i.sayHello();
         sumInte sumInte = (a,b)-> {
             return  a+b;
         };
        System.out.println(sumInte.sum(4,7));
        System.out.println(sumInte.sum(3,6));
        LengthEnter lengthEnter = (str)-> str.length();
        System.out.println(lengthEnter.getLength("ravi raushan"));
    }
}
