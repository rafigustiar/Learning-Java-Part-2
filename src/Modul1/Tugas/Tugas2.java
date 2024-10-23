package Modul1.Tugas;
import java.util.Scanner;

public class Tugas2 {
    // Custom exception class
    public static class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }
    // Method to validate password
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password harus memiliki panjang minimal 8 karakter.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu karakter huruf besar (A-Z).");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu karakter huruf kecil (a-z).");
        }
        if (!password.matches(".*[0-9].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu karakter angka (0-9).");
        }
        if (!password.matches(".*[!@#$%^&*].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu karakter khusus ('!', '@', '#', '$', '%', '^', '&', '*').");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidPassword = false;

        while (!isValidPassword) {
            System.out.print("Masukkan password Anda: ");
            String password = scanner.nextLine().trim();

            try {
                validatePassword(password);
                isValidPassword = true;
                System.out.println("Password Anda valid.");
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
                System.out.println("Silakan coba lagi.\n");
            }
        }

        scanner.close();
    }
}
