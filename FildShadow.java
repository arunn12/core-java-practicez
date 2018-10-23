package fildshadow;

public class FildShadow {

    protected int i = 20;

    public static void main(String ags[]) {
        FildShadow fs = new FildShadow();
        In sf = new In();
        sf.display();
    }

}

class In extends FildShadow {

    private int j = 10;
    private int i = 30;

    public void display() {
        int k = i + j;
        System.out.println(+k);
    }
}
