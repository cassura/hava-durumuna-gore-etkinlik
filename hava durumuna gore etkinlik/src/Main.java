import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        System.out.println("Sıcaklığı giriniz:");
        sicaklik = input.nextInt();



        if (sicaklik <5){
            System.out.println("kayağa gidebilirsiniz");}

            else if (sicaklik>5 && sicaklik<25){
                if (sicaklik <=15) {
                    System.out.println("sinemaya gidebilirsiniz");}
                if (sicaklik >=10){
                    System.out.println("pikniğe gidebilirsiniz");
                }
            }
            else {
            System.out.println("yüzmeye gidebilirsiniz");
        }
    }
}