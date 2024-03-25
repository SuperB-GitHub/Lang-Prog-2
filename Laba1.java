import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Laba1 {
    public static void main(String[] args) {
        main19(args);
    }
    public static void main1(String[] args) {
        int[] X = {20,3,4,12,16,31,50,10,45,36,12,87,65,43,2,3,6,45,4,90};
        int[] Y = {12,23,34,5,67,43,6,7,30,49,50,42,21,56,70};
        double z;
        z=((Math.pow(Math.E, Math.abs(getMax(Y)))-Math.pow(Math.E, Math.abs(getMax(X))))/(Math.sqrt(Math.abs(getMax(X)*getMax(Y)))));
        System.out.println(z);
    }
    public static int getMax(int[] mass) {
        Arrays.sort(mass);
        return mass[mass.length-1];
    }
    public static int getMin(int[] mass) {
        Arrays.sort(mass);
        return mass[0];
    }
    public static void main2(String[] args) {
        int[] S = {50,10,45,36,12,65};
        int[] T = {20,3,4,12,16,31};
        int[] K = {43,2,3,6,4,90};
        double M = (getSum(S)+getSum(T)+getSum(K))/2;
        System.out.println(M);
    }
    public static int getSum(int[] mass) {
        int fin=0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]>0) {
                fin = fin+mass[i];}}
        return fin;
    }
    public static void main3(String[] args) {
        int c;
        int m=7;
        int n=5;
        c=getFact(m)/(getFact(n)*(getFact(m-n)));
        System.out.println(c);
        
    }
    public static int getFact(int m) {
        int fin=1;
        for (int i = 1; i <= m; i++) {
            fin=fin*i;}
        return fin;
    }
    public static void main4(String[] args) {
        int x=3;
        int y=4;
        int z=5;
        double s=getSinSqrt(x, y)+getSinSqrt(y, z)+getSinSqrt(x, z);
        System.out.println(s);
    }
    public static double getSinSqrt(int a, int b) {
        return Math.sqrt(Math.pow(a, 2)+Math.pow(b,2)+Math.pow(Math.sin(a*b),2));
    }
    public static void main5(String[] args) {
        int[] X = {20,3,4,12,16,31,50,10,45,36,12,87,65,43,2,3,6,45,4,90};
        int[] Y = {12,23,34,5,67,43,6,7,30,49,50,42,21,56,70};
        int[] Z = {4,7,12,6,45,32,-8,10,11,25};
        System.out.println("Значение X: "+getAvg(X));
        System.out.println("Значение Y: "+getAvg(Y));
        System.out.println("Значение Z: "+getAvg(Z));
    }
    public static double getAvg (int[] mass) {
        double fin=0;
        int i2=0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]>0) {
                fin=fin+mass[i];
                ++i2;}}
        return fin/i2;
    }
    public static void main6(String[] args) {
        int[] A = {20,3,4,12,-16,31,-50,10,45,36,12,87,65,-43,2,3,6,45,4,90};
        int[] B = {12,23,34,5,67,43,6,7,30,49,50,42,21,56,70};
        int[] C = {4,7,12,6,45,32,-8,10,11,25,-3,0};
        System.out.println(getAnswer(A, B, C));
        
    }
    public static double getAnswer(int[] mass_a,int[] mass_b,int[] mass_c) {
        if (Math.abs(getMin(mass_a))>10) {
            return getMin(mass_b)+getMin(mass_c);
        } else {
            return 1+Math.abs(getMin(mass_c));
        }
    }
    public static void main7(String[] args) {
        int[] A = {20,3,4,12,-16,31,-50,10,45,36,12,87,65,-43,2,3,6,
            45,4,90,12,23,34,5,67,43,6,7,30,49,50,42,21,56,70};
        System.out.println(getAvgGeo(A));
    }
    public static double getAvgGeo(int[] mass) {
        double fin=1;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]<12 && mass[i]>0)  {
                fin=fin*mass[i];}}
        return Math.sqrt(fin);
    }
    public static void main8(String[] args) {
        int[] A = {20,3,4,12,-16,31,-50,10,45,36,12,87,65,-43,2,3,6,
            45,4,90,12,23,34,5,-67,43,6,7,30,49,50,42,21,56,70,-7,12,6,
            45,32,-8,10,11,25,-3,0};
        System.out.println(getOtrNot(A));
    }
    public static double getOtrNot(int[] mass) {
        int fin=0;
        int count=0;
        for (int i : mass) {
            if (i<0 && i%2!=0) {
                fin=fin+i;
                count+=1;}}
        System.out.println(fin);
        return count;
    }
    public static void main9(String[] args) {
        int[] A = {20,3,4,12,-16,31,-50,10,45,36,12,87,65,-43,2,3,6,
            45,4,90,12,23,34,5,-67,43,6,7,30,49,50,42,21,56,70,-7,12,6,
            45,32,-8,10,11,25,-3,0};
        System.out.println(getPlAvg(A));
    }
    public static int getPlAvg(int[] mass) {
        int fin=0;
        for (int i : mass) {
            fin=fin+i;}
        return fin;
    }
    public static void main10(String[] args) {
        int[] A = {20,3,4,12,-16,31,-50,10,45,36,12,87,65,-43,2,3,6,
            45,4,90,12,23,34,5,-67,43,6,7,30,49,50,42,21,56,70,-7,12,6,
            45,32,-8,10,11,25,-3,0};
        int[] B = getSumDig(A);
        Arrays.sort(A, 0, 0);
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
    public static int[] getSumDig(int[] mass){
        int[] mass2 = new int[mass.length];
        int sum=0;
        for (int i = 0; i < mass.length; i++) {
            int num = mass[i];
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            mass2[i]=sum;
            sum=0;
        }
        return mass2;
    }
    // public static int[] getSorted (int[] mass, int[] mass2) {
    //     int[] mass1 = new int[mass.length];
    //     int p = 1;
    //     while (p!=0) {
    //         for (int i = 0; i < mass.length; i++) {
                
    //         } 
    //     }
    // }
    public static void main12(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Ваше число имеет: "+getCateg(num)+" разряда");
        in.close();
    }
    public static int getCateg(int num){
        int fin=0;
        while (num!=0) {
            num /= 10;
            fin+=1;
        }
        return fin;
    }
    public static void main13(String[] args) {
        int s=0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= 5; i++) {
            s+=(-1)*i*(num/getFact(i));}
        System.out.println("Значение: "+s);
        in.close();
    }
    public static void main14(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] out = str.split(" ");
        String fin="";
        for (int i = out.length-1; i>=0; i--) {
            fin+=out[i]+" ";
        }
        System.out.println(fin);
        in.close();
    }
    public static void main15(String[] args) {
        int[] A = {20,3,4,12,-16,31,-50,10,45,36,12,87,65,-43,2,3,6,
            45,4,90,12,23,34,5,-67,43,6,7,30,49,50,42,21,56,70,-7,12,6,
            45,32,-8,10,11,25,-3,0};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();
        System.out.println(getBinSearch(A, num));
        in.close();
    }
    public static int getBinSearch(int[] mass, int find) {
        Arrays.sort(mass);
        int low = 0;
        int high = mass.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int value = mass[mid];

            if (value < find)
                low = mid + 1;
            else if (value > find)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1;  // key not found.
    }
    public static void main16(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = in.nextInt();
        System.out.println("Введите второе число:");
        int num2 = in.nextInt();
        System.out.println("НОД этих чисел:");
        System.out.println(getNOD(num1, num2));
        in.close();
    }
    public static int getNOD(int num1, int num2){
        while (num1!=num2){
            if (num1>num2) {
                num1=num1-num2;}
            else if(num1<num2) {
                num2=num2-num1;}
            else{
                return num1;
            }
        }
        return num1;
    }
    public static void main17(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во углов фигуры:");
        int num = in.nextInt();
        System.out.println("Фигура и его площадь:");
        if (num==0) {
            System.out.println("Круг");} 
        else if (num==3) {
            System.out.println("Треугольник");} 
        else if (num==4) {
            System.out.println("Прямоугольник");} 
        else {
            System.out.println("Такой фигуры нет");}
        System.out.println(getGeom(num));
        in.close();
    }
    public static double getGeom(int num){
        Scanner in = new Scanner(System.in);
        if (num==0) {
            System.out.println("Введите радиус круга:");
            int r = in.nextInt();
            in.close();
            return Math.PI*Math.pow(r,2);} 
        else if (num==3) {
            System.out.println("Введите основание и высоту:");
            int a = in.nextInt();
            int h = in.nextInt();
            in.close();
            return (1/2)*a*h;} 
        else if (num==4) {
            System.out.println("Введите первую и вторую сторону:");
            int a = in.nextInt();
            int h = in.nextInt();
            in.close();
            return a*h;}
        else {
            in.close();
            return 0;}
    }
    public static void main18(String[] args) {
        int[][] arrays = new int[10][];
        int[] sums = new int[10];
        for (int i = 0; i < 10; i++) {
            arrays[i] = getRandomArray(0,100);
            sums[i] = getCalcMass(arrays[i]);

            System.out.println("Массив " + (i + 1) + ": " + Arrays.toString(arrays[i]));
            System.out.println("Сумма элементов: " + sums[i]);
            System.out.println();
        }

        int maxSum = sums[0];
        int maxSumIndex = 0;
        for (int i = 1; i < 10; i++) {
            if (sums[i] > maxSum) {
                maxSum = sums[i];
                maxSumIndex = i;}}
        System.out.println("Массив с максимальной суммой элементов: " + Arrays.toString(arrays[maxSumIndex]));
        System.out.println("Сумма элементов: " + maxSum);
        System.out.println("Номер массива: " + maxSumIndex);
    }

    public static int[] getRandomArray(int first, int second) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(first, second);}
        return array;
    }

    public static int getCalcMass(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];}
        return sum;
    }

    public static void main19(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность квадратной матрицы: ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();}}
        System.out.print("Выберите диагональ (1 - главная, 2 - побочная): ");
        int diagonalChoice = in.nextInt();
        int diagonalSum = getCalcDiag(matrix,diagonalChoice);
        System.out.println("Сумма выбранной диагонали: " + diagonalSum);
        in.close();
    }

    public static int getCalcDiag(int[][] matrix, int diag) {
        int sum = 0;
        int n = matrix.length;
        if (diag == 1) {
            for (int i = 0; i < n; i++) {
                sum += matrix[i][i];}
            return sum;
        } else if (diag == 2) {
            for (int i = 0; i < n; i++) {
                sum += matrix[i][n - 1 - i];}
            return sum;
        } else {
            System.out.println("Некорректный выбор диагонали!");
            return 0;
        }
    }

    
}