package hk_day02.homework3;

import java.util.ArrayList;

public abstract class Treasure {
	protected int quantity;
    protected ArrayList<Eudemon> eudemons = new ArrayList<Eudemon>();

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ArrayList getEudemons() {
        return eudemons;
    }

    public abstract void guard(Eudemon eudemon);

    public abstract void unguard(Eudemon eudemon);

    public abstract void notifyEudemon(Character character);
}
