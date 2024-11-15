public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int total =0;
        int month =0;
        int deposit =15000;
        while ( total < 2459000 ){
            total=total+deposit;
            month++;
            System.out.println("Месяц "+month+", сумма накоплений равна "+total+" рублей.");
        }
        System.out.println("Задача 2");
        int i=0;
        while (i<10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for (i=10;i>0;i--){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        for (i=1;i<=10;i++){
            int birthRate = population*17/1000;
            int mortality = population*8/1000;
            population=population-mortality+birthRate;
            System.out.println("Год "+i+" численность населения составляет "+population);
        }
        System.out.println("Задача 4");
        int contribution = 15_000;
        int Month=0;
        int general=0;
        while (general<=12_000_000){
            int percent = general*7/100;
            general=general+contribution+percent;
            Month++;
            System.out.println("Месяц "+Month+ " сумма накоплений "+ general);
        }
        System.out.println("Задача 5");
        contribution=15_000;
        Month=0;
        general=0;
        while (general<=12_000_000) {
            int percent = general * 7 / 100;
            general = general + contribution + percent;
            Month++;
            if (Month % 6 == 0) {
                System.out.println("Месяц " + Month + " сумма накоплений " + general);
            }
        }
        System.out.println("Задача 6");
        contribution=15_000;
        Month=0;
        general=0;
        while (Month<=108){
            int percent = general*7/100;
            general=general+contribution+percent;
            Month++;
            if (Month%6==0){
                System.out.println("Месяц "+Month+ " сумма накоплений "+ general);
            }
        }
        System.out.println("Задача 7");
        int friday=5;
        while (friday<=31){
            System.out.println("Сегодня пятница, "+friday+"-число. Необходимо подготовить отчет.");
            friday+=7;
        }
        System.out.println("Задача 8");
       int year=0;
        int lastYear= 2024-200;
        int nextYear= 2024+100;
        for (year=lastYear;year<nextYear;year++){
            if (year%79==0) {
                System.out.println(year);
            }
        }

    }
}