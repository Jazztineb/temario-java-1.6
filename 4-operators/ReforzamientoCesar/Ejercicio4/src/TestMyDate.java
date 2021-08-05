public class TestMyDate {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(2,8,2019);
        MyDate m2 = new MyDate(2,8,2019);
        MyDate m3 = null;

        if (m1==m2){
            System.out.println("m1 == m2");
        } else {
            System.out.println("m1 != m2");
        }

        if (m1.equals(m2)){
            System.out.println("m1 es igual a m2");
        } else {
            System.out.println("m1 no es igual a m2");
        }

        //Comparación con m3
        if (m1.equals(m3) || m2.equals(m3)){
            //m3.equals(m2) || m2.equals(m1) || m3.equals(m1) no sirve con null

            /*
            (!a.equals(b) &&
            (c == null || (!c.equals(a) && !c.equals(b))));
             */
            System.out.println("m3 es igual a m1 y m2");
        } else {
            System.out.println("m3 es diferente a m1 o m2");
        }
    }
}
