public class Animals {
    public int a;
    public int maxDistance;

    public void run(int distance, int _maxDistance, String type) {
        a = distance;
        maxDistance = _maxDistance;
        if (a <= maxDistance) {
            System.out.printf("%s пробежала %s м.\n",type, a);
        } else {
            System.out.printf("Ошибка! %s не сможет столько пробежать!\n", type);
        }
    }

    public void swim(int distance,int _maxDistance, String type) {
        maxDistance = _maxDistance;
        a = distance;
        if (a <= maxDistance) {
            System.out.printf("%s проплыла %s метров\n", type, a);
        } else {
            System.out.printf("Ошибка! %s не сможет столько проплыть!\n", type);
        }
    }

    public static void getAnimalCount() {
       int animalCount = Dog.count + Cat.count;
        System.out.printf("Создано %s животных\n", animalCount);
    }
}
