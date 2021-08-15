package Practice6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** ЗАДАНИЕ
 * 1) Прочитать слова из файла.
 * 2) Отсортировать в алфавитном порядке.
 * 3) Посчитать сколько раз каждое слово встречается в файле.
 * 4) Вывести статистику на консоль
 * 5) Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */
public class MainProgram {
    public static void main(String[] args) throws IOException {
        String fileName;
        String maxKey;

        /* указываем путь к  файлу с набором слов, написанных через пробел  */

        fileName = "src\\main\\java\\Practice6\\SomeText.txt";
        List<String> list1 = new ArrayList<>();

        /*----------Считываем слова с файля, записываем в список----------*/

        list1 = ReaderWord.addSplitWords(fileName);

        /*-----------Вызываем процесс сортировки списка-------------------*/

        SortWord.toSort(list1);
        System.out.println("\n----Выводим статистику по словам на консоль----------------\n");
        Map<String, Integer> map1 = StatisticWord.statCompareWords(list1);
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println("Слово '" + entry.getKey() + "' встречается '" + entry.getValue() + "' раз(а)");
        }
        System.out.println("\n---Находим слово с максимальным количеством повторений и выводим на консоль-----\n");
        maxKey = MaxWord.maxCountKey(map1);
        System.out.println("Слово с Максимальным количеством повторение - это '" +maxKey+ "'. Встречается в файле '" + map1.get(maxKey) + "' раз(а)");

    }
}
