package laba3_1;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<Integer> choizelab;

    @FXML
    private ChoiceBox<String> choizezadan;

    @FXML
    private TextArea label1;

    @FXML
    private Button doing;

    @FXML
    private TextArea text;

    @FXML
    void doingzadan(ActionEvent event) {
        if (choizezadan.getValue() == "1.1") {
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            label1.setText(" Самая короткая строка под №" + (min(mass)+1) + ": " + mass.get(min(mass)) + "\n"+ " Длина этой строки составляет: " + mass.get(min(mass)).length() + "\n"
            + " Самая длинная строка под №" + (maxstr(mass)+1) + ": " + mass.get(maxstr(mass)) + "\n" + " Длина этой строки составляет: " + mass.get(maxstr(mass)).length());}
            
        if (choizezadan.getValue() == "1.2"){
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            mass = sortmass(mass);
            String str = " ";
            for (int i=0; i<mass.size(); i++){
                str += mass.get(i)+" - "+mass.get(i).length()+" | "+mass.get(mass.size()-1-i)+" - "+mass.get(mass.size()-1-i).length()+"\n";}
            label1.setText(str);}

        if (choizezadan.getValue() == "1.3"){
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            String str = " ";
            str += "Среднее значение: " + srednee(mass) + "\n";
            str += "Значения меньше среднего: \n";
            for (int i = 0; i<mass.size(); i++){
                if(mass.get(i).length()<srednee(mass)){
                    str += mass.get(i) +" - Длина: " + mass.get(i).length() + "\n ";
                }
            }
            str += "Значения больше среднего: \n";
            for (int i = 0; i<mass.size(); i++){
                if(mass.get(i).length()>srednee(mass)){
                    str += mass.get(i) +" - Длина: " + mass.get(i).length() + "\n ";
                }
            }
            label1.setText(str);
        }
        
        if (choizezadan.getValue() == "1.4"){
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            ArrayList<Integer> n = new ArrayList<>();
            ArrayList<Integer> index = new ArrayList<>();
            for(int i=0; i < mass.size(); i++){
                ArrayList<String> bukvi = new ArrayList<>();
                for (int j=0; j<mass.get(i).length(); j++){
                    bukvi.add(String.valueOf(mass.get(i).charAt(j)));
                }
                n.add(maxint(zamena(bukvi)));
                index.add(i);
            }
            int otv = 0;
            int c = 0;
            int flag = 0;
            while(c != n.size() && flag !=1){
                if(n.get(c) == maxint(n)){
                    otv = index.get(c);
                    flag = 1;
                }
                else {
                    c = c+1;
                }
            }
            String str = "";
            str = str + " Ответ: " + mass.get(otv);
            label1.setText(str);
            }

        if (choizezadan.getValue() == "1.5"){
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            String lat = "Q W E R T Y U I O P A S D F G H J K L Z X C V B N M";
            ArrayList<String> latList = new ArrayList<>(List.of(lat.split(" ")));
            String latGl = "A E Y U I O";
            ArrayList<String> latGlList = new ArrayList<>(List.of(latGl.split(" ")));
            String str = " ";
            str = str + "Количество слов, содержащих только символы латинского алфавита: " + (zamena(mass, latList)).size() + "\n";
            ArrayList<String> dop = zamena(mass, latList);
            str = str + " Количество слов с равным числом гласных и согласных букв: " + maxstrtwo(dop, latGlList);
            label1.setText(str);
        }

        if (choizezadan.getValue() == "1.6"){
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            String str = " ";
            try {
                str += "Найденное слово: " + poisk(mass).get(0);
            } catch (Exception IndexOutOfBoundsException) {
                str += "Найденное слово: Таких слов нет";
            }
            
            label1.setText(str);
        }

        if (choizezadan.getValue() == "1.7"){
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            ArrayList<ArrayList<Integer>> n = new ArrayList<>();
            for(int i=0; i < mass.size(); i++){
                ArrayList<String> bukvi = new ArrayList<>();
                for (int j=0; j<mass.get(i).length(); j++){
                    bukvi.add(String.valueOf(mass.get(i).charAt(j)));
                }
                n.add(zamena(bukvi));
            }
            for(int i=0; i<n.size(); i++){
                if(max17(n.get(i))){
                    String str = "";
                    str = str + " Ответ: " + mass.get(i);
                    label1.setText(str);
                    break;
                }
            }
        }

        if (choizezadan.getValue() == "1.8"){
            String num = "0 1 2 3 4 5 6 7 8 9";
            ArrayList<String> numList = new ArrayList<>(List.of(num.split(" ")));
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            ArrayList<String> onlynum = zamena(mass, numList);
            String str = " ";
            if(poisk18(onlynum).size() >= 2) {
                str = "Второе слово палиндром: " + poisk18(onlynum).get(1);
            }
            else if (poisk18(onlynum).size()>0 && poisk18(onlynum).size()<2) {
                str = "Одно слово палиндром: " + poisk18(onlynum).get(0);
            }
            else{
                str = "Таких слов нет";
            }
            label1.setText(str);
        }

        if (choizezadan.getValue() == "2.1"){
            String fin = "";
            String str = text.getText();
            fin += "a)Строка: " + str + "\n";
            char lastChar = str.charAt(str.length() - 1);
            fin += "б)Последний символ: " + lastChar + "\n";
            boolean endsWithExclamation = str.endsWith("!!!");
            fin += "в)Строка заканчивается на !!!: " + endsWithExclamation + "\n";
            boolean startsWithILike = str.startsWith("I like");
            fin += "г)Строка начинается с I like: " + startsWithILike + "\n";
            boolean containsJava = str.contains("Java");
            fin += "д)Строка содержит Java: " + containsJava + "\n";
            int javaIndex = str.indexOf("Java");
            fin += "e)Позиция подстроки Java: " + javaIndex + "\n";
            String replacedString = str.replace('a', 'o');
            fin += "ж)Строка после замены: " + replacedString + "\n";
            String upperCaseString = str.toUpperCase();
            fin += "з)Строка в верхнем регистре: " + upperCaseString + "\n";
            String lowerCaseString = str.toLowerCase();
            fin += "и)Строка в нижнем регистре: " + lowerCaseString + "\n";
            String substring = str.substring(7, 11);
            fin += "к)Вырезанная подстрока: " + substring + "\n";
            label1.setText(fin); 
        }

        if (choizezadan.getValue() == "2.2"){
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            int a = Integer.parseInt(mass.get(0));
            int b = Integer.parseInt(mass.get(1));
            StringBuilder summ = new StringBuilder();
            summ.append(a).append(" + ").append(b).append(" = ").append(a + b);
            StringBuilder raz = new StringBuilder();
            raz.append(a).append(" - ").append(b).append(" = ").append(a - b);
            StringBuilder ymn = new StringBuilder();
            ymn.append(a).append(" * ").append(b).append(" = ").append(a * b);
            String fin = "a) Результаты вычислений:\n" + summ +"\n"+raz +"\n"+ymn+"\n";

            StringBuilder sb = new StringBuilder();StringBuilder rb = new StringBuilder();StringBuilder yb = new StringBuilder();
            sb.append(summ);rb.append(raz);yb.append(ymn);
            sb.insert(sb.indexOf("="), " равно").deleteCharAt(sb.indexOf("="));
            rb.insert(rb.indexOf("="), " равно").deleteCharAt(rb.indexOf("="));
            yb.insert(yb.indexOf("="), " равно").deleteCharAt(yb.indexOf("="));
            fin += "б)Строки после замены:\n" + sb +"\n"+rb +"\n"+yb+"\n";

            summ.replace(summ.indexOf("="), summ.indexOf("=") + 1, " равно");
            raz.replace(raz.indexOf("="), raz.indexOf("=") + 1, " равно");
            ymn.replace(ymn.indexOf("="), ymn.indexOf("=") + 1, " равно");
            fin += "в)Строки после замены:\n" + summ +"\n"+raz +"\n"+ymn+"\n";
            label1.setText(fin);
        }

        if (choizezadan.getValue() == "2.3"){
            String str = text.getText();
            String replaceStr = repl(str, "object-oriented programming", "OOP");
            label1.setText(replaceStr);
        }

        if (choizezadan.getValue() == "2.4"){
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            String str = " ";

            for (int i=0; i<mass.size(); i++){
                str = str + "«"+mass.get(i) +"» "+"->" + " «"+ mid(mass.get(i)) +"»\n ";
            }
            label1.setText(str);
        }
        
        if (choizezadan.getValue()== "2.5"){
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            String formattedString = String.format("Студент %-15s получил %3d по %-10s.", mass.get(0), Integer.parseInt(mass.get(1)), mass.get(2));
            label1.setText(formattedString);
        }

        if (choizezadan.getValue()== "2.6"){
            String str = text.getText();
            str = str.replace(".", "");
            String result = remove(str);
            ArrayList<String> mass = new ArrayList<>(List.of(result.split(", ")));
            ArrayList<String> otv = new ArrayList<>();
            for(int i=0; i<mass.size(); i++){
                if(prov(mass.get(i)).length() != 0){
                    otv.add(prov(mass.get(i)));
                }
            }
            String otvet = " ";
            for(int i=0; i<otv.size(); i++){
                otvet = otvet + otv.get(i) + "\n";
            }
            label1.setText(otvet);
        }

        if (choizezadan.getValue()== "2.7"){
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            ArrayList<Integer> n = new ArrayList<>();
            ArrayList<Integer> index = new ArrayList<>();
            for(int i=0; i < mass.size(); i++){
                ArrayList<String> bukvi = new ArrayList<>();
                for (int j=0; j<mass.get(i).length(); j++){
                    bukvi.add(String.valueOf(mass.get(i).charAt(j)));
                }
                n.add(maxint(zamena(bukvi)));
                index.add(i);
            }
            int otv = 0;
            int c = 0;
            int flag = 0;
            while(c != n.size() && flag !=1){
                if(n.get(c) == maxint(n)){
                    otv = index.get(c);
                    flag = 1;
                }
                else {
                    c = c+1;
                }
            }
            String str = "";
            str = str + " Ответ: " + mass.get(otv);
            label1.setText(str);
        }

        if (choizezadan.getValue()== "2.8"){
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            String lat = "Q W E R T Y U I O P A S D F G H J K L Z X C V B N M";
            ArrayList<String> latList = new ArrayList<>(List.of(lat.split(" ")));
            String str = " ";
            str = str + "Количество слов, содержащих только символы латинского алфавита: " + (zamena(mass, latList)).size() + "\n";
            label1.setText(str);
        }

        if (choizezadan.getValue()== "2.9") {
            String num = "0 1 2 3 4 5 6 7 8 9";
            ArrayList<String> numList = new ArrayList<>(List.of(num.split(" ")));
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            ArrayList<String> onlynum = zamena(mass, numList);
            String str = "Найдены слова палиндромы: ";
            for(int i=0;i<poisk18(onlynum).size();i++){
                str = str + poisk18(onlynum).get(i) + " ";
            }
            label1.setText(str);}
        }

    @FXML
    void initialize() {
        choizelab.getItems().addAll(1,2);
        choizelab.setOnAction(actionEvent -> {
            if (choizelab.getValue() == 1) {
                choizezadan.getItems().clear();
                choizezadan.getItems().addAll("1.1","1.2","1.3","1.4","1.5","1.6","1.7","1.8","2.1","2.2","2.3","2.4","2.5","2.6","2.7","2.8","2.9");
            } else {
                choizezadan.getItems().clear();
                choizezadan.getItems().addAll("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15");}
            });
        
    }

    public static int min(ArrayList<String> p) {
        int min = (p.get(0).length());
        int index = 0;
        for (int i = 1; i < p.size(); i++){
            if((p.get(i).length())<min){
                min = (p.get(i).length());
                index = i;
            }
        }
        return index;
    }
    
    public static int maxstr(ArrayList<String> p) {
        int max = (p.get(0).length());
        int index = 0;
        for (int i = 1; i < p.size(); i++){
            if((p.get(i).length())>max){
                max = (p.get(i).length());
                index = i;
            }
        }
        return index;
    
    }

    public static ArrayList<String> sortmass(ArrayList<String> p) {
        for (int i = 0; i < p.size(); i++) {
            for (int j = 0; j < p.size(); j++) {
                try {
                    if (p.get(j).length() > p.get(j+1).length()) {
                        String temp = p.get(j);
                        p.set(j, p.get(j+1));
                        p.set(j+1, temp);
                    }
                    
                } catch (Exception ArrayIndexOutOfBoundsException) {
                    continue;
                }
            }
        }
        return p;
    }

    public static float srednee(ArrayList<String> p) {
        float srznach = 0;
        for (int i = 0; i < p.size(); i++){
            srznach = srznach + p.get(i).length();
        }
        return srznach/p.size();
    }

    public static ArrayList<Integer> zamena(ArrayList<String> p){
        ArrayList<Integer> otvet = new ArrayList<>();
        ArrayList<String> proverka = new ArrayList<>();
        for(int i=0; i<p.size(); i++){
            String stokaOtv = "";
            int chet;
            if(proverka.contains(p.get(i).toLowerCase())){
            }
            else {
                proverka.add(p.get(i));
                chet = 1;
                for(int j=i+1; j<p.size(); j++){
                    if(p.get(i).equalsIgnoreCase(p.get(j))){
                        chet = chet + 1;
                    }
                }
                stokaOtv = stokaOtv+chet;
                otvet.add(Integer.valueOf(stokaOtv));
            }
        }
        return otvet;
    }

    public static int maxint(ArrayList<Integer> p) {
        int max = p.get(0);
        for (int i = 1; i < p.size(); i++){
            if(p.get(i)>max){
                max = p.get(i);
            }
        }
        return max;
    }

    public static int maxstrtwo(ArrayList<String> p, ArrayList<String> q) {
        int chet = 0;
        for(int i=0; i<p.size(); i++){
            int chet1 = 0;
            int kol = p.get(i).length()/2;
            if(p.get(i).length() % 2 == 0){
                for (int j=0; j<p.get(i).length(); j++){
                    String slovo = String.valueOf(p.get(i).charAt(j));
                    if(q.contains(slovo.toUpperCase())){
                        chet1 = chet1 + 1;
                    }
                }
            }
            if (chet1 == kol){
                chet = chet + 1;
            }
        }
        return chet;
    }

    public static ArrayList<String> zamena(ArrayList<String> p, ArrayList<String> q){
        ArrayList<String> proverka = new ArrayList<>();
        for(int i=0; i<p.size(); i++){
            int chet = 0;
            for (int j=0; j<p.get(i).length(); j++){
                String slovo = String.valueOf(p.get(i).charAt(j));
                if(q.contains(slovo.toUpperCase())){
                    chet = chet + 1;
                }
            }
            if (chet == p.get(i).length()){
                proverka.add(p.get(i));
            }
        }
        return proverka;
    }

    public static ArrayList<String> poisk(ArrayList<String> p){
        ArrayList<String> proverka = new ArrayList<>();
        for(int i=0; i<p.size(); i++){
            int chet = 0;
            for (int j=1; j<p.get(i).length(); j++){
                if(p.get(i).charAt(j) <= p.get(i).charAt(j-1)){
                    chet = 1;
                    break;
                }
            }
            if (chet == 0){
                proverka.add(p.get(i));
            }
        }
        return proverka;
    }

    public static boolean max17(ArrayList<Integer> p) {
        boolean flag = false;
        int chet = 0;
        for (int i = 0; i < p.size(); i++){
            if(p.get(i) == 1){
                chet = chet + 1;
            }
        }
        if(chet == p.size()){
            flag = true;
        }
        return flag;
    }

    public static ArrayList<String> poisk18(ArrayList<String> p){
        ArrayList<String> otvet = new ArrayList<>();
        for(int i=0; i<p.size(); i++){
            String proverka = p.get(i);
            int chet = 0;
            for(int j=0; j<p.get(i).length(); j++){
                if(proverka.charAt(j) == p.get(i).charAt(p.get(i).length()-1-j)){
                    chet = chet + 1;
                }
            }
            if(chet == p.get(i).length()){
                otvet.add(p.get(i));
            }
        }
        return otvet;
    }

    public static String repl(String original, String target, String replacement) {
        String lowstr = original.toLowerCase();
        String lowzam = target.toLowerCase();

        int first = lowstr.indexOf(lowzam);
        if (first == -1) {
            return original;
        }
        int Two = lowstr.indexOf(lowzam, first + 1);
        if (Two == -1) {
            return original;
        }
        StringBuilder sb = new StringBuilder(original);
        sb.replace(Two, Two + target.length(), replacement);
        return sb.toString();
    }

    public static String mid(String str) {
        String str1 = "";
        int midIndex = str.length() / 2;
        str1 = str1 + str.charAt(midIndex-1) + str.charAt(midIndex);
        return str1;
    }

    public static String remove(String str) {
        int index = str.indexOf("Java");
        if (index != -1) {
            return str.substring(index);
        }
        return str;
    }
    public static String prov(String p){
        String str = p;
        ArrayList<String> prov1 = new ArrayList<>(List.of(p.split(" ")));
        if(prov1.size() != 2){
            str = "";
        }
        return str;
    }
}
