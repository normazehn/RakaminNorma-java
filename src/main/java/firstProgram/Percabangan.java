package firstProgram;

import java.util.Scanner;

public class Percabangan {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter password : ");
        String validPassword = "password";

        //jika password benar maka selamat datang
        //jika passrod salah (else) maka error message

        if (password.equals(validPassword)) {
            System.out.println("Selamat datag sayang!");
        } else {
            System.out.println("Password salah, cinta. Coba lagi!");
        }

        System.out.println("Terima kasih sudah sabar luvv");
    }

    //fungsi prompt untuk membaca input dari pengguna
    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}
