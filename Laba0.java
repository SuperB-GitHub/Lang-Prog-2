public class Laba0 {
    public static int a=1;
    public static int b=3;
    public static int c=9;
    public static int d=27;
    public static void main(String[] args) {
        main11(args);}

    public static void main0(String[] args) {
        System.out.println("Рурурy");}

    public static void main1(String[] args) {
        System.out.print("Hello world\n"+"Not hello world");}

    public static void main2(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println("Hello world "+ i);}}

    public static void main3(String[] args) {
        int a=4;
        int b=3;
        int c=a-b;
        System.out.println(Integer.toString(c));}

    public static void main4(String[] args) {
        int x = 2;
        int y = 12;
        x=y-x;
        y=y+x;
        System.out.println(x);
        System.out.println(y);}

    public static void main5(String[] args) {
        System.out.print("Курва ");
        // System.out.print("Бобер ");
        System.out.print("Ужик ");
        // System.out.print("Ежик ");
        System.out.print("Хомик ");
    }
    public static void main6(String[] args) {
        String priv="Привет";
        System.out.printf("%s",priv);}

    public static void main7(String[] args) {
        int num=2;
        Integer.toString(num);
        System.out.println(num*num);}

    public static void main8(String[] args) {
        for(int i=1;i<11;i++){
            System.out.println("yea");
        }
    }

    public static void main9(String[] args) {
        String s="Оценка ";
        System.out.println(s);
        // System.out.print("5");
        System.out.print("4");
        // System.out.print("3");
        // System.out.println("Удовл.");
        System.out.println("Хорошо");
        // System.out.println("Отлично");
    }

    public static void main10(String[] args) {
        String dg="DS";
        String text=dg+"TU"+"!";
        System.out.println(text);
    }

    public static void main11(String[] args) {
        int res=-a+b-c+d;
        System.out.println(res);
    }
    public static void main12(String[] args) {
        System.out.println(sqr(5));
    }
    public static int sqr(int a){
        return a * a;
    }
    public static void main13(String[] args) {
        // int a = 1;
        double b = 1.5;
        double c = b + 1.5;
        // int d = a + 12;
        // double e = 12.3;
        // String s = "Luke, " + a;
        String s1 = "Twice ";
        // String s2 = "a";
        String s3 = s1 + "the pride, ";
        String s4 = " the fall.";
        System.out.println(s3 + c + s4);
    }
    public static void main14(String[] args) {
        print("The power is easy to use!");
        print("The power opens many opportunities!");}
    public static void print(String s) {
        for (int i=1;i<3;i++){
            System.out.println(s);}   
    }
    public static void main15(String[] args) {
        count(5);
    }
    public static void count(int n) {
        System.out.println("Первая степень числа "+n+" = "+n);
        System.out.println("Квадрат числа "+n+" = "+n*n);
        System.out.println("Куб числа "+n+" = "+n*n*n);
        System.out.println("Четвертая степень числа "+n+" = "+n*n*n*n);
    }
    public static void main16(String[] args) {
        say("Mike", "black");
    }
    static void say(String name, String color){
        System.out.println("Hello, my name is "+name+" and my cat is "+color);
    }


    public static void main17(String[] args) {
        Owner owner_1 = new Owner();
        Pet pet_1 = new Pet();
        owner_1.name = "Mike";
        pet_1.kind = "cat";
        pet_1.color = "black";
        owner_1.pet = pet_1;
        owner_1.say();
    }
    static class Owner{
        String name;
        Pet pet;
        void say(){
            System.out.println("Hello, my name is " + name + " and my " + pet.kind + " is " + pet.color);
        }
    }
    static class Pet{
         String kind;
         String color;
    }


    public static void main18(String[] args) {
        increaseSpeed(700);
    }
    static void increaseSpeed(int s){
        System.out.println("Your speed is: "+(s+100)+" km/h.");
    }

    public static void main19(String[] args) {
        Zam zam = new Zam();
        Dron dron = new Dron();
        zam.spy = dron;
        dron.hunter=zam;
    } 
    public static class Zam {
        public int kam;
        public int dam;
        public Dron spy;
    }
    public static class Dron {
        public int kron;
        public int pron;
        public Zam hunter;
    }
    public static void main20(String[] args) {
        Jedi jedi1 = new Jedi();
        jedi1.name = "Obi-Wan";
        Jedi jedi2 = new Jedi();
        jedi2.name = "Anakin";
        Jedi jedi3 = new Jedi();
        jedi3.name = "Joda";
    }
    public static class Jedi {
        public String name;
    }
    public static void main21(String[] args) {
        // Clone clone1 = new Clone();
        // Clone clone2 = new Clone();
        // Clone clone3 = new Clone();
        // Clone clone4 = new Clone();
        // Clone clone5 = new Clone();
        // Clone clone6;
        // Clone clone7;
    }
    public static class Clone {}

    public static void main22(String[] args) {
        Clone1 clone1 = new Clone1();
        Clone2 clone2 = new Clone2();
        Clone3 clone3 = new Clone3();
        Dias dias = new Dias();
        clone1.owner=dias;
        clone2.owner=dias;
        clone3.owner=dias;
    }
    public static class Clone1 {
        public Dias owner;
    }
    public static class Clone2 {
        public Dias owner;
    }
    public static class Clone3 {
        public Dias owner;
    }
    public static class Dias {
    }
    public static void main23(String[] args) {
        System.out.println(getWeight(888));
    }
    public static double getWeight(int weight) {
        weight=weight/6;
        return weight;
    }

    public static void main24(String[] args) {
        print3("dump");
        print3("cargo");
    }
    public static void print3(String s) {
        System.out.println(s + " " + s + " " + s + " ");
    }

    public static void main25(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
    public static int min (int a, int b) {
        if (a<b) {
            return a;
        } else {
            return b;
        }
    }
}