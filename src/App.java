public class App {
    /**
     * @param args
     * @throws Exception
     */
    public String Sumar(float n1, float n2, float n3) {
        double resultado = n1 + n2 + n3;
        return "El resultado es: " + resultado + "\n";
    }

    /**
     * InnerApp
     */
    public class Coche {
        private int puertas = 2;

        public int addPuerta() {
            return puertas++;
        }

        public int getPuertas() {
            return puertas;
        }

        public void setPuertas(int puertas) {
            this.puertas = puertas;
        }

    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        String resultado = app.Sumar(7, 3, 10);
        System.out.println(resultado);

        Coche coche = app.new Coche();
        
        coche.addPuerta();
        System.out.println("Existen " + coche.getPuertas() + " puertas.");
    }
}
