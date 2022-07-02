public class Converter {

    public void Converter(double maxStep) {
        double km = maxStep * 0.00075;
        System.out.println("Пройденная дистанция (в км): " + km);
    }

    public void calories(double maxStep) {
        double calories = maxStep * 0.05;
        System.out.println("Количество сожжённых килокалорий: " + calories);
    }

}