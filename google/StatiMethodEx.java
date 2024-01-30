package google;
public class StatiMethodEx {
    int income = 1000;
    static int income2 = 2000;
    static void methodData()
    {
        StatiMethodEx o1 = new StatiMethodEx();
        System.out.println(o1.income); //can not access non static methods directly
        System.out.println(income2);
    }
    public static void main(String[] args) {
        StatiMethodEx.methodData();//Class Member
        methodData(); //direct
        StatiMethodEx obj = new StatiMethodEx();
        obj.methodData();//can be access using object too
    }
}
