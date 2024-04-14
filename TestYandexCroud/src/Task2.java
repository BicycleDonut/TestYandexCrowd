// Задача 2. Отсортировать числа в массиве согласно сумме их цифр.
// Решение: каждый элемент с его суммой цифр сохраняется в векторной паре,
// а затем отсортировываются все элементы вектора в соответствии с сохраненными суммами и выводятся элементы по порядку.
// Временная сложность: O(n log n) для сортировки слиянием и пирамидальной сортировки, но O(n 2 ) для быстрой сортировки.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Task2 {

    static int sumOfDigit(int n)
    {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = Math.floorDiv(n , 10);
        }
        return sum;
    }


    static void sortArr(int[] arr,int n)
    {


        ArrayList<ArrayList<Integer>> vp = new ArrayList<ArrayList<Integer>>();


        for (int i = 0; i < n; i++) {
            ArrayList<Integer>temp = new ArrayList<Integer>();
            temp.add(sumOfDigit(arr[i]));
            temp.add(arr[i]);
            vp.add(temp);
        }


        Collections.sort(vp,new Comparator<ArrayList<Integer>>(){
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });

        for (int i = 0; i < vp.size(); i++){
            System.out.printf("%d ",vp.get(i).get(1));
        }
    }

    public static void main(String args[])
    {
        int[] arr = { 14, 1101, 10, 35, 0 };
        int n = arr.length;
        sortArr(arr, n);
    }


}
