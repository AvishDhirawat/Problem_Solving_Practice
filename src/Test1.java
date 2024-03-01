public class Test1 {
    int var2 = 6;
    public void customEntryPoint() {
         int var1 = 5;
        System.out.println("Hello, Java without main!");
    }
}
 class Test3 extends Test1{
    public static void main(String [] args){
        Test1 t1 = new Test1();
        System.out.println(t1.var2);
        t1.customEntryPoint();
    }
 }