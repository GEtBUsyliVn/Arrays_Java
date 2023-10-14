import java.util.Random;

public class Arrays_Java {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo

        int[]arr = new int[10];    //Создаём массив
        for (int i = 0; i < arr.length ; i++) {    // Проходимся циклом по всему массиву с начала

            arr[i] = i;  // вставляем  значение от 1 до 10(не включительно)
        }
        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo



        }
    }


