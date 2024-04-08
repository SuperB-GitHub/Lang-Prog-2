import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
        main13(args);
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
        Scanner in = new Scanner(System.in,"Cp866");
        System.out.println("Введите текст:");
        String txt = in.nextLine();
        char[] chararr = new char[txt.length()];
        for (int i = 0; i < chararr.length; i++) {
            chararr[i] = txt.charAt(i);
        }
        for (int i = 0; i < chararr.length; i++) {
            if (Character.isAlphabetic(chararr[i])==true) {
                continue;} 
            else {chararr[i]=' ';}
        }
        System.out.println(Arrays.toString(chararr));
        in.close();
    }

    public static void main7(String[] args) {
        String[] vowels = {"a","e","o","i","u","y"};
        String vowel = Arrays.toString(vowels);
        Scanner in = new Scanner(System.in,"Cp866");
        System.out.println("Введите текст:");
        String txt = in.nextLine();
        String[] txtarr = txt.split(" ");
        System.out.print("Введите длину: ");
        int len = in.nextInt();
        for (int i = 0; i < txtarr.length; i++) {
            String[] temp = txtarr[i].split("");
            if (vowel.contains(temp[0])==false && temp.length==len) {
                txtarr[i]=" ";}
        }
        String fin = String.join(" ",txtarr);
        System.out.println(fin);
        in.close();
    }

    public static void main8(String[] args) {
        Scanner in = new Scanner(System.in,"Cp866");
        System.out.println("Введите текст:");
        String[] txtarr = in.nextLine().split(" ");
        for (int i = 0; i < txtarr.length; i++) {
            for (int j = 1; j < txtarr.length; j++) {
                String[] temp = txtarr[i].split("");
                String[] temp1 = txtarr[j].split("");
                if (temp.length==temp1.length) {
                    boolean[] bools = new boolean[temp1.length];
                    for (int k = 0; k < temp.length; k++) {
                        if (temp[k].equals(temp1[temp.length-1-k])) {
                            bools[k]=true;}
                    }
                    String bool = Arrays.toString(bools);
                    if (bool.contains("false")) {continue;}
                    else{System.out.println(txtarr[i] +" "+ txtarr[j]);}
                }
            }
        }
        in.close();
        }

    public static void main9(String[] args) {
        Scanner in = new Scanner(System.in,"Cp866");
        System.out.println("Введите текст:");
        String[] txtarr = in.nextLine().split(" ");
        Map<String,Integer> dict = new HashMap<String,Integer>();
        for (int i = 0; i < txtarr.length; i++) {
            int count = 0;
            for (int j = 0; j < txtarr.length; j++) {
                if (txtarr[i].equals(txtarr[j])) {
                    count++;
                }
            }
            if (dict.containsKey(txtarr[i])==false) {
                dict.put(txtarr[i], count);
            }
        }
        System.out.println(dict.toString());
        in.close();
    }

    public static void main10(String[] args) {
        String[] vowels = {"a","e","o","i","u","y"};
        String vowel = Arrays.toString(vowels);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст:");
        String[] txtarr = in.nextLine().split("");
        int vows = 0;
        int cons = 0;
        for (int i = 0; i < txtarr.length; i++) {
            if (vowel.contains(txtarr[i]) && txtarr[i].equals(" ")==false) {
                vows++;}
            else if (txtarr[i].equals(" ")) {
                continue;}
            else{cons++;}
        }
        System.out.println("Гласные: "+vows+" и согласные: "+cons);
        in.close();
    }

    public static void main11(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите мн-во точек через пробел:");
        String[] txtarr = in.nextLine().split(" ");
        int[] intarr = new int[txtarr.length];
        for (int i = 0; i < txtarr.length; i++) {
            intarr[i] = Integer.parseInt(txtarr[i]);}
        int a=0; int b=0; int c=0; double max = 0;
        for (int i = 0; i < intarr.length; i++) {
            for (int j = 0; j < intarr.length; j++) {
                for (int j2 = 0; j2 < intarr.length; j2++) {
                    int ans = intarr[i]+intarr[j]+intarr[j2];
                    if (ans>=max && intarr[i]!=intarr[j] && intarr[j]!=intarr[j2] && intarr[i]!=intarr[j2]) {
                        a = intarr[i];b = intarr[j];c = intarr[j2]; max = ans;
                    }
                }
            }
        }

        System.out.println("1: "+a+" 2: "+b+" 3: "+c+" max: "+max);
        in.close();
    }

    public static void main12(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите мн-во точек через пробел:");
        String[] txtarr = in.nextLine().split(" ");
        int[] intarr = new int[txtarr.length];
        for (int i = 0; i < txtarr.length; i++) {
            intarr[i] = Integer.parseInt(txtarr[i]);}
        int len = 10000; int num = 0; 
        for (int i = 0; i < intarr.length; i++) {
            int ans=0;
            for (int j = 0; j < intarr.length; j++) {
                ans += Math.abs(intarr[i]-intarr[j]); 
            }
            if (ans<=len) {
                len = ans;
                num = intarr[i];
            }
        }
        System.out.println("Число: "+num+" сумма: "+len);
        in.close();
    }
    public static void main13(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во координат: ");
        int val = in.nextInt();
        System.out.println("Введите "+val+" координат:");
        int count=0;
        String[] coords = new String[val];
        Scanner in2 = new Scanner(System.in);
        while (count!=val) {
            String[] temp = in2.nextLine().split(" ");
            int[] intarr = new int[2];
            for (int i = 0; i < 2; i++) {
                intarr[i] = Integer.parseInt(temp[i]);}
            coords[count] = Arrays.toString(intarr);
            count++;
        }

        for (int i = 0; i < coords.length; i++) {
            
        }
        System.out.println(Arrays.toString(coords));
        in2.close();
        in.close();
    }
}