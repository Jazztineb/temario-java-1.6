public class Student {
    int id;

    Student(int id){
        this.id = id;
    }

    @Override //Sobreescribiendo metodo equals
    public boolean equals(Object obj){
        if (obj == null) //Si el objeto llega null, es falso.
            return false;
                                            //downcasting
        if (!(obj instanceof Student))  //Si el objeto es una instancia de Student, es falso. Conversion de tipos.
            return false;               //Determinar si el objeto al que apunta una referencia dada es una instancia de una clase o interfaz concretas.

        if (obj == this)
            return true; //comparar direccion de memoria


        return this.id == ((Student) obj).id;
    }

}
