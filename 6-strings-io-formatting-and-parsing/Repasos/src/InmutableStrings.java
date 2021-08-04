/*
    String pool = Colección de referencias de objectos strings.
 */
class InmutableStrings {
    /*
    A pesar de ser inmutables, siguen siendo objetos.
    Son creados en el heap.
    Strings que son creados desde el string literal pool viven en heap,
    pero tienen referencias pero tienen referencias a ellos desde el String Literal Pool
    */
    public static void main(String[] args) {
        String one = "SomeString";
        String two = "SomeString";

        System.out.println(one.equals(two));   //true
        System.out.println(one == two);        //true
    }
}
