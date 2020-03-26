public class Main {
    public static void main(String[] args) {

        int miles = BonusMilesService.calculate(10000);
        System.out.println(miles);

        int miles1 = BonusMilesService.calculate(1000);
        System.out.println(miles1);

        int miles2 = BonusMilesService.calculate(200);
        System.out.println(miles2);
    }
}