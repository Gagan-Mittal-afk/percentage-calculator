import java.util.Scanner;
public class percentagecalculator {
    public static void main (String[]args){
        System.out.println("enterthe total marks of 5 subjects");
        Scanner sc = new Scanner(System.in);
        int total= sc.nextInt();
        System.out.println("marks of subject 1");
        float s1= sc.nextFloat();
        System.out.println("marks of subject 2");
        float s2 = sc.nextFloat();
        System.out.println("marks of subject 3");
         float s3= sc.nextFloat();
        System.out.println("marks of subject 4");
        float s4= sc.nextFloat();
        System.out.println("marks of subject 5");
        float s5= sc.nextFloat();
        float marksobtained= s1+s2+s3+s4+s5;
        float percentage = (marksobtained/total)*100;
        System.out.println("the percentage of 5 subjects is "+ percentage + "%");
    }
}
