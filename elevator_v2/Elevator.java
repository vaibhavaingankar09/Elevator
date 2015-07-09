package elevator_v2;

import java.util.ArrayList;

public class Elevator {
	Elevator_door elevator_door = new Elevator_door();
	public Floor cur_Floor;
	
	Floor_panel fl_panel;
	
	public Elevator(ArrayList<Floor> floors){
		fl_panel = new Floor_panel(floors.size());
	}
	
	public void setCurrentFloor(Floor f){
		cur_Floor = f;
	}
		
	
	public int Elevatorservices(Floor desti){ 
		int dest_floor=fl_panel.Buttons.get(desti.getfloor_no()).getNumber();
		
		if(cur_Floor.getfloor_no() < desti.getfloor_no())
			this.Move_up(desti);
		else if(cur_Floor.getfloor_no() > desti.getfloor_no())
			this.Move_down(desti);
		return dest_floor;
	}
	
	public void Move_up(Floor dest){ 
		this.fl_panel.Buttons.get(dest.getfloor_no()).press();
		System.out.println("===== ^| Moving up |^ =====");
		cur_Floor.setfloor_no(dest.getfloor_no());	
	}
	
	public void Move_down(Floor dest){ 
		this.fl_panel.Buttons.get(dest.getfloor_no()).press();
		System.out.println("===== v| Moving down |v =====");
		cur_Floor.setfloor_no(dest.getfloor_no());
	}
	
}
