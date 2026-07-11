//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PlanesDatosFactory {
    public static void main(String[] args) {
        int megas = 1000;
        System.out.println("BIENVENIDOS A LINEA RAPIDA");
        FabricaCreadora lineaRapida = new LineaRapidaFactory();
        calculoConsumo(lineaRapida, "personal", megas);
        calculoConsumo(lineaRapida, "negocio", megas);
        calculoConsumo(lineaRapida, "academico", megas);

        System.out.println("\nBIENVENIDOS A CLARO");
        FabricaCreadora claro = new ClaroFactory();
        calculoConsumo(claro, "personal", megas);
        calculoConsumo(claro, "negocio", megas);
        calculoConsumo(claro, "academico", megas);

        System.out.println("\nBIENVENIDOS A MOVISTAR");
        FabricaCreadora movistar = new MovistarFactory();
        calculoConsumo(movistar, "personal", megas);
        calculoConsumo(movistar, "negocio", megas);
        calculoConsumo(movistar, "academico", megas);

    }

    private static void calculoConsumo(FabricaCreadora fabrica, String tipo, int megasConsumidos) {
        PlanDatos plan = fabrica.crearPlanDatos(tipo);
        float pago = plan.calculoPago(megasConsumidos);
        System.out.println(plan.toString() + "Pago: " + pago + " por " + megasConsumidos + " megas");
    }
}

