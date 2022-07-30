package Motorcyclist;

import Equipment.Equipment;

import java.util.*;

public class Motorcyclist {

    private List<Equipment> _equipment = new ArrayList<Equipment>();

    public List<Equipment> getEquipList() {
        return _equipment;
    }
    /**
     * @brief Put equip on
     *
     * @param e
     */
    public void putEquipOn(Equipment e) {
        _equipment.add(e);
//        System.out.println(e.getClass().getName() + " put on: " + e.getWeight() + "g " + e.getCost() + "BYN");
    }

    /**
     *
     * @return Total equipment cost
     */
    public long calcEquipCost() {

        long totalCost = 0;

        for(Equipment it: _equipment) {
            totalCost += it.getCost();
        }

        return totalCost;
    }

    /**
     * @brief Sort equipment by weight
     */
    public void sortByWeight() {

        /* Sort equipment by weight */
        Collections.sort(_equipment, new Comparator<Equipment>() {
            @Override
            public int compare(Equipment lhs, Equipment rhs) {
                return lhs.getWeight() - rhs.getWeight();
            }
        });
    }

    /**
     * @brief Find equipment according to the given price range
     * @param lower lower range
     * @param upper upper range
     * @return List of found equipment.
     */
    public List<Equipment> findEquipByPriceRange(int lower, int upper) {

        List<Equipment> l = new ArrayList<Equipment>();

        for(Equipment it: _equipment) {
            if(it.getCost() < upper && it.getCost() > lower) {
                l.add(it);
            }
        }

        return l;
    }
}
