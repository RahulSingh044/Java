
class loops {

    public static void main(String[] args) {

        int i = 6;
        while (i < 5) {
            System.out.println("Hello World!" + i);
            int j = 1;

            while (j <= i) {
                System.out.println("hey!" + j);
                j++;
            }
            i++;
        }

        do {
            System.out.println("hey!" + i);
            i++;
        } while (i < 5);

        for (int j = 0; j < 5; j++) {
            System.out.println("Buddy!" + j);
            for (int k = 0; k < 3; k++) {
                System.out.println(" " + (i + k));
            }
        }
        // for each loop
        int num[] = new int[5];
        num[0] = 5;
        num[1] = 78;
        num[2] = 88;
        num[3] = 92;
        num[4] = 7;

        for (int x : num) {
            System.out.println("NUmber " + x);
        }

    }
}
