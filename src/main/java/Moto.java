//    Создать консольное приложение, удовлетворяющее следующим требованиям:
//
//    1. Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
//    2. Каждый класс должен иметь исчерпывающее смысл название и информативный состав.
//    3. При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//    4. Классы должны быть грамотно разложены по пакетам.
//    5. Для демонстрации работы приложения использовать unit тесты.
//
//    Мотоциклист. Определить иерархию амуниции. Экипировать мотоциклиста. Посчитать стоимость.
//    Провести сортировку амуниции на основе веса. Найти элементы амуниции, соответствующие заданному диапазону параметров цены.

import Equipment.*;
import Motorcyclist.Motorcyclist;

import java.util.List;

public class Moto {

    public static void printEquipList(List<Equipment> l) {
        for(Equipment it: l) {
            System.out.println(it.getClass().getName());
        }
    }

    public static void main(String[] args){

        Motorcyclist motorcyclist = new Motorcyclist();

        Boots boots   = new Boots(3500, 2000);
        Gloves gloves = new Gloves(500, 300);
        Helmet helmet = new Helmet(3000, 5000);
        Jacket jacket = new Jacket(3000, 2500);
        Pants pants   = new Pants(1000, 500);

        motorcyclist.putEquipOn(boots);
        motorcyclist.putEquipOn(gloves);
        motorcyclist.putEquipOn(helmet);
        motorcyclist.putEquipOn(jacket);
        motorcyclist.putEquipOn(pants);

        long equipTotalCost = motorcyclist.calcEquipCost();

        System.out.println("Total equipment cost: " + equipTotalCost);
        System.out.println("\nEquipment list:");
        printEquipList(motorcyclist.getEquipList());

        motorcyclist.sortByWeight();
        System.out.println("\nSorted list:");
        printEquipList(motorcyclist.getEquipList());

        List<Equipment> equipByRange = motorcyclist.findEquipByPriceRange(500, 3000);

        System.out.println("\nEquipment by range:");
        printEquipList(equipByRange);
    }
    
}