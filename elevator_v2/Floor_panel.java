package elevator_v2;

import java.util.ArrayList;

public class Floor_panel {
	
	ArrayList<Panel_button> Buttons = new ArrayList<Panel_button>();
	
	public Floor_panel(int numOfFloor) {
		for(int i=0;i<=numOfFloor;i++){
			Panel_button button = new Panel_button(i);
			Buttons.add(button);
		}
	}
	
}
