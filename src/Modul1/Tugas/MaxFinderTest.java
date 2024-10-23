package Modul1.Tugas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxFinderTest {
    // Pengujian nilai maksimum dari a=1, b=2, c=3
    @Test
    public void testMaxOf123() {
        assertEquals(3, MaxFinder.findMax(1, 2, 3));
    }

    // Pengujian nilai maksimum dari a=-1, b=-2, c=-3
    @Test
    public void testMaxOfNegativeNumbers() {
        assertEquals(-1, MaxFinder.findMax(-1, -2, -3));
    }

    // Pengujian nilai maksimum dari a=0, b=0, c=1
    @Test
    public void testMaxOfZeroesAndOne() {
        assertEquals(1, MaxFinder.findMax(0, 0, 1));
    }

    // Pengujian nilai maksimum dari semua bilangan yang sama
    @Test
    public void testMaxOfSameNumbers() {
        assertEquals(5, MaxFinder.findMax(5, 5, 5));
    }

    // Pengujian nilai maksimum dari bilangan campuran negatif, nol, dan positif
    @Test
    public void testMaxOfMixedNumbers() {
        assertEquals(2, MaxFinder.findMax(-1, 0, 2));
    }

}

class MaxFinder {

    // Fungsi untuk menemukan nilai maksimum dari tiga bilangan bulat
    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
