package Equipment;

public class Boots extends Equipment {

    public Boots(int weight, int cost) {
        this._weight = weight;
        this._cost = cost;
    }

    public int getCost() {
        return _cost;
    }

    public int getWeight() {
        return _weight;
    }

    private int _weight = 0;
    private int _cost = 0;
}
