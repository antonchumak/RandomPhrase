package com.company;

public class Main {

    public static void main(String[] args) {
	String [] wordListOne = {"привет", "мало","крепкий" , "мелкий" ,"мобильный"};
	String [] wordListTwo = { "Играет ", "Майнкрафт","жизнь","работа","Программист"};
	String [] wordListThree = {"Мучать","любить","надоедать","машина","стол","зарплата"};

	//Вычисляем сколько слов в каждом столбике
        int oneLenght = wordListOne.length;//нашли число слов 1 столбика
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        //Генерируем 3 случайных числа
        int rand1 = (int)(Math.random()*oneLenght);
        int rand2 = (int)(Math.random()*twoLenght);
        int rand3 = (int)(Math.random()*threeLenght);

        //Выводи фразу
        String phrase = wordListOne[rand1]+ " " + wordListTwo[rand2]+ " " + wordListThree[rand3];

        System.out.println("Все , что нам нужно это - "+ phrase);
    }
}
