package elevator_v2;

import java.util.ArrayList;

public class Building {

    ArrayList<Floor> floors=new ArrayList<Floor>();
    Elevator elevator;
    
    public Building(Integer num_of_floors){
    	for(int i=0;i<=num_of_floors;i++){
    		floors.add(new Floor(i));
    	}
    	elevator=new Elevator(floors);
    }
    
    public int serviceRequest(Floor src,Floor dest){
    	if(dest.getfloor_no() > src.getfloor_no())
    		floors.get(src.getfloor_no()).up.press();
    	else if(src.getfloor_no() > dest.getfloor_no())
    		floors.get(src.getfloor_no()).down.press();
    	
    	 // move the elevator
        int currentLiftFloor=elevator.Elevatorservices(src);  
        
  
        
        currentLiftFloor=elevator.Elevatorservices(dest); 
    	
        // at the dest
        System.out.println(floors.get(currentLiftFloor).floor_Door.open());    
        System.out.println(elevator.elevator_door.open());
    	
        System.out.println(elevator.elevator_door.close());
        System.out.println(floors.get(currentLiftFloor).floor_Door.close());
    	
    	
    	return currentLiftFloor;
    	
    }
}
