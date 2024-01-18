package google;

public class UnboxingWarpper {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        int i = i1.intValue();
        Integer i2 = Integer.valueOf(i);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }
}
