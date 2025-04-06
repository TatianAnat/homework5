public class Main {
    public static void main(String[] args) {
        //task1
        int variable1 = 42500;
        System.out.println("Значение переменной variable1 с типом int равно " + variable1);
        byte variable2 = 56;
        System.out.println("Значение переменной variable2 с типом byte равно " + variable2);
        short variable3 = 28340;
        System.out.println("Значение переменной variable3 с типом short равно " + variable3);
        long variable4 = 247483649L;
        System.out.println("Значение переменной variable4 с типом long равно " + variable4);
        float variable5 = 247.45f;
        System.out.println("Значение переменной variable5 с типом float равно " + variable5);
        double variable6 = 247.45f;
        System.out.println("Значение переменной variable6 с типом double равно " + variable6);

        //task2
        float numberValue1 = 27.12f;
        System.out.println(numberValue1);
        long numberValue2 = 987678965549L;
        System.out.println(numberValue2);
        double numberValue3 = 2.786;
        System.out.println(numberValue3);
        short numberValue4 = 569;
        System.out.println(numberValue4);
        short numberValue5 = -159;
        System.out.println(numberValue5);
        short numberValue6 = 27897;
        System.out.println(numberValue6);
        byte numberValue7 = 67;
        System.out.println(numberValue7);

        //task3
        byte lydmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalSheets = 480;
        //логичнее взять тип float, т.к. при делении может быть дробное число
        float sheetsOfPaper = totalSheets / (float)(lydmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaper + " листов бумаги");

        //task4
        byte minutes = 2;
        byte bottle = 16;
        //рассчитаем сколько за 1 минуту будет изготовлено бутылок
        float oneminut = bottle / (float)minutes;
        byte twentyMinutes = 20;
        float twentyMinutesBottle = twentyMinutes * oneminut;
        System.out.println("За " + twentyMinutes + " минут машина произвела " + twentyMinutesBottle + " штук бутылок");
        int day = 24 * 60;
        float dayBottle = day * oneminut;
        System.out.println("За " + day + " минут(сутки) машина произвела " + dayBottle + " штук бутылок");
        int threeDays = 3 * day;
        float threeDaysBottle = threeDays * oneminut;
        System.out.println("За " + threeDays + " минут(3 дня) машина произвела " + threeDaysBottle + " штук бутылок");
        int month = 30 * day;
        float monthBottle = month * oneminut;
        System.out.println("За " + month+ " минут(1 месяц) машина произвела " + monthBottle + " штук бутылок");

        //task5

        byte totalCansOfPaint = 120;
        //на один класс кол-во банок каждой краски
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalCansClass = whitePaint + brownPaint;
        float totalNumberOfOffices = totalCansOfPaint / (float) totalCansClass;
        float allWhitePaint =  totalNumberOfOffices * whitePaint;
        float allBrownPaint = totalNumberOfOffices * brownPaint;
        System.out.println("В школе, где " + totalNumberOfOffices + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски" );

        //task6
        int banana = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int egg = 4 * 70;
        int sportsBreakfastInGrams = banana + milk + iceCream + egg;
        System.out.println("Вес спорт завтрака равен " + sportsBreakfastInGrams + " грамм ");
        float sportsBreakfastInKilograms = sportsBreakfastInGrams / 1000f;
        System.out.println("Вес спорт завтрака равен " + sportsBreakfastInKilograms + " килограмм ");

        //task7
        short inOneKilogram = 1000;
        short dropWeightKilograms = 7;
        int kilogramsToGrams = dropWeightKilograms * inOneKilogram;
        System.out.println("Спортсмену нужно скинуть " + dropWeightKilograms +  " килограмм. Или  " + kilogramsToGrams + " грамм");
        short firstWay = 250;
        short secondWay = 500;
        float numberOfDaysForTheFirstMethod = kilogramsToGrams / (float)firstWay;
        System.out.println("Если спортсмен будет скидывать по " + firstWay +  " грамм в день , то ему потребуется " + numberOfDaysForTheFirstMethod + " день (дней), чтобы добиться результата похудения");
        float numberOfDaysForTheSecondMethod = kilogramsToGrams / (float)secondWay;
        System.out.println("Если спортсмен будет скидывать по " + secondWay +  " грамм в день , то ему потребуется " + numberOfDaysForTheSecondMethod + " день (дней), чтобы добиться результата похудения");
        float averageNumberOfDays = (numberOfDaysForTheFirstMethod + numberOfDaysForTheSecondMethod) / 2;
        System.out.println("Спортсмену потребуется " + averageNumberOfDays + " день (дней) в среднем, чтобы добиться результата похудения. ");

        //task8
        int masha = 67760;
        int denis = 83690;
        int christina = 76230;
        byte year = 12;
        int mashaPreviousIncomeYear = masha * year;
        int denisPreviousIncomeYear = denis * year;
        int christinaPreviousIncomeYear = christina * year;
        float promotion = 0.1f;
        float mashaNew = (masha * promotion)  + masha;
        float denisNew = (denis * promotion) + denis;
        float christinaNew = (christina * promotion) + christina;
        float mashaNewSalaryYear = mashaNew * year;
        float mashaIncomeIncreased = mashaNewSalaryYear - mashaPreviousIncomeYear;
        System.out.println("Маша теперь получает " + mashaNewSalaryYear + " рублей. Годовой доход вырос на " + mashaIncomeIncreased + " рублей.");
        float denisNewSalaryYear = denisNew * year;
        float denisIncomeIncreased = denisNewSalaryYear - denisPreviousIncomeYear;
        System.out.println("Денис теперь получает " + denisNewSalaryYear + " рублей. Годовой доход вырос на " + denisIncomeIncreased + " рублей.");
        float christinaNewSalaryYear = christinaNew * year;
        float christinaIncomeIncreased = christinaNewSalaryYear - christinaPreviousIncomeYear;
        System.out.println("Кристина теперь получает " + christinaNewSalaryYear + " рублей. Годовой доход вырос на " + christinaIncomeIncreased + " рублей.");







    }
}