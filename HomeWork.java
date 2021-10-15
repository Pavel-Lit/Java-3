import java.sql.Array;
import java.util.Arrays;

public class HomeWork {
    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args) throws RuntimeException {

    }

    public static int[] addToArray(int[] array) {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static int[] numberAfterFour(int[] array) {
        int tempIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                tempIndex = i;
            }
        }
        if (tempIndex == -1)
            throw new RuntimeException();

        else {
            int[] newArray;
            newArray = Arrays.copyOfRange(array, (tempIndex + 1), array.length);
            return newArray;
        }

    }

    public static boolean haveOneAndFour(int[] array) {
        boolean one = true;
        boolean four = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1) {
                if (array[i] != 4) {

                    four = false;
                    one = false;
                }
            }
        }
        return one & four;
    }

}
