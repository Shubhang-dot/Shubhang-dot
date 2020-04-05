package Tutorials;

public class ifcode2 {
    public static void main(String[] args){
        int age = 65;
        if (age < 18){
            System.out.println("You are not eligible to work here");
        }else if (age > 18 && age < 59){
            System.out.println("You are eligible to work here");
        }else{
            System.out.println("You are too old to do this job");
        }
    }
}
