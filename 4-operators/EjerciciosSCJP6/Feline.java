class Feline {

    public static void main(String[] args) {
        Long x = 42L;
        Long y = 44L;
        System.out.println(""    +   7   +   2   +   ""); //Si algunos de los operandos son string se concatenan.
        System.out.println(foo() +   x   +   5 +     "");//Unboxing funciona junto con concatenación.
        System.out.println(x + y + foo()); //Suma
    }
    static String foo(){
        return "foo";
    }
}
