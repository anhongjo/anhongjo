package hello;

public class Worker extends Thread {
    protected String job;

    public Worker(String name, String job) {
        super(name);
        this.job = job;
    }
    public void run() {
        System.out.println(getName() + "�� " + job + "�� ������ �մϴ�");
    }

}