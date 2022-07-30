package Motorcyclist;

import Equipment.*;
import java.util.List;

public class Motorcyclist {

    private List<Equipment> _equipment;

    /**
     *
     * @param e
     */
    public void putEquipOn(Equipment e) {
    }

    /**
     *
     * @return Total equipment cost
     */
    public long calcEquipCost() {
        return 0;
    }

    /**
     * @brief Sort equipment by weight
     */
    public void sortByWeight() {

    }

    /**
     * @brief Find equipment according to the given price range
     * @param lower lower range
     * @param upper upper range
     * @return List of found equipment.
     */
    public List<?> findEquipByPriceRange(int lower, int upper) {
        return _equipment;
    }
}
