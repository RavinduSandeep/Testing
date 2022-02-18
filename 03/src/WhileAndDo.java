public class WhileAndDo {

    public static void main(String[] args) {
//While ******************************************************************************
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
// For ******************************************************************************
        for (int i = 1; i != 6; i++) {
            System.out.println("Count2 value is " + i);
        }
// While  with if ******************************************************************************
        count = 1;
        while (true) {
            if (count != 6) {
                System.out.println("Count is " + count);
                count++;
            }
        }
// Do While ******************************************************************************
//        do {
//            System.out.println("Count do is " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);

    }
}




