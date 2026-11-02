public class BmiService {
    public int calculate(double heightInMeters, int weightInKg) {
        // Считаем индекс массы тела
        double index = weightInKg / (heightInMeters * heightInMeters);

        // Приводим дробное число к целому (дробная часть отбрасывается)
        return (int) index;
    }
}