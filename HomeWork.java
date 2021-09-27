import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork {


    public static void main(String[] args) {
        String string= "Домшняя работа по теме Generic Java 3";
        Integer[] arrInt =  {1, 2, 3 , 4 , 5, 6, 7} ;
        String[] arrStr = string.split(" ");
        replace(arrStr, 2, 5);
        replace(arrInt, 0, 22);
        somethingArrayToArrayList(arrStr);
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 6; i++) {
            appleBox1.addBox(new Apple());
        }
        appleBox1.boxInfo();
        for (int i = 0; i < 6; i++) {
            orangeBox1.addBox(new Orange());
        }
        orangeBox1.addFruit(new Orange());
        orangeBox1.boxInfo();
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(new Orange());
        orangeBox1.addFruitInBox(orangeBox2);
        orangeBox2.boxInfo();
        System.out.println();
        orangeBox2.boxInfo();
    }



    public static <T> void replace(T[] array, int destination, int from) {
        if (destination > array.length || destination < 0 || from < 0 || from > array.length) {
            System.out.println("длинна массива не позволяет провести изменения");
        } else {
            System.out.println("Исходный массив " + Arrays.toString(array));
            T temp;
            temp = array[destination];
            array[destination] = array[from];
            array[from] = temp;

            System.out.println("Измененный массив " + Arrays.toString(array));
        }
    }
        public static <T > void somethingArrayToArrayList (T[]array){
            List<T> list = new ArrayList<>();
            for (T arr : array) {
                list.add(arr);
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+"-");
            }
            System.out.println();
        }


    }

