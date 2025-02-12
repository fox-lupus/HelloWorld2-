import java.util.Date;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println(new Date().toString()); 
        Runtime runtime = Runtime.getRuntime();
        System.out.printf("free memory for JVM %d (MB) \n", runtime.freeMemory() / (1024 * 1024) ); 

        System.out.println(new Date().toString()); 

        System.out.println("hi, Alice"); 
        System.out.println("hi, Bob"); 
        System.out.println("hi, Alice"); 
        System.out.println("hi, Bob"); 
        
        System.out.println("hi, Charlie"); 
        System.out.println("hi, Denise"); 
        System.out.println("hi, Ester"); 
    }
}