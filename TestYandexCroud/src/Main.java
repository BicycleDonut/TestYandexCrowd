// Задание 1. Найти наибольшее число в массиве, являющееся полным квадратом (квадратом некоторого
//целого числа).
// Решение: Эффективным решением является перебор всех элементов в O (n) и сравнение каждый раз с максимальным элементом,
// а также сохранение максимального числа всех совершенных квадратов.
// Временная сложность : O (N * \sqrt{A_i} )

import java.lang.Math;

class Task1 {

            static boolean checkPerfectSquare(double n)
            {
                double d = Math.sqrt(n);

                if (d * d == n)
                    return true;

                return false;
            }

            static int largestPerfectSquareNumber(int a[], double n)
            {
                int maxi = -1;

                for (int i = 0; i < n; i++) {

                    if (checkPerfectSquare(a[i]))
                        maxi = Math.max(a[i], maxi);
                }

                return maxi;
            }


            public static void main (String[] args) {
                int []a = { 16, 20, 25, 2, 3, 10 };

                double n = a.length;

                System.out.println( largestPerfectSquareNumber(a, n));

            }
        }


