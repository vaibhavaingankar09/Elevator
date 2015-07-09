
/*
1319- Vaibhav Vaingankar
1343- Wolfgang Furtado
1353- Saeel Parulekar
*/
package elevator_v2;

public class Main {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Building building=new Building(5);
	System.out.println("\n=> Case 1: Elevator is at ground floor, you are at third floor, you want to go to ground floor");
	building.elevator.setCurrentFloor(building.floors.get(0));          
	building.serviceRequest(building.floors.get(3),building.floors.get(0));
	
	System.out.println("\n=> Case 2: elevator is at top floor, you are on third floor, you want to go to ground floor.");
	building.elevator.setCurrentFloor(building.floors.get(5));          
	building.serviceRequest(building.floors.get(5),building.floors.get(0));
	
	System.out.println("\n=> Case 3: elevator is at fifth floor(top most floor), you are at fifth floor, you want to go to second floor");
	building.elevator.setCurrentFloor(building.floors.get(5));         
	building.serviceRequest(building.floors.get(5),building.floors.get(2));
	
	System.out.println("\n=> Case 4: Elevator is at ground floor, you are at fifth floor, you want to go to ground floor.");
	building.elevator.setCurrentFloor(building.floors.get(0));         
	building.serviceRequest(building.floors.get(5),building.floors.get(0));
}

}
