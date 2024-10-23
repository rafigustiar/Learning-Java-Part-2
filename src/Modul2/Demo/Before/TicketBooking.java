package Modul2.Demo.Before;

import java.util.Scanner;

// Kelas Event yang menyimpan detail event
class Event {
    private String eventName;

    public void setEventName(int eventChoice) {
        switch (eventChoice) {
            case 1:
                this.eventName = "Event A";
                break;
            case 2:
                this.eventName = "Event B";
                break;
            case 3:
                this.eventName = "Event C";
                break;
            default:
                this.eventName = "Invalid Event";
        }
    }

    public String getEventName() {
        return this.eventName;
    }
}

// Kelas Seat untuk kategori kursi
class Seat {
    private String seatType;
    private int seatPrice;

    public void setSeat(int seatChoice) {
        switch (seatChoice) {
            case 1:
                this.seatType = "VVIP";
                this.seatPrice = 1000000;
                break;
            case 2:
                this.seatType = "VIP";
                this.seatPrice = 500000;
                break;
            case 3:
                this.seatType = "Reguler";
                this.seatPrice = 200000;
                break;
            default:
                this.seatType = "Invalid Seat";
                this.seatPrice = 0;
        }
    }

    public String getSeatType() {
        return this.seatType;
    }

    public int getSeatPrice() {
        return this.seatPrice;
    }
}

// Kelas Food untuk pilihan makanan
class Food {
    private int foodCount;
    private final int foodPrice = 50000;

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getFoodCost() {
        return this.foodCount * foodPrice;
    }
}

// Kelas utama TicketBooking yang mengelola semua komponen
public class TicketBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Event event = new Event();
        Seat seat = new Seat();
        Food food = new Food();

        // Pemilihan Event Pertandingan
        System.out.println("Pilih Event Pertandingan:");
        System.out.println("1. Event A");
        System.out.println("2. Event B");
        System.out.println("3. Event C");
        System.out.print("Masukkan pilihan event (1-3): ");
        int eventChoice = scanner.nextInt();
        event.setEventName(eventChoice);

        // Pemilihan Kategori Kursi
        System.out.println("\nPilih Kategori Kursi:");
        System.out.println("1. VVIP (Rp 1.000.000)");
        System.out.println("2. VIP (Rp 500.000)");
        System.out.println("3. Reguler (Rp 200.000)");
        System.out.print("Masukkan pilihan kursi (1-3): ");
        int seatChoice = scanner.nextInt();
        seat.setSeat(seatChoice);

        // Pemilihan Jumlah Tiket
        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
        int ticketCount = scanner.nextInt();
        int totalCost = seat.getSeatPrice() * ticketCount;

        // Pemilihan Makanan
        System.out.println("\nApakah Anda ingin membeli makanan? (Y/N)");
        char foodChoice = scanner.next().charAt(0);
        if (foodChoice == 'Y' || foodChoice == 'y') {
            System.out.print("Masukkan jumlah makanan yang ingin dibeli: ");
            int foodCount = scanner.nextInt();
            food.setFoodCount(foodCount);
            totalCost += food.getFoodCost();
        }

        // Ringkasan Pemesanan
        System.out.println("\nRingkasan Pemesanan:");
        System.out.println("Event: " + event.getEventName());
        System.out.println("Kategori Kursi: " + seat.getSeatType());
        System.out.println("Jumlah Tiket: " + ticketCount);
        System.out.println("Total Biaya: Rp " + totalCost);

        scanner.close();
    }
}
