public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] arrayInt = {1,2,3,7,6,4};
        double[] arreyDouble = new double[3];
        arreyDouble[0] = 5.75;
        arreyDouble[1] = 6.45;
        arreyDouble[2] = 9.32;
         boolean[] arreyBoolean = {false, true, true, true};

         //Задание 2
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i]);
            if (i != arrayInt.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arreyDouble.length; i++) {
            System.out.print(arreyDouble[i]);
            if (i != arreyDouble.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arreyBoolean.length; i++) {
            System.out.print(arreyBoolean[i]);
            if (i != arreyBoolean.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 3

        for (int i = arrayInt.length -1; i >= 0; i--) {
            System.out.print(arrayInt[i] + ", ");
        }
        System.out.println(arrayInt[0]);

        for (int i = arreyDouble.length -1; i >= 0; i--) {
            System.out.print(arreyDouble[i] + ", ");
        }
        System.out.println(arreyDouble[0]);

        for (int i = arreyBoolean.length -1; i >= 0; i--) {
            System.out.print(arreyBoolean[i] + ", ");
        }
        System.out.println(arreyBoolean[0]);

        //Задание 4

        for (int i = 0; i < arrayInt.length; i++) {
          if (arrayInt[i]%2 !=0) {
              arrayInt[i]++;
          }
            System.out.print(arrayInt[i] + ", ");
        }
    }
}

