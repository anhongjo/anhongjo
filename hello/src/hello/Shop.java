package hello;

public class Shop {
	String name;
	
	public Shop(String name) {
		this.name=name;
		
	}
		public void sell(Valuable v, String goods) {
			System.out.print(name +"에서 ");
			System.out.print(v.value() + "원어치");
			
		}
}
