package com.pil.moby.evaluacion_tecnica.segundo_cuestionario;


import com.pil.moby.evaluacion_tecnica.modelo.pojo.Candidato;
import com.pil.moby.evaluacion_tecnica.modelo.pojo.Tecnologia;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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
        resolverPunto2(inicializarCandidatos());

        imprimirMensajePunto(3);

        // Desarrollo de la consigna 3.
        resolverPunto3(inicializarCandidatos());

        imprimirMensajePunto(4);

        // Desarrollo de la consigna 3.
        resolverPunto4(inicializarCandidatos());

        imprimirMensajePunto(5);

        // Desarrollo de la consigna 3.
        resolverPunto5(inicializarCandidatos());

    }

    private static void resolverPunto1(List<Candidato> listaCandidatos) {
        for (Candidato candidato: listaCandidatos) {
            System.out.println(candidato);
        }
    }

    private static void resolverPunto2(List<Candidato> listaCandidatos) {
        System.out.println(" Stream \n");


        listaCandidatos.stream().sorted().forEach(c -> {
            System.out.println(c.getId() + " - " + c.getNombre() + " " + c.getApellido());
        });

        System.out.println("\n Metodo burbuja \n");

        for (int i = 0; i < listaCandidatos.size(); i++) {
            for (int j = 0; j < listaCandidatos.size() - 1; j++) {
                if (listaCandidatos.get(j).compareTo(listaCandidatos.get(j+1)) > 0) {
                    Candidato aux = listaCandidatos.get(j);
                    listaCandidatos.set(j,listaCandidatos.get(j+1));
                    listaCandidatos.set(j+1,aux);
                }
            }
        }
        for (Candidato c : listaCandidatos){
            System.out.println(c.getId() +" - "+c.getNombre()+" "+c.getApellido());
        }

    }

    private static void resolverPunto3(List<Candidato> listaCandidatos) {
        System.out.println(" Stream \n");

        listaCandidatos.stream().sorted(Comparator.comparing(Candidato::getPretensionSalarial).reversed()).forEach(c -> {
            System.out.println(c.getPretensionSalarial() + " - " + c.getNombre() + " " + c.getApellido());
        });

        System.out.println("\n Metodo burbuja \n");

        for (int i = 0; i < listaCandidatos.size(); i++) {
            for (int j = 0; j < listaCandidatos.size() - 1; j++) {
                if (listaCandidatos.get(j).getPretensionSalarial()<listaCandidatos.get(j+1).getPretensionSalarial()) {
                    Candidato aux = listaCandidatos.get(j);
                    listaCandidatos.set(j,listaCandidatos.get(j+1));
                    listaCandidatos.set(j+1,aux);
                }
            }
        }
        for (Candidato c : listaCandidatos){
            System.out.println(c.getPretensionSalarial() +" - "+c.getNombre()+" "+c.getApellido());
        }
    }

    private static void resolverPunto4(List<Candidato> listaCandidatos) {
        Candidato candidatoMayorExperiencia = listaCandidatos.stream().max(Comparator.comparing(Candidato::getAniosExperiencia)).get();
        System.out.println(candidatoMayorExperiencia);
        System.out.println("\nTecnologias ordenadas:");
        System.out.println(candidatoMayorExperiencia.ordenarTecnologias());
    }

    private static void resolverPunto5(List<Candidato> listaCandidatos) {
        Candidato candidatoMayorCantTecnologias = listaCandidatos.stream().max(Comparator.comparing(c ->{
            return c.getTecnologias().size();
        })).get();
        System.out.println(candidatoMayorCantTecnologias);
        System.out.println("\nTecnologias con id par");
        candidatoMayorCantTecnologias.getTecnologias()
                .stream().filter(Tecnologia::esIdPar).findFirst()
                .ifPresentOrElse((tecnologia)->System.out.println(tecnologia), ()->System.out.println("No existen tecnologias con ID par"));
    }

    private static List<Candidato> inicializarCandidatos() {
        List<Candidato> listaCandidatos = new ArrayList<>() ;
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