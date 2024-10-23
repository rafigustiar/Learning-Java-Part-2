package Modul1.Codelab;

import java.util.Scanner;

class InvalidEmailExeption extends Exception{
    public InvalidEmailExeption(String message){
        super(message);
    }
}
public class Codelab2 {
    public static void validateEmail(String email) throws InvalidEmailExeption {
        if (!email.endsWith("@webmail.umm.ac.id")) {
            throw new InvalidEmailExeption("Alamat email harus diakhiri dengan '@webmail.umm.ac.id'.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidEmail = false;

        while (!isValidEmail){
            System.out.print("Masukkan alamat email Anda (harus diakhiri dengan '@webmail.umm.ac.id') : ");
            String email = scanner.nextLine().trim();

            try {
                validateEmail(email);
                isValidEmail = true;
                System.out.println("Alamat email anda adalah : " + email);
            } catch (InvalidEmailExeption e) {
                System.out.println("Kesalahan validasi email." + e.getMessage());
                System.out.println("Silahkan coba lagi.");
            }
        }
        scanner.close();
    }

}
