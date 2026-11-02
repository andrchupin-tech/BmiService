public class Main {
    public static void main(String[] args) {
        // Создаем объект сервиса
        BmiService service = new BmiService();

        // Задаем входные данные
        double heightInMeters = 1.87;
        int weightInKg = 98;

        // Вызываем метод и сохраняем результат
        int bmi = service.calculate(heightInMeters, weightInKg);

        // Печатаем результат в консоль
        System.out.println("Ваш ИМТ: " + bmi);
    }
}