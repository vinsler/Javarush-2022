package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (args[0]) {
            // 3. При параметре -с программа должна добавлять всех людей с заданными параметрами в конец списка allPeople, и выводить id каждого (index) на экран.
            // -c Alesha м 03/03/1933 Vera ж 03/03/3993 asdf ж 05/05/5002
            // нет проверки на ошибку не правильного ввода кол-ва компонент
            case "-c": {
                synchronized (allPeople) {
                    for (int cx = 1; cx < args.length; cx += 3) {
                        if (args[cx + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[cx], sdf.parse(args[cx + 2])));
                        }
                        if (args[cx + 1].equals("ж")) {
                            allPeople.add(Person.createFemale(args[cx], sdf.parse(args[cx + 2])));
                        }
                        System.out.println(allPeople.size() - 1); // id - index
                    }
                    break;
                }
            }
            //4. При параметре -u программа должна обновлять данные людей с заданными id в списке allPeople.
            // -u 0 Калиман ж 01/01/1001 1 Перепелка м 02/02/2002
            case "-u": {
                synchronized (allPeople) {
                    for (int cx = 1; cx < args.length; cx += 4) {
                        int id = Integer.parseInt(args[cx]);
                        allPeople.get(id).setName(args[cx + 1]);
                        allPeople.get(id).setBirthDate(sdf.parse(args[cx + 3]));
                        if (args[cx + 2].equals("м")) {
                            allPeople.get(id).setSex(Sex.MALE);
                        }
                        if (args[cx + 2].equals("ж")) {
                            allPeople.get(id).setSex(Sex.FEMALE);
                        }
                    }
                    break;
                }
            }
            // -d id1 id2 id3 id4 ... -d 0 1
            case "-d": {
                synchronized (allPeople) {
                    for (int cx = 1; cx < args.length; cx++) {
                        int id = Integer.parseInt(args[cx]);
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDate(null);
                    }
                    break;
                }
            }
            // -i id1 id2 id3 id4 ... -i 0 1
            case "-i": {
                synchronized (allPeople) {
                    SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                    String sex = null;
                    for (int cx = 1; cx < args.length; cx++) {
                        int id = Integer.parseInt(args[cx]);
                        if (allPeople.get(id).getSex().equals(Sex.MALE)) {
                            sex = "м";
                        }
                        if (allPeople.get(id).getSex().equals(Sex.FEMALE)) {
                            sex = "ж";
                        }
                        System.out.println(allPeople.get(id).getName() + " " +
                                sex + " " +
                                sdf1.format(allPeople.get(id).getBirthDate())
                        );
                    }
                    break;
                }
            }
        }
    }
}
