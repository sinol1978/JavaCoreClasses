package classes0324.lesson10enum;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        printSeazon(season);

        printAllSeasons(season);

        Season anotherSeason = Season.valueOf("WINTER");
        System.out.println(anotherSeason + " " + anotherSeason.getAvgTemp());

    }

    private static void printAllSeasons(Season season) {
        Season[] seasons = season.values();
        for(Season item : seasons){
            System.out.println(item + "\t" + item.getAvgTemp() + "\t" + item.getDescr());
        }
    }

    private static void printSeazon(Season seazon){
        switch (seazon){
            case WINTER:
                System.out.println("I like Winter!");
                break;
            case SPRING:
                System.out.println("I like Spring!");
                break;
            case SUMMER:
                System.out.println("I like Summer!");
                break;
            case FALL:
                System.out.println("I like Fall!");
                break;
        }
    }
}
