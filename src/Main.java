public class Main {
    public static void main(String[] args) {

        //Задача 1

        int[] arrInt = new int[3];
        for (int i = 0; i < 3; i++) {
            arrInt[i] = i + 1;
        }

        double[] arrDouble = {1.57, 7.654, 9.986};

        char[] arrChar = {'A', 'B', 'C', 'D'};


        //Задача 2

        for (int i = 0; i < 2; i++) {
            System.out.print(arrInt[i] + ", ");
        }
        System.out.println(arrInt[2]);

        for (int i = 0; i < 2; i++) {
            System.out.print(arrDouble[i] + ", ");
        }
        System.out.println(arrDouble[2]);

        for (int i = 0; i < 3; i++) {
            System.out.print(arrChar[i] + ", ");
        }
        System.out.println(arrChar[3]);


        //Задача 3

        for (int i = arrInt.length - 1; i > 0; i--) {
            System.out.print(arrInt[i] + ", ");
        }
        System.out.println(arrInt[0]);

        for (int i = arrDouble.length - 1; i > 0; i--) {
            System.out.print(arrDouble[i] + ", ");
        }
        System.out.println(arrDouble[0]);

        for (int i = arrChar.length - 1; i > 0; i--) {
            System.out.print(arrChar[i] + ", ");
        }
        System.out.println(arrChar[0]);


        //Задача 4

        for (int i = 0; i < arrInt.length - 1; i++) {
            if (arrInt[i] % 2 == 1) {
                arrInt[i] += 1;
            }
            System.out.print(arrInt[i] + ", ");
        }

        if (arrInt[arrInt.length - 1] % 2 == 1) {
            arrInt[arrInt.length - 1] += 1;
        }
        System.out.println(arrInt[arrInt.length - 1]);

    }
}