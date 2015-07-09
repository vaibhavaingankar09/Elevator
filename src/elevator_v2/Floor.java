package elevator_v2;

public class Floor {
	 Integer floor_no;
	 Up_button up;
     Down_button down;
     Floor_door floor_Door;
         
 	Floor(Integer floorNo) {
 		this.floor_no = floorNo;
 		floor_Door=new Floor_door();
 		up=new Up_button();
 		down=new Down_button();
 	}
 	
	public Integer getfloor_no() {
		return floor_no;
	}

	public void setfloor_no(Integer fl_no) {
		this.floor_no = fl_no;
	}
	
 	
}
