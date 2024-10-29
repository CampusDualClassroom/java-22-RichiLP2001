package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> nuevaLista = new ArrayList<>();
        nuevaLista.add("GKFFD");
        nuevaLista.add("TNANA");
        nuevaLista.add("MPMSL");
        nuevaLista.add("PSWME");
        nuevaLista.add("LZMLF");
        nuevaLista.add("JYEBV");
        nuevaLista.add("YELNT");
        nuevaLista.add("JSNKR");
        nuevaLista.add("JFESF");
        nuevaLista.add("TMJLL");



    return nuevaLista;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for(String item : customList){
            System.out.println(item);
        }

    }

    public static boolean addElementToList(List<String> customList, String element) {

    return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> laLista = createArrayList();
        printElementsAndIndex(laLista);
        System.out.println("\nAgregamos un nuevo item: ");
        addElementToList(laLista,"AAAAA");
        boolean addedArrayList = addElementToList(laLista,"AAAA");
        printElementsAndIndex(laLista);

    }


}
