public class LineaRapidaFactory extends FabricaCreadora {

    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        PlanDatos plan = null;
        switch (tipo.toLowerCase()) {
            case "personal":
                plan =  new PlanDatosPersonal();
                plan.setTasa(0.5f);
                break;
            case "negocio":
                plan = new PlanDatosNegocio();
                plan.setTasa(1.5f);
                break;
            case "academico":
                plan = new PlanDatosAcademico();
                plan.setTasa(1.0f);
                break;
        }
        return null;
    }
}
