import com.exadel.lab.ExtraTrial;
import com.exadel.lab.LightTrial;
import com.exadel.lab.StrongTrial;
import com.exadel.lab.Trial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
         * Создание списка людей, которые подвергнутся испытанию (11 объектов)
         */
        Trial [] listTrial = {
                new Trial("Alex",80,90),
                new Trial("Bert",35,70),
                new Trial("Conrad",45,100),
                new Trial("Derek",20,50),
                new Trial("Mod",70,100),
                new LightTrial("Elisa",25,40),
                new LightTrial("Bob",65,80),
                new StrongTrial("Brandon",70,80),
                new StrongTrial("Arnold",90,100),
                new ExtraTrial("Sam",60,90,50),
                new ExtraTrial("Donald",70,90,30)
        };
        /*
         * Вывод списка на консоль
         */
        System.out.println("Print the array content to the console (one element per line)");
        for (Trial someTrial : listTrial){
            System.out.println(someTrial);
        }
        /*
         * Сортировка по суммарной оценке и ывод на консоль
         */
        System.out.println("");
        System.out.println("Sort trials by the account and the sum of first and second marks");
        Arrays.sort(listTrial);
        for (Trial someTrial : listTrial){
            System.out.println(someTrial);
        }
        /*
         * Проверка принадлежности объектов к конкретному классу
         */
        System.out.println("");
        System.out.println("Print superclass trials for account equaled to a command line " +
                "argument ");
        for (Trial someTrial : listTrial){
            if (someTrial.getCandidateName().equals(args[0]))
                if (!(someTrial instanceof LightTrial) && !(someTrial instanceof StrongTrial)
                        && !(someTrial instanceof ExtraTrial))
                    System.out.println(someTrial);
        }
        System.out.println("");
        System.out.println("Clear all marks for failed trials ");
        for (Trial someTrial : listTrial){
            if (!someTrial.isPassed())
                someTrial.clearMarks();
            System.out.println(someTrial);
        }


    }
}
