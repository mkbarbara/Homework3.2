public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 53;
        int height = 168;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}