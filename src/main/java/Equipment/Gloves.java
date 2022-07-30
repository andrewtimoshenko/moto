package Equipment;

public class Gloves extends Equipment {

    public Gloves(int weight, int cost) {
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
