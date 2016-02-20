package ross.goncharuk;


public class Main {
    static public void main(String[] args) {

        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};

        int min = m[0];
        for (int arrayElement : m) {
            if (arrayElement < min) {
                min = arrayElement;
            }
        }
        System.out.println(min);

        int max = m[0];
        for (int arrayElement : m) {
            if (arrayElement > max) {
                max = arrayElement;
            }
        }
        System.out.println(max);

        int sum = 0;
        for (int arrayElemnt : m) {
            sum += arrayElemnt;
        }
        System.out.println(sum / m.length);

        int med = m.length / 2;
        System.out.println(m[med]);

    }

}
