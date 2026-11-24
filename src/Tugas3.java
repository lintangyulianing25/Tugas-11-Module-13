import java.util.Scanner;

public class Tugas3 {

    static void main(String[] args) {

        //Scanner Input
        Scanner keyboard = new Scanner(System.in);

        //Tampilan untuk Input
        System.out.println("Masukkan bilangan bulat pertama : " );
        int a = keyboard.nextInt();

        System.out.println("Masukkan bilangan bulat kedua : " );
        int b = keyboard.nextInt();

        //Operator Rsional
        System.out.println(a + "==" + b + " : " + (a == b));
        System.out.println(a + "!=" + b + " : " + (a != b));
        System.out.println(a + ">" + b + " : " + (a > b));
        System.out.println(a + ">=" + b + " : " + (a >= b));
        System.out.println(a + "<" + b + " : " + (a < b));
        System.out.println(a + "<=" + b + " : " + (a <= b));
    }
}
