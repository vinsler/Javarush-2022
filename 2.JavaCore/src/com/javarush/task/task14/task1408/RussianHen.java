package com.javarush.task.task14.task1408;

public  class RussianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 1;
        }

        @Override
        String getDescription() {
            return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        }

//        <getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
//        где Sssss - название страны
//        где N - количество яиц в месяц


}
