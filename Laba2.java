import java.util.Arrays;
import java.util.Scanner;

public class Laba2 {
    public static String[] getstrsn() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во строк: ");
        int n = in.nextInt();
        String[] strs = new String[n];
        Scanner in2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку № "+(i+1));
            strs[i] = in.nextLine();
        }
        in.close();
        in2.close();
        return strs;
    }
    public static void main(String[] args) {
        main6(args);
    }
    public static void main1(String[] args) {
        String[] strs = getstrsn();
        int istr = 0;
        int max = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length()>max) {
                istr=i;
                max=strs[i].length();
            }
        }
        System.out.println();
        System.out.println("Строка: "+strs[istr]+" и её длина: "+max);
        
    }

    public static void main2(String[] args) {
        String[] strs = getstrsn();
        int[] ints = new int[strs.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=strs[i].length();
        }
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                try {
                    if (ints[j]<ints[j+1]) {
                        int temp = ints[j];
                        String temp2 = strs[j];
                        ints[j] = ints[j+1];
                        strs[j] = strs[j+1];
                        ints[j+1] = temp;
                        strs[j+1] = temp2;
                    }
                } catch (Exception ArrayIndexOutOfBoundsException) {
                    continue;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Строка: "+strs[i]+" и её длина: "+ints[i]);   
        }
    }

    public static void main3(String[] args) {
        String[] strs = getstrsn();
        int[] ints = new int[strs.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=strs[i].length();
        }
        int sum = 0;
        for (int i : ints) {
            sum+=i;
        }
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length()<sum/strs.length) {
                System.out.println("Строка: "+strs[i]+" и её длина: "+ints[i]); 
            }
        }
    }

    public static void main4(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите текст:");
        String str = in.nextLine();
        System.out.print("Введите k: ");
        int k = in.nextInt();
        System.out.println("Введите символ: ");
        String sumb = in2.nextLine();
        String[] ArrStr = str.split(" ");
        str="";
        for (String word : ArrStr) {
            if (k<word.length()) {
                String[] temp = word.split("");
                for (int i = 1; i <= temp.length/4; i++) {
                    temp[4*i] = sumb;
                }
                word = String.join("", temp);
            } else{
                System.out.println("Не хватает k");
                continue;
            }
            str += String.join("  ", word)+" ";
        }
        System.out.println(str);
        in.close();
        in2.close();
    }

    public static void main5(String[] args) {
        Scanner in = new Scanner(System.in,"Cp866");
        System.out.println("Введите русский текст:");
        String rus = in.nextLine();
        String[] rusarr = rus.split("");
        int[] intarr = new int[rusarr.length];
        for (int i = 0; i < rusarr.length; i++) {
            char intr = rusarr[i].charAt(0);
            intarr[i] = intr;
        }
        for (int i = 0; i < rusarr.length; i++) {
            rusarr[i] = "  "+rusarr[i]+" ";
        }
        System.out.println(Arrays.toString(rusarr));
        System.out.println(Arrays.toString(intarr));
        in.close();
    }
    
    public static void main6(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст:");
        String txt = in.nextLine();
        // String[] txtarr = txt.split("");
        char[] chararr = new char[txt.length()];
        for (int i = 0; i < chararr.length; i++) {
            chararr[i] = txt.charAt(i);
        }
        for (Character word : chararr) {
            if (word.isAlphabetic(0)==true) {
                continue;} 
            else {
                chararr[word]=' ';

                
            }
        }
        System.out.println(Arrays.toString(chararr));
        in.close();
    }
}
