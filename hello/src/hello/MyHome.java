package hello;

public class MyHome {
    protected int money;
    protected Worker ma, dol;
    public MyHome() {
        money = 500;
        ma = new Worker("�����", "���羵��");
        dol = new Worker("����", "�����б�");
    }

    public void let() {
        System.out.print("�ȳ��ϼ���. ");
        System.out.println("���� �����Դϴ�.");
        ma.start();
        dol.start();
    }

    public static void main(String args[]) {
        MyHome home = new MyHome();
        home.let();
    }

}
