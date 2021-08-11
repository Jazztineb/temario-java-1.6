class DemoTipoLimite {
    public static void main(String[] args) {
        OperaMate<Integer> iOb = new OperaMate<Integer>(5);

        System.out.println("El recíproco de 5 es: " + iOb.reciproco());
        System.out.println("La parte fraccionaria de 5 es: " + iOb.fraccion());
        System.out.println();

        OperaMate<Double> dob =  new OperaMate<Double>(15.25);

        System.out.println("El reciproco de 15.25 es: " + dob.reciproco());
        System.out.println("La parte fraccionaria de 15.25 es: " + dob.fraccion());
    }
}
