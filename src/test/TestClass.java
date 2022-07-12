package test;

public class TestClass {

    enum myChar{
        A,
        B
    }
    int i = 87;
    String str = "bla bla bla";
    public TestClass(){
//        i = 7;

    }

 //   public TestClass(int i) {
//        this.i = i;
 //   }

 /*   public static void main(String[] args) {
        //       TestClass testClass = new TestClass(8);
        TestClass.initialize();
        TestClass testClass = new TestClass();
        System.out.println(EnumConstants.SUNDAY);
    } */
 public static void main(String[] args) {

     TestClass testClass = new TestClass();
     testClass.stringCheck();
     testClass.ifElseCheck();
     testClass.forLoopCheck();
     testClass.forEachLoopCheck();
     testClass.whileLoopCheck();
     testClass.switchCheck();

//     System.out.println(testClass.str);
 }
    public void stringCheck(){
        str = str.concat("  - !!");
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        str = str.substring(5);
        System.out.println(str);
        boolean flag  = str.equalsIgnoreCase("LA BLA  - !!");
        System.out.println(flag);
        System.out.println(i);

        str = "5";
        int i = Integer.parseInt(str);
        System.out.println(str);

        i = 85;
        str = String.valueOf(i);
        System.out.println(str);
    }
    public TestClass initialize(){
        i = 99;
        return this;
    }

    public void ifElseCheck(){
     boolean flag1 = false;
     String str1 = "myStr";

     if(str1.equalsIgnoreCase("myStr") || flag1) {
         System.out.println("I'm in if");
     } else {
         System.out.println("I'm in else");
     }
    }

    public void forLoopCheck(){
     for(int i = 0; i < 5; i++) {
            System.out.println("i is " + i);
            if(i == 3){
               break;
            }
     }
    }

    public void forEachLoopCheck(){
     String[] myArray = {"a", "b", "c"};

     for(String str : myArray) {
         System.out.println(str);
         if(str.equalsIgnoreCase("b")){
             break;
         }
     }
    }

    public void whileLoopCheck(){
     int i = 7;

     while(i > 0) {
         System.out.println("i is " + i);
         i--;
         if(i == 3) {
             break;
         }
     }
    }

    public void switchCheck(){
     String str = "c";
     myChar nowChar = myChar.A;

     switch(nowChar){
         case A:
            System.out.println(nowChar);
            break;
         case B:
             System.out.println(nowChar);
             break;
         default:
             System.out.println(str);
     }
    }
}
