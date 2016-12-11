package gof.equipment;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.Iterator;

import org.springframework.stereotype.Component;
@Component
public class Iventory {
	private ArrayList<String> equipList = new ArrayList<String>();
	public void Accumulate(Equipment equip) {
		this.equipList.add(equip.getClass().getName());
	}
	public void showSortEquipements() throws Exception {
		this.equipList.sort(new  Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		    });
		Iterator<String> iterator= this.equipList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public void clear() {
		this.equipList.clear();
	}
}
