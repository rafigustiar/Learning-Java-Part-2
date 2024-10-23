package Modul2.Demo.After;

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
    public static final int VVIP = 1000000;
    private String seatType;
    private int seatPrice;

    public void setSeat(int seatChoice) {
        ChoiceSeat(seatChoice);
    }

    private void ChoiceSeat(int seatChoice) {
        switch (seatChoice) {
            case 1:
                this.setSeatType("VVIP");
                this.setSeatPrice(VVIP);
                break;
            case 2:
                this.setSeatType("VIP");
                this.setSeatPrice(500000);
                break;
            case 3:
                this.setSeatType("Reguler");
                this.setSeatPrice(200000);
                break;
            default:
                this.setSeatType("Invalid Seat");
                this.setSeatPrice(0);
        }
    }

    public String getSeatType() {
        return this.seatType;
    }

    public int getSeatPrice() {
        return this.seatPrice;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
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

