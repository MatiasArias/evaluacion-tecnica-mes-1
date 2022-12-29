public class EvaluacionTecnicaPil {

    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        /****
         * TEMAS:
         *   - Tipos de datos.
         *   - Flujos de control.
         *   - Operadores.
         *   - Clases System.
         ****/

        /****
         * CONSIGNAS:
         * 1. Declará al menos tres variables con tipos de datos primitivos.
         * 2. A las variables declaradas anteriormente asignales un valor
         *    y realizá al menos dos cálculos matemáticos utilizando -operadores aritméticos-.
         * 3. Planteá tres condiciones lógicas que cumplan con lo siguiente:
         *      a. Condición verdadera --> Imprimí por pantalla el resultado de los cálculos anteriores.
         *         Condición falsa --> Imprimí por pantalla un mensaje de error.
         *      b. Condición verdadera --> Siempre que se cumpla, incrementá un valor hasta que éste llegue al doble de su valor inicial.
         *                                 Antes de realizar esta condición, imprimí el valor inicial de la variable que vas a modificar.
         *                                 Finalmente, imprimí por pantalla el valor final.
         *      c. Iteración --> Realizá N cantidad de impresiones, siendo N un tercio del valor de la variable del punto 'b'.
         ****/

        imprimirConsigna(1);

        // Desarrollo de la consigna 1.

        int dia;
        int diasDelMes;
        int mes;

        imprimirConsigna(2);

        // Desarrollo de la consigna 2.

        dia = 9;
        diasDelMes=30;
        mes=8;

        //Calculos aritmeticos

        int diasRestantes=diasDelMes-dia;
        int diasDelAño = diasDelMes*mes;


        imprimirConsigna(3);

        // Desarrollo de la consigna 3.

        System.out.println("\nA");

        if(mes<dia){
            System.out.println("diasDelAño = " + diasDelAño);
            System.out.println("diasRestantes = " + diasRestantes);
        }
        else{
            System.out.println("ERROR - La condicion es falsa");
        }

        System.out.println("\nB");
        System.out.println("dia = " + dia);
        int objDia = dia*2;
        while(dia<objDia){
            dia++;
        }
        System.out.println("dia = " + dia);

        System.out.println("\nC");
        for(int i = 0;i<(dia/3);i++){
            System.out.println("MobyDigital");
        }
    }

    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("*******************************************");
        System.out.println("Bienvenidos a la primer Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    private static void imprimirConsigna(int numeroConsigna) {
        System.out.println("**********");
        System.out.println("CONSIGNA " + numeroConsigna);
        System.out.println("**********\n");
    }
}
