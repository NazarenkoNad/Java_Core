package homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HomeWork4 {

    public static void main(String[] args) {
    System.out.println("Считаем, сколько раз встречается каждое слово:");
    countArray();

    System.out.println("Телефонная книга. Добавляем и ищем по фамилии:");
    Phonebook phonebook = new Phonebook();

        phonebook.putInfo("Сидоров", "77089106566");
        phonebook.putInfo("Петров", "77025648999");
        phonebook.putInfo("Васечкин", "77089451458");
        phonebook.putInfo("Попов", "8708456456");
        phonebook.putInfo("Курочкин", "870999999");
        phonebook.putInfo("Попов", "87084564444444");


        phonebook.getInfo("Сидоров");
        phonebook.getInfo("Попов");
}
    private static void countArray() {
        ArrayList<String> array = new ArrayList<>();
        array.add("печенье");
        array.add("сахар");
        array.add("погода");
        array.add("погода");
        array.add("сахар");
        array.add("сахар");
        array.add("печенье");
        array.add("кот");
        array.add("собака");
        array.add("печенье");
        array.add("котик");
        array.add("сахар");
        array.add("печенье");


        HashSet<String> arrayUnique = new HashSet<>(array);
        ArrayList<String> arrayCount = new ArrayList<>(arrayUnique);

        for (int i = 0; i < arrayUnique.size(); i++) {
            System.out.println("Количество " + arrayCount.get(i) + ": " + Collections.frequency(array, arrayCount.get(i)));
        }
        System.out.println("\n");
    }

}
