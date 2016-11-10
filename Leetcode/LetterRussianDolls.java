import java.util.*;

public class LetterRussianDolls {

    public static void main(String[] args) {
        Envelope[] list = { new Envelope(10, 10), new Envelope(5, 5), new Envelope(1, 2), new Envelope(9, 9), new Envelope(8, 9), new Envelope(2, 5), new Envelope(1, 1) };
        Arrays.sort(list);
        int count = 0;
        Envelope prev = null;
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(prev) != 0) {
                count++;
            }
            prev = list[i];
        }
        System.out.println(count);
    }

    static class Envelope implements Comparable<Envelope> {
        int w, h;

        public Envelope(int w, int h) {
            this.w = w;
            this.h = h;
        }

        public int compareTo(Envelope e) {
            if (e == null) {
                return 1;
            }
            if (this.w < e.w && this.h < e.h) {
                return -1;
            } else if (this.w > e.w && this.h > e.h) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}