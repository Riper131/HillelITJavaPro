public class Cat extends Animals{
    static int count;

    Cat() {
        count++;
    }

    public static void getCatCount() {
        System.out.printf("Создано %s котов\n", count);
    }

    public void run(int distance) {
        a = distance;
        super.run(a,200, "Кошка");
    }

    public void swim(int distance) {
        a = distance;
        super.swim(a,0,"Кошка");
    }

}
