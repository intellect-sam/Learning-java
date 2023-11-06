public class JavaRegEx extends Thread {
    public static void main(String[] args) {
        JavaRegEx thread = new JavaRegEx();
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}
