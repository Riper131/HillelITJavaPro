public class Dog extends Animals {
    static int count = 0;

    Dog() {
        count++;
    }


    public void run(int distance) {
        a = distance;
        super.run(a,500, "Собака");
    }

    public void swim(int distance) {
        a = distance;
        super.swim(a,10,"Собака");
    }

    public static void getDogCount() {
        System.out.printf("Создано %s собак\n", count);
    }
}
