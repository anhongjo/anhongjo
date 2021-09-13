package hello;

public class Worker extends Thread {
    protected String job;

    public Worker(String name, String job) {
        super(name);
        this.job = job;
    }
    public void run() {
        System.out.println(getName() + "는 " + job + "를 열심히 합니다");
    }

}