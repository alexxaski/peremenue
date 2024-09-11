public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир!");

        char neZnau = 569 ;
        int a = -159;
        byte b = 67;
        short c = 27897 ;
        long d = 987678965549L ;
        float e = 27.12f ;
        double camelCase = 2.786 ;
        System.out.println(neZnau);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(camelCase);

        byte teacherLP = 23 ;
        byte teacherAC = 27 ;
        byte teacherEA = 30 ;
        short sheets = 480 ;
        int gotIt =  (sheets/(teacherLP + teacherAC + teacherEA));
        System.out.println("На каждого ученика рассчитано "+gotIt+" листов бумаги");

        byte performanceOfTheBottleMakingMachineTranslation = 16;
        int bottleMachine = (byte) (performanceOfTheBottleMakingMachineTranslation/2);
        int in20minutes =  20 * bottleMachine;
        int perDay =  24 * 60 * bottleMachine;
        int in3days =  3 * perDay;
        int for1month = 10 * in3days;
        System.out.println ("За "+20+" минут машина произвела "+in20minutes+" штук бутылок") ;
        System.out.println ("За сутки машина произвела "+perDay+" штук бутылок") ;
        System.out.println ("За "+3+" дня машина произвела "+in3days+" штук бутылок") ;
        System.out.println ("За месяц машина произвела "+for1month+" штук бутылок") ;

        byte pot = 120;
        byte forOneClass = 6;
        byte totalClasses = (byte) (pot/forOneClass);
        byte brown = (byte) (4 * totalClasses);
        byte white = (byte) (2 * totalClasses);
        System.out.println ("В школе, где " +totalClasses+ " классов, нужно " +white+ " банок белой краски и " +brown+ " банок коричневой краски") ;

        byte banana = 80 ;
        byte milk = 105 ;
        byte iceCreamSundae =100 ;
        byte egg = 70 ;
        int recipe = banana * 5 + milk * 2 + iceCreamSundae * 2 + egg * 4 ;
        float recipeInKilograms = recipe / 1000f ;
        System.out.println ("спортзавтрак " +recipe+ " грамм" ) ;
        System.out.println ("спортзавтрак " +recipeInKilograms+ " килограмм") ;

        int needToReset = 7000;
        int planA =  250;
        int planB = 500 ;
        System.out.println ("Для результата нужно " +needToReset/planA+ " дней") ;
        System.out.println ("Для результата нужно " +needToReset/planB+ " дней") ;

        int masha = 67760 ;
        int denis = 83690 ;
        int kristina = 76230 ;
        int raisingMasha = (int) (masha * 0.1 + masha);
        int raisingDenis = (int) (denis * 0.1 + denis);
        int raisingKristina = (int) (kristina * 0.1 + kristina);
        int annualIncomeMasha = (raisingMasha - masha) * 12 ;
        int annualIncomeDenis = (raisingDenis - denis) * 12 ;
        int annualIncomeKristina = (raisingKristina - kristina) * 12 ;
        System.out.println ("Маша теперь получает " + raisingMasha + " рублей. Годовой доход вырос на " + annualIncomeMasha + " рублей") ;
        System.out.println ("Денис теперь получает " + raisingDenis + " рублей. Годовой доход вырос на " + annualIncomeDenis + " рублей") ;
        System.out.println ("Кристина теперь получает " + raisingKristina + " рублей. Годовой доход вырос на " + annualIncomeKristina + " рублей") ;

        /* вроде все сделал
        исправил , была еще ошибка в выводе в последнем задании
        везде писало маша.

         */
    }
}