/*
1. В папке resources находится файл dushi.txt. Этот файл содержит в себе полный текст произведения
“Мертвые души” Н. В. Гоголя. Вам необходимо прочитать этот файл и, используя структуру данных HashMap,
подсчитать, сколько раз в этом произведении было использовано каждое слово. После того, как подсчет
будет произведен, вам необходимо вывести в консоль 100 самых часто используемых слов. Изучите вывод и
посмотрите, сколько раз в произведении было использовано слово “Чичиков” (фамилия главного героя).
Это число выпишите в коде в виде комментария (например: // Чичиков - 120).
Для того, чтобы класс Scanner считывал слова, разделяя текст по знакам препинания, используйте следующий код:

Scanner scanner = new Scanner(text); // в text находится файл dushi.txt
scanner.useDelimiter("[.,:;()?!\"\\s–]+");

*/
package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String separator = File.separator;
        String filePath = "src" + separator + "main" + separator + "resources" + separator + "dushi.txt";

        Map<String, Integer> wordsCollection = new HashMap<>();

        textFileToMap(filePath, wordsCollection);
        getFrequentWords100(wordsCollection);
        // Чичиков - 601

    }

    public static void textFileToMap(String filePath, Map<String, Integer> words) {

        try (Scanner scanner1 = new Scanner(new File(filePath))) {
            scanner1.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scanner1.hasNext()) {

                String singleWord = scanner1.next();
                Integer counter = words.get(singleWord);

                if (counter != null)
                    counter++;
                else
                    counter = 1;

                words.put(singleWord, counter);
            }
        } catch (
                FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    static int getTheMostUsedWord(Map<String, Integer> words) {
        int max = 0;

        for (Map.Entry<String, Integer> word : words.entrySet()) {
            if (word.getValue() > max)
                max = word.getValue();
        }
        return max;
    }

    public static void getFrequentWords100(Map<String, Integer> words) {

        int max = getTheMostUsedWord(words);
        int whileCounter = 100;

        while (whileCounter != 0) {
            for (Map.Entry<String, Integer> word : words.entrySet()) {
                if (word.getValue() == max) {
                    System.out.println(word.getKey() + " - " + word.getValue());
                    whileCounter--;
                }
            }
            max--;
        }
    }
}




