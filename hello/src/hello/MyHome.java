package hello;

public class MyHome {
    protected int money;
    protected Worker ma, dol;
    public MyHome() {
        money = 500;
        ma = new Worker("마당쇠", "마당쓸기");
        dol = new Worker("돌쇠", "장작패기");
    }

    public void let() {
        System.out.print("안녕하세요. ");
        System.out.println("저는 주인입니다.");
        ma.start();
        dol.start();
    }

    public static void main(String args[]) {
        MyHome home = new MyHome();
        home.let();
    }

}
