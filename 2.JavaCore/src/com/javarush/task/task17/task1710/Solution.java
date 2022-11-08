package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String stringSex = null;
        switch (args[0]){
            case "-c": {
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
                }
                if (args[2].equals("ж")){
                    allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
                }
                System.out.println(allPeople.size() - 1);
                break;
            }
            case "-r": {
                if (allPeople.get(Integer.parseInt(args[1])).getSex() == Sex.MALE) {
                    stringSex = "м";
                }
                if (allPeople.get(Integer.parseInt(args[1])).getSex() == Sex.FEMALE) {
                    stringSex = "ж";
                }
                String stringDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[1])).getBirthDate());
                System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() + " " + stringSex + " " + stringDate);
                break;
            }
            case "-u": {
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                if (args[3].equals("м")){
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
                }
                if (args[3].equals("ж")){
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                }
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]));
                break;
            }
            case "-d": {
                allPeople.get(Integer.parseInt(args[1])).setName(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                break;
            }
        }
    }
}
