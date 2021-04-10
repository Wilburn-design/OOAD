package hk_day02.homework3;

import java.util.ArrayList;
import java.util.List;

public class Diamond extends Treasure {
	 public Diamond(int quantity) {
	        super.quantity = quantity;
	    }

	    @Override
	    public void guard(Eudemon eudemon) {
	        getEudemons().add(eudemon);
	    }

	    @Override
	    public void unguard(Eudemon eudemon) {
	        ArrayList<Eudemon> list = getEudemons();
	        int index = list.indexOf(eudemon);
	        if (index >= 0) {
	            list.remove(index);
	        }
	    }

	    @Override
	    public void notifyEudemon(Character character) {
	        ArrayList<Eudemon> list = getEudemons();
	        list.forEach((Eudemon e) -> e.update(character));
	    }

	    @Override
	    public String toString() {
	        return "Diamond{" +
	                "quantity=" + quantity +
	                '}';
	    }
}
