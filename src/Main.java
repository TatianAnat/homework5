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
        int sheetsOfPaper = totalSheets / (lydmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaper + " листов бумаги");

    }
}