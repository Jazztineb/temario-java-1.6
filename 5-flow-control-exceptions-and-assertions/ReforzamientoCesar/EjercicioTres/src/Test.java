public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Student s1 = new Student(1001);
        Student s2 = new Student(1001);

        /* https://faircg.com/blog/using-equalsobject-obj-and-hashcode-methods/
        Este método se utiliza para comparar dos objetos desde la ubicación de la memoria.
        Devuelve verdadero si el objeto pasado en el método existe en la misma ubicación de memoria
        donde existe el objeto actual.
         */
        System.out.println(s1.equals(p));
        System.out.println(s1.equals(s2));

    }
}
