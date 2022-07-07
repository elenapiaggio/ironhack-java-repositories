package day_7.HelloArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    String[] names = {"Eli", "Juancito", "Tucupey", null, null};
    System.out.println(names[4]);

    // Para solucionar lo de insertar elementos que sean null, usamos ArrayList
    // <E> -> son genéricos
    // es como si fuese ArrayList<Based on this class -> I will create a specific version of this object>
    // ArrayList<E> arrayListGenerics = new ArrayList<E>();

    var arrayListNames = new ArrayList<String>();
    arrayListNames.add("Juancito");
    arrayListNames.addAll(List.of("Tucupey", "Pepin", "Galvez"));
    System.out.println(arrayListNames);

    // Demo con objects
    var people = new ArrayList<Person>();
    for (int i = 0; i < names.length; i++) {
      arrayListNames.add(names[i]);
      people.add(new Person(names[i]));
    }

    System.out.println(arrayListNames);
    System.out.println(people);


  }
}
