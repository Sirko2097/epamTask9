package task1;

public class MainT1 {
    public static void main(String[] args) {
        new Thread(() -> {
            int i = 10;
            while (i > 0) {
                System.out.println(i--);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println("Bomb!");
        }).start();
    }

}
