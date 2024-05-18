package laba;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Scanner;

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
    private ChoiceBox<Integer> choizepart;

    @FXML
    private ChoiceBox<String> choizezadan;

    @FXML
    private Button doing;

    @FXML
    private TextArea label1;

    @FXML
    private TextArea label2;

    @FXML
    private TextArea text;

    @FXML
    void doingzadan(ActionEvent event) {
        if (choizezadan.getValue() == "1. Инициализация списка") {
            if(!text.getText().isEmpty()){
                ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
                label1.setText("Cписок:\n"+String.valueOf(mass));
                label2.setText("Ответ: " + mass);
            }
            else{
                ArrayList<String> mass = new ArrayList<>();
                label1.setText("Cписок:\n"+String.valueOf(mass));
                label2.setText("Не инициализирован\nОтвет: " + mass);
            }
        }
        if (choizezadan.getValue() == "2. Добавление элемента в начало списка") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
            label1.setText(String.valueOf(mass));
            mass.add(0, text.getText());
            label2.setText("Ответ: " + String.valueOf(mass));
        }
        if (choizezadan.getValue() == "3. Добавление элемента в конец списка") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
            label1.setText(String.valueOf(mass));
            mass.add(text.getText());
            label2.setText("Ответ: " + mass);
        }
        if (choizezadan.getValue() == "4. Показ всех элементов списка") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
            label1.setText(String.valueOf(mass));
            String str = "";
            for(int i=0; i<mass.size(); i++){
                str += mass.get(i) + "\n";
            }
            label2.setText("Ответ:\n" + str);
        }
        if (choizezadan.getValue() == "5. Удаление всех элементов списка") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
            label1.setText(String.valueOf(mass));
            while (mass.size() !=0){
                mass.remove(0);
            }
            label2.setText("Ответ: " + mass);
        }
        if (choizezadan.getValue() == "6. Определение количества элементов списка") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
            label1.setText(String.valueOf(mass));
            label2.setText("Ответ: " + String.valueOf(mass.size()));
        }
        if (choizezadan.getValue() == "7. Проверка списка на пустоту") {
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            label1.setText(String.valueOf(mass));
            if (mass.size()==1 && mass.contains("")) {
                label2.setText("Список пустой");
            } else {
                label2.setText("Список не пустой");
            }
        }
        if (choizezadan.getValue() == "8. Удаление первого элемента") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
            label1.setText(String.valueOf(mass));
            mass.remove(0);
            label2.setText("Ответ: " + mass);
        }
        if (choizezadan.getValue() == "9. Удаление последнего элемента") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
            label1.setText(String.valueOf(mass));
            mass.remove(mass.size()-1);
            label2.setText("Ответ: " + mass);
        }
        if (choizezadan.getValue() == "10. Поиск данного значения в списке") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
            label1.setText(String.valueOf(mass));
            for (int i=0; i<mass.size(); i++){
                if(Objects.equals(mass.get(i), text.getText())){
                    label2.setText("Элемент " + text.getText() + " найден. Его индекс: " + i);
                    break;
                }
                else {
                    label2.setText("Элемент " + text.getText() + " не найден");
                }
            }
        }
        if (choizezadan.getValue() == "11. Поиск наибольшего и наименьшего значений в списке") {
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            label1.setText(String.valueOf(mass));
            int min = mass.get(0).length();
            String minValue = mass.get(0);
            for (int i = 1; i < mass.size(); i++){
                int n = mass.get(i).length();
                if(n < min){
                    min = n; minValue = mass.get(i);
                }
            }
            int max = mass.get(0).length();
            String maxValue = mass.get(0);
            for (int i = 1; i < mass.size(); i++){
                int m = mass.get(i).length();
                if(m>max){
                    max = m; maxValue = mass.get(i);
                }
            }
            label2.setText("Наибольшее значение: " + maxValue + "\nНаименьшее значение: " + minValue);
        }
        if (choizezadan.getValue() == "12. Удаление элемента списка с данным значением") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
            label1.setText(String.valueOf(mass));
            if(!text.getText().isEmpty()){
                for (int i=0; i<mass.size(); i++){
                    if(Objects.equals(mass.get(i), text.getText())){
                        mass.remove(i);
                        label2.setText("Список после удаления элемента:\n" + mass);
                        break;
                    }
                }
            }
        }
        if (choizezadan.getValue() == "13. Удаление всех элементов списка с данным значением") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "two", "four", "two", "six"));
            label1.setText(String.valueOf(mass));
            while (mass.contains(text.getText())) {
                mass.remove(text.getText());
            }
                label2.setText("Список после удаления элемента:\n" + mass);
        }
        if (choizezadan.getValue() == "14. Изменение всех элементов списка с данным значением на новое") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "two", "four", "two", "six"));
            label1.setText(String.valueOf(mass));
            if(!text.getText().isEmpty()){
                ArrayList<String> p = new ArrayList<>(List.of(text.getText().split(" ")));
                for (int i=0; i<mass.size(); i++){
                    if(Objects.equals(mass.get(i), p.get(0))){
                        mass.set(i, p.get(p.size()-1));
                    }
                }
                label2.setText("Список после изменения элементов:\n" + mass);
            }
        }
        if (choizezadan.getValue() == "15. Определение, является ли список симметричным") {
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            label1.setText(String.valueOf(mass));
            ArrayList<String> p = mass;
            int chet = 0;
            for (int i=0; i<mass.size(); i++){
                if(Objects.equals(mass.get(i), p.get(mass.size() - 1 - i))){
                    chet = chet + 1;}}
            if (chet == mass.size()){label2.setText("Список симметричный");}
            else{label2.setText("Список не симметричный");}
        }
        if (choizezadan.getValue() == "16. Определение, можно ли удалить из списка каких-нибудь два элемента так, чтобы новый список оказался упорядоченным") {
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            label1.setText(String.valueOf(mass));
            if(sort(mass)) {label2.setText("Можно");}
            else {label2.setText("Нельзя");}
        }
        if (choizezadan.getValue() == "17. Определение, сколько различных значений содержится в списке") {
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            label1.setText(String.valueOf(mass));
            ArrayList<String> spisok = new ArrayList<>();
            for (int i=0; i<mass.size(); i++) {
                if (!spisok.contains(mass.get(i))) {
                    spisok.add(mass.get(i));
                }
            }
            label2.setText("Количество различных символов:" + spisok.size());
        }
        if (choizezadan.getValue() == "18. Удаление из списка элементов, значения которых уже встречались в предыдущих элементах") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "two", "four", "two", "six"));
            label1.setText(String.valueOf(mass));
            ArrayList<String> newList= new ArrayList<>();
            for (int i = 0; i < mass.size(); i++) {
                String elem = mass.get(i);
                boolean isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (mass.get(j).equals(elem)) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    newList.add(elem);
                }
            }
            mass.clear();
            mass.addAll(newList);
            label2.setText("Измененный список: " + mass);
        }
        if (choizezadan.getValue() == "19. Изменение порядка элементов на обратный") {
            ArrayList<String> mass = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
            label1.setText(String.valueOf(mass));
            ArrayList<String> p = new ArrayList<>();
            for (int i=0; i<mass.size(); i++){
                p.add(mass.get(mass.size()-1-i));
            }
            mass = p;
            label2.setText("Обратный: " + mass);
        }
        if (choizezadan.getValue() == "20. Сортировка элементов списка двумя способами") {
            ArrayList<String> mass = new ArrayList<>(List.of(text.getText().split(" ")));
            label1.setText(String.valueOf(mass)); String str = "";
            int size = mass.size();
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    int masj = mass.get(j).length();
                    String mjValue = mass.get(j);
                    int masi = mass.get(i).length();
                    String miValue = mass.get(i);
                    if (masj < masi) {
                        mass.set(i, mjValue);
                        mass.set(j, miValue);}}}
            str += "Отсортированный список: " + mass + "\n";

            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    String mjValue = mass.get(j);
                    String miValue = mass.get(i);
                    for (int l = 0; l < 2; l++) {
                        if (mjValue.charAt(l) < miValue.charAt(l)){
                            mass.set(i, mjValue);
                            mass.set(j, miValue);}    
                        else{break;}}}}
            str += "Отсортированный список: " + mass + "\n";
            label2.setText(str);    
        }

        if (choizezadan.getValue() == "1. Двусвязный (двунаправленный) список. Список функций аналогичен предыдущей задаче") {}

        if (choizezadan.getValue() == "2. Дан упорядоченный список книг. Добавить новую книгу, сохранив упорядоченность списка") {
            String book = "Война и мир,Идиот,Отцы и дети,Обломов,Муму,Шинель";
            ArrayList<String> lib = new ArrayList<>(List.of(book.split(",")));
            lib = sort2(lib);
            String str = "";
            for (int i=0; i<lib.size(); i++)
                str = str + lib.get(i) +"\n";
            label1.setText(str);
            if(!text.getText().isEmpty()){
                lib.add(text.getText());
                lib = sort2(lib);
                String str1 = "";
                for (int i=0; i<lib.size(); i++)
                    str1 = str1 + lib.get(i) +"\n";
                label2.setText(str1);
            }
        }

        if (choizezadan.getValue() == "3. Даны два упорядоченных по возрастанию списка. Объедините их в новый упорядоченный по возрастанию список.") {
            ArrayList<Integer> spisok1 = new ArrayList<>(List.of(1,3,5,7,9));
            ArrayList<Integer> spisok2 = new ArrayList<>(List.of(2,4,6,8,10));
            ArrayList<Integer> sovmest = new ArrayList<>();
            
            sovmest.addAll(spisok1);
            sovmest.addAll(spisok2);
            sovmest = sort3(sovmest);
            String str = spisok1 + "\n" + spisok2;
            label1.setText(str);
            label2.setText(String.valueOf(sovmest));
        }

        if (choizezadan.getValue() == "4. Дан список целых чисел. Упорядочьте по возрастанию только: а) положительные числа; б) элементы с четными порядковыми номерами в списке") {
            ArrayList<Integer> spisok1 = new ArrayList<>(List.of(5,2,-1,7,1,4,-6));
            if(text.getText().equals("а")){
                ArrayList<Integer> sovmest = new ArrayList<>();
                for(int i = 0; i<spisok1.size(); i++){
                    if (spisok1.get(i) > 0){
                        sovmest.add(spisok1.get(i));
                    }
                }
                label1.setText(String.valueOf(spisok1));
                label2.setText(String.valueOf(sort3(sovmest)));
            }
            if(text.getText().equals("б")){
                ArrayList<Integer> sovmest = new ArrayList<>();
                for(int i = 0; i<spisok1.size(); i++){
                    if (i % 2 == 0){
                        sovmest.add(spisok1.get(i));
                    }
                }
                label1.setText(String.valueOf(spisok1));
                label2.setText(String.valueOf(sort3(sovmest)));
            }
        }

        if (choizezadan.getValue() == "5. Даны два списка. Определите, совпадают ли множества их элементов") {
            if(text.getText().isEmpty()){
                ArrayList<Integer> spisok1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
                ArrayList<Integer> spisok2 = new ArrayList<>(List.of(5, 1, 4, 3, 2));
                String str = spisok1 + "\n" + spisok2;
                label1.setText(str);
                if (proverka(spisok1, spisok2)) {
                    label2.setText("Содержат");
                }
                else {
                    label2.setText("Не содержат");
                }
            }
            else {
                ArrayList<Integer> spisok1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
                ArrayList<Integer> spisok2 = new ArrayList<>(List.of(5, 1, 5, 4, 3, 2));
                String str = spisok1 + "\n" + spisok2;
                label1.setText(str);
                if (proverka(spisok1, spisok2)) {
                    label2.setText("Содержат");
                }
                else {
                    label2.setText("Не содержат");
                }
            }
        }

        if (choizezadan.getValue() == "6. Дан список. После каждого элемента добавьте предшествующую ему часть списка") {
            ArrayList<Integer> spisok1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
            label1.setText(String.valueOf(spisok1));
            label2.setText(String.valueOf(pred(spisok1)));
        }

        if (choizezadan.getValue() == "7. Пусть элементы списка хранят символы предложения. Замените каждое вхождение слова itmathrepetitor на silence.") {
            String str = "When I was seeking help with studying mathematics, I turned to itmathrepetitor and received excellent tutoring.";
            label1.setText(str);
            ArrayList<String> list= new ArrayList<>(List.of(str.split(" ")));
            list = replaceWords(list, "itmathrepetitor", "silence");
            String str2 = "";
            for (int i=0; i<list.size(); i++){
                str2 = str2 + list.get(i) + " ";
            }
            label2.setText(str2);
        }

        if (choizezadan.getValue() == "8. Дан текстовый файл. Создайте двусвязный список, каждый элемент которого содержит количество символов в соответствующей строке текста") {
            File file = new File("C:\\Users\\Новый пользователь\\Desktop\\Lang-Prog\\Laba4\\laba_4\\src\\main\\resources\\test.txt");
            ArrayList<String> list = new ArrayList<>();
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    list.add(scanner.nextLine());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            ArrayList<ArrayList<String>> two = new ArrayList<>();
            for(int i=0; i<list.size(); i++){
                ArrayList<String> dop = new ArrayList<>();
                dop.add(String.valueOf(list.get(i).length()));
                dop.add(list.get(i));
                two.add(dop);
            }
            label2.setText(String.valueOf(two));
        }

        if (choizezadan.getValue() == "9. Создайте двусвязный список групп факультета. Каждая группа представляет собой односвязный список студентов") {
            ArrayList<ArrayList<String>> spisok = new ArrayList<>();
            String group1 = "Белоусова Анастасия Александровна 2004 2 24 5 4 5 4 5;" +
                    "Богдан Илья Александрович 2004 2 24 4 4 4 4 4;" +
                    "Глушко Дмитрий Дмитревич 2004 2 24 5 5 5 5 5";
            String group2 = "Евтушенко Егор Александрович 2003 2 23 5 4 5 4 5;" +
                    "Иванов Иван Иванович 2005 2 23 4 4 4 4 4;" +
                    "Шишкин Валерий Сергеевич 2004 2 23 5 5 5 4 5";
            String group3 = "Колтокова Вероника Сергеевна 2005 2 22 5 5 5 4 5;" +
                    "Колесников Никита Алексеевич Иванович 2004 2 22 4 3 3 4 4;" +
                    "Тесленко Артем Артемович 2003 2 22 5 3 3 4 5";
            ArrayList<String> gr1 = new ArrayList<>(List.of(group1.split(";")));
            ArrayList<String> gr2 = new ArrayList<>(List.of(group2.split(";")));
            ArrayList<String> gr3 = new ArrayList<>(List.of(group3.split(";")));
            spisok.add(gr1);
            spisok.add(gr2);
            spisok.add(gr3);
            label2.setText(String.valueOf(spisok));
        }

        if (choizezadan.getValue() == "10. Упорядочите студентов по курсу. Найдите средний балл каждой группы по каждому предмету") {
            String group1 =
                    "Богдан Илья Александрович 2004 2 24 4 4 4 4 4;" + 
                    "Белоусова Анастасия Александровна 2004 2 24 5 4 5 4 5;" +
                    "Глушко Дмитрий Дмитриевич 2004 2 24 5 5 5 5 5;" + 
                    "Евтушенко Егор Александрович 2003 3 33 5 4 5 4 5;" +
                    "Иванов Иван Иванович 2005 3 33 4 4 4 4 4;" +
                    "Колесников Никита Алексеевич 2001 4 41 4 3 3 4 4;" +
                    "Тесленко Артем Артемович 2002 4 41 5 3 3 4 5;" +
                    "Шишкин Валерий Сергеевич 2004 3 33 5 5 5 4 5;" + 
                    "Колтокова Вероника Сергеевна 2002 4 41 5 5 5 4 5;";

            ArrayList<String> gr1 = new ArrayList<>(List.of(group1.split(";")));
            ArrayList<String> kyrs = new ArrayList<>();
            ArrayList<Integer> kyrsint = new ArrayList<>();
            ArrayList<String> group = new ArrayList<>();
            ArrayList<Integer> groupint = new ArrayList<>();
            ArrayList<String> age = new ArrayList<>();
            ArrayList<Integer> ageint = new ArrayList<>();
            ArrayList<ArrayList<String>> vse = new ArrayList<>();
            ArrayList<ArrayList<String>> vse1 = new ArrayList<>();
            for (int i = 0; i < gr1.size(); i++) {
                ArrayList<String> dop = new ArrayList<>(List.of(gr1.get(i).split(" ")));
                vse.add(dop);
                if (!kyrs.contains(dop.get(4))) {
                    kyrs.add(dop.get(4));
                    kyrsint.add(Integer.valueOf(dop.get(4)));
                }
                if (!group.contains(dop.get(5))) {
                    group.add(dop.get(5));
                    groupint.add(Integer.valueOf(dop.get(5)));
                }
                if (!age.contains(dop.get(3))) {
                    age.add(dop.get(3));
                    ageint.add(Integer.valueOf(dop.get(3)));
                }
            }
            kyrsint = sort3(kyrsint);
            groupint = sort3(groupint);
            ageint = sort3(ageint);

            for (int k = 0; k < kyrsint.size(); k++) {
                ArrayList<String> namegr = new ArrayList<>();
                for (int i = 0; i < vse.size(); i++) {
                    if (Integer.parseInt(vse.get(i).get(4)) == kyrsint.get(k)) {
                        namegr.add(vse.get(i).get(0));
                    }
                }
                namegr = sort2(namegr);
                for (int i=0; i<namegr.size(); i++){
                    for (int j=0; j<vse.size(); j++){
                        if(namegr.get(i) == vse.get(j).get(0)){
                            vse1.add(vse.get(j));
                        }
                    }
                }
            }
            if(Integer.parseInt(text.getText()) == 1) {
                label1.setText(String.valueOf(vse));
                String str = "";
                str = str + vse1 + "\n";
                label2.setText(str);
            }
            String str1 = "";
            for (int k = 0; k < groupint.size(); k++) {
                ArrayList<Integer> srznah = new ArrayList<>();
                for (int i = 0; i < vse.size(); i++) {
                    for (int l = 6; l < 11; l++) {
                        if (Integer.parseInt(vse.get(i).get(5)) == groupint.get(k)) {
                            srznah.add(Integer.valueOf(vse.get(i).get(l)));
                        }
                    }
                }
                str1 = str1 + srznach(srznah) + "\n";
            }
            if(Integer.parseInt(text.getText()) == 2) {
                label1.setText(String.valueOf(vse));
                label2.setText(str1);
            }
            if(Integer.parseInt(text.getText()) == 3) {
                label1.setText(String.valueOf(vse));
                String str = "Самый старший студент:\n";
                for (int i=0; i<vse1.size(); i++){
                    if(Integer.valueOf(vse1.get(i).get(3)).equals(ageint.get(0))){
                        str = str + vse1.get(i) + "\n";
                        break;
                    }
                }
                str = str + "Самый младший студент:\n";
                for (int i=0; i<vse1.size(); i++){
                    if(Integer.valueOf(vse1.get(i).get(3)).equals(ageint.get(ageint.size()-1))){
                        str = str + vse1.get(i);
                        break;
                    }
                }
                label2.setText(str);
            }
            if(Integer.parseInt(text.getText()) == 4) {
                label1.setText(String.valueOf(vse));
                String str2 = "";
                for (int k = 0; k < kyrsint.size(); k++) {
                    ArrayList<Integer> srznah = new ArrayList<>();
                    ArrayList<Integer> studentIndexes = new ArrayList<>();
                    for (int i = 0; i < vse.size(); i++) {
                        if (Integer.parseInt(vse.get(i).get(4)) == kyrsint.get(k)) {
                            int sum = 0;
                            for (int l = 6; l < 11; l++) {
                                sum += Integer.parseInt(vse.get(i).get(l));
                            }
                            srznah.add(sum);
                            studentIndexes.add(i);
                        }
                    }
                    int maxIndex = 0;
                    for (int i = 1; i < srznah.size(); i++) {
                        if (srznah.get(i) > srznah.get(maxIndex)) {
                            maxIndex = i;
                        }
                    }
                    int originalIndex = studentIndexes.get(maxIndex);
                    str2 = str2 + "Лучший студент для группы " + kyrsint.get(k) + ": " + vse.get(originalIndex) + "\n";
                }
                label2.setText(str2);
            }
        }

    }

    public static boolean sort(ArrayList<String> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                ArrayList<String> temp = new ArrayList<>(nums);
                temp.remove(j);
                temp.remove(i);
                if (isSorted(temp)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSorted(ArrayList<String> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            int n = Integer.parseInt(nums.get(i));
            int m = Integer.parseInt(nums.get(i+1));
            if (n > m) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Float> srznach(ArrayList<Integer> p) {
        int del = p.size()/5;
        ArrayList<Float> otvet = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = i; j < p.size(); j += 5) {
                sum += p.get(j);
            }
            float average = (float) sum / del;
            otvet.add(average);
        }
        return otvet;
    }
    
    public static ArrayList<String> replaceWords(ArrayList<String> words, String poisk, String rep) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(poisk)) {
                words.set(i, rep);
            }
        }
        return words;
    }

    public static List<Integer> pred(List<Integer> list) {
        List<Integer> extendedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            extendedList.add(list.get(i));
            for (int j = 0; j < i; j++) {
                extendedList.add(list.get(j));
            }
        }
        return extendedList;
    }
    
    public static boolean proverka(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            Integer element = list1.get(i);
            if (!list2.contains(element)) {
                return false;
            }
        }

        return true;
    }

    public static ArrayList<Integer> sort3(ArrayList<Integer> p) {
        ArrayList<Integer> sort = new ArrayList<>(p.size());
        for (int i = 0; i < p.size(); i++) {
            sort.add(0);
        }
        for (int i = 0; i < p.size(); i++) {
            int current = p.get(i);
            int j = i - 1;
            while (j >= 0 && sort.get(j) > current) {
                sort.set(j + 1, sort.get(j));
                j--;
            }
            sort.set(j + 1, current);
        }
        return sort;
    }

    public static ArrayList<String> sort2(ArrayList<String> p){
        for (int i = 0; i < p.size() - 1; i++) {
            for (int j = 0; j < p.size() - 1 - i; j++) {
                int minLength = Math.min(p.get(j).length(), p.get(j+1).length());
                int k = 0;
                while (k < minLength && p.get(j).charAt(k) == p.get(j+1).charAt(k)) {
                    k++;
                }
                if (k < minLength) {
                    if (p.get(j).charAt(k) > p.get(j+1).charAt(k)) {
                        String temp = p.get(j);
                        p.set(j, p.get(j + 1));
                        p.set(j + 1, temp);
                    }
                } else if (p.get(j).length() > p.get(j+1).length()) {
                    String temp = p.get(j);
                    p.set(j, p.get(j + 1));
                    p.set(j + 1, temp);
                }
            }
        }
        return p;
    }

    @FXML
    void initialize() {
        choizepart.getItems().addAll(1,2);
        choizepart.setOnAction(actionEvent -> {
            if (choizepart.getValue() == 1) {
                choizezadan.getItems().clear();
                choizezadan.getItems().addAll(
                    "1. Инициализация списка",
                    "2. Добавление элемента в начало списка",
                    "3. Добавление элемента в конец списка",
                    "4. Показ всех элементов списка",
                    "5. Удаление всех элементов списка",
                    "6. Определение количества элементов списка",
                    "7. Проверка списка на пустоту",
                    "8. Удаление первого элемента",
                    "9. Удаление последнего элемента",
                    "10. Поиск данного значения в списке",
                    "11. Поиск наибольшего и наименьшего значений в списке",
                    "12. Удаление элемента списка с данным значением",
                    "13. Удаление всех элементов списка с данным значением",
                    "14. Изменение всех элементов списка с данным значением на новое",
                    "15. Определение, является ли список симметричным",
                    "16. Определение, можно ли удалить из списка каких-нибудь два элемента так, чтобы новый список оказался упорядоченным",
                    "17. Определение, сколько различных значений содержится в списке",
                    "18. Удаление из списка элементов, значения которых уже встречались в предыдущих элементах",
                    "19. Изменение порядка элементов на обратный",
                    "20. Сортировка элементов списка двумя способами");} 
            else {
                choizezadan.getItems().clear();
                choizezadan.getItems().addAll(
                    "1. Двусвязный (двунаправленный) список. Список функций аналогичен предыдущей задаче",
                    "2. Дан упорядоченный список книг. Добавить новую книгу, сохранив упорядоченность списка",
                    "3. Даны два упорядоченных по возрастанию списка. Объедините их в новый упорядоченный по возрастанию список.",
                    "4. Дан список целых чисел. Упорядочьте по возрастанию только: а) положительные числа; б) элементы с четными порядковыми номерами в списке",
                    "5. Даны два списка. Определите, совпадают ли множества их элементов",
                    "6. Дан список. После каждого элемента добавьте предшествующую ему часть списка",
                    "7. Пусть элементы списка хранят символы предложения. Замените каждое вхождение слова itmathrepetitor на silence.",
                    "8. Дан текстовый файл. Создайте двусвязный список, каждый элемент которого содержит количество символов в соответствующей строке текста",
                    "9. Создайте двусвязный список групп факультета. Каждая группа представляет собой односвязный список студентов",
                    "10. Упорядочите студентов по курсу. Найдите средний балл каждой группы по каждому предмету");}
            });
        
        
    }

}
