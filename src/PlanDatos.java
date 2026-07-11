public abstract class PlanDatos {
    protected String nombre;
    protected float tasa;

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public float calculoPago(int megasConsumidos) {
        return megasConsumidos * tasa;
    }
    @Override
    public String toString() {
        return "Plan: " + nombre + "Tasa :" + tasa;
    }
}
