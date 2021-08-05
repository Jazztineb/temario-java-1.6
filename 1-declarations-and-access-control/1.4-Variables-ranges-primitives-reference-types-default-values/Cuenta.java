class Cuenta {
    private String numCuenta;
    private double importeCuenta;
    private boolean vip;

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getImporteCuenta() {
        return importeCuenta;
    }

    public void setImporteCuenta(double importeCuenta) {
        this.importeCuenta = importeCuenta;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String verDetalles()
    {
        return "Cuenta: \n Número: " + this.getNumCuenta()
                + "\n Importe: " + this.getImporteCuenta() +
                "\n EsVip: " + this.isVip();
    }
}
