import java.util.Scanner;

public class Dog {
    String type;
    int height;
    int age;
    Dog(){
        age = 0;
    }
    void increase_age(){
        System.out.println("How much do you want to increase the years?: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
           age++;
        }
        System.out.println("the dog has aged " + age + " Years");
    
    }

     void Bark(){
        System.out.println( type + " says " + " Woof");
    }
    void Age(){
        System.out.println(type + " is " + age + " years old");
    }
    
}
