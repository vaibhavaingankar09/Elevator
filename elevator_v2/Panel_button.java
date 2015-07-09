package elevator_v2;

public class Panel_button implements Button{
    int number;

	public Panel_button(int num){
		number = num;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void press() {
		System.out.println("floor button: "+number+" is pressed on the panel");
	}
}
