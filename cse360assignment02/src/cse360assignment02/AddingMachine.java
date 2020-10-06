package cse360assignment02;

public class AddingMachine {
  public static void main(String[] args) {
	  AddingMachine MyCalculator = new AddingMachine();
	  MyCalculator.add(4);
	  MyCalculator.subtract(2);
	  MyCalculator.add(5);
	  System.out.println(MyCalculator.getTotal());
	  System.out.println(MyCalculator.toString());
  }
  String all = "0 ";
  private int total;
  
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  all = all + " + " + value;
  }

  public void subtract (int value) {
	  total -= value;
	  all = all + " - " + value;
  }

  public String toString () {
    return all;
  }

  public void clear() {
  }
}
