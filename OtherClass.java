public class OtherClass {
    private double weight;
    private double height;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateBMI() {
        double bmi = weight / (height * height);
        System.out.println("bmi：" + bmi);
        if (bmi < 18.5) System.out.println("thin");
        else if (bmi >= 18.5 && bmi < 23.9) {
            System.out.println("common");
        } else System.out.println("fat");
    }
}

