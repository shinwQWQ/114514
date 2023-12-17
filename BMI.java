import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write down your name: ");
        String name = scanner.nextLine();
        System.out.print("Please tell US your weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Please tell US your height: ");
        double height = scanner.nextDouble();
        System.out.println("name：" + name);
        OtherClass other = new OtherClass();
        other.setWeight(weight);
        other.setHeight(height);
        other.calculateBMI();
    }
}
