package Application;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number1,number2, select,resultado=0;


        System.out.print("Digite o primeiro numero: ");
        number1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        number2 = sc.nextInt();

        System.out.println("Informe o que deseja fazer:");
        System.out.println(" 1 - soma\n" +
                           " 2 - subtração\n" +
                           " 3 - multiplicação\n" +
                           " 4 - divisão\n");

        select = sc.nextInt();

        switch (select){
            case 1:
                resultado = number1 + number2;
                System.out.println(resultado);
                break;
            case 2:
                resultado = number1 - number2;
                System.out.println(resultado);
                break;
            case 3:
                resultado = number1 * number2;
                System.out.println(resultado);
                break;
            case 4:
                resultado = number1 / number2;
                System.out.println(resultado);
                break;

            default:
                System.out.println("Informe um valor valido!");
        }

        sc.close();
    }

}
