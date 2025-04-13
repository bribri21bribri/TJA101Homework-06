package homework_ext.task1;

public class TestPen {
    public static void main(String[] args) {
        Pencil pencil = new Pencil("Mitsubishi", 40);
        InkBrush inkBrush = new InkBrush("Pilot", 80);

        pencil.write();
        System.out.println(pencil.getPrice());

        inkBrush.write();
        System.out.println(inkBrush.getPrice());
    }
}
