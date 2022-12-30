package main.java.com.pil.moby.evaluacion_tecnica.segundo_cuestionario;


import com.pil.moby.evaluacion_tecnica.modelo.pojo.Candidato;
import com.pil.moby.evaluacion_tecnica.modelo.pojo.Tecnologia;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class EvaluacionTecnicaPil2 {

    /**
     * <b>TEMAS:</b><p>
     * - Arreglos y ordenamiento.<p>
     * - POO.<p>
     * - Buenas prácticas + Utilización del IDE.<p>
     * - Java 5, 6, 7 y 8 (<i>Streams, Optionals, Generics, Functional Interfaces</i>).<p>
     */
    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        imprimirMensajePunto(1);

        // Desarrollo de la consigna 1.

        resolverPunto1(inicializarCandidatos());

        imprimirMensajePunto(2);

        // Desarrollo de la consigna 2.
        resolverPunto2();

        imprimirMensajePunto(3);

        // Desarrollo de la consigna 3.
        resolverPunto3();

        imprimirMensajePunto(4);

        // Desarrollo de la consigna 3.
        resolverPunto4();

        imprimirMensajePunto(5);

        // Desarrollo de la consigna 3.
        resolverPunto5();

    }

    private static void resolverPunto1(List<Candidato> listaCandidatos) {
        for (Candidato candidato: listaCandidatos) {
            System.out.println(candidato);
        }
    }

    private static void resolverPunto2() {
        // TODO: Realizar implementación.
    }

    private static void resolverPunto3() {
        // TODO: Realizar implementación.
    }

    private static void resolverPunto4() {
        // TODO: Realizar implementación.
    }

    private static void resolverPunto5() {
        // TODO: Realizar implementación.
    }

    private static List<Candidato> inicializarCandidatos() {
        List<Candidato> listaCandidatos = new ArrayList<>() ;
        List<Tecnologia> listaTecnologias = new ArrayList<>();
        Tecnologia java = new Tecnologia(1L , "Java");
        Tecnologia angular = new Tecnologia(2L , "Angular");
        Tecnologia sql = new Tecnologia(3L , "SQL");
        Tecnologia nosql = new Tecnologia(4L , "NoSQL");
        Tecnologia vue = new Tecnologia(5L , "Vue");
        Tecnologia net = new Tecnologia(6L , ".NET");
        Tecnologia mongo = new Tecnologia(7L , "MongoDB");
        Tecnologia nodejs = new Tecnologia(8L , "NodeJS");

        listaCandidatos.add(new Candidato(3L,"Jhon","Doe",2,5000d,new ArrayList<Tecnologia>(){
            {
                add(java);
                add(angular);
                add(sql);
            }}));
        listaCandidatos.add(new Candidato(7L,"Matias","Otamendi",9,3000d,new ArrayList<Tecnologia>(){
            {
                add(nodejs);
                add(java);
                add(sql);
            }}));
        listaCandidatos.add(new Candidato(1L,"Joaquin","Tagliafico",6,2000d,new ArrayList<Tecnologia>(){
            {
                add(mongo);
                add(nosql);
            }}));
        listaCandidatos.add(new Candidato(4L,"Gaston","Mac Allister",1,5000.50d,new ArrayList<Tecnologia>(){
            {
                add(vue);
                add(sql);
                add(java);
            }}));
        listaCandidatos.add(new Candidato(5L,"Pablo","De Paul",4,9000.50d,new ArrayList<Tecnologia>(){{add(java);}}));
        listaCandidatos.add(new Candidato(2L,"Lucas","Di Maria",7,6000d,new ArrayList<Tecnologia>(){
            {
                add(java);
                add(angular);
                add(sql);
            }}));
        listaCandidatos.add(new Candidato(10L,"Lionel","Messi",10,10000.10d,new ArrayList<Tecnologia>(){
            {
                add(sql);
                add(vue);
                add(java);
            }}));
        listaCandidatos.add(new Candidato(9L,"Julian","Álvarez",3,5000d,new ArrayList<Tecnologia>(){
            {
                add(nosql);
                add(mongo);
                add(sql);
                add(java);
            }}));
        listaCandidatos.add(new Candidato(8L,"Lula","Martinez",2,1000d,new ArrayList<Tecnologia>(){
            {
                add(net);
                add(java);
                add(angular);
            }}));
        listaCandidatos.add(new Candidato(6L,"Agustin","Dybala",2,1000d,new ArrayList<Tecnologia>(){
            {
                add(net);
                add(java);
                add(angular);
            }}));

        return listaCandidatos;
    }

    /**
     * Saludo de bienvenida, ignore el método.
     */
    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("\n*******************************************");
        System.out.println("Bienvenidos a la segunda Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    /**
     * Separa de manera bonita cada punto a resolver, ignore el método.
     */
    private static void imprimirMensajePunto(int numeroPunto) {
        System.out.println("\n*******");
        System.out.println("PUNTO " + numeroPunto);
        System.out.println("*******\n");
    }
}