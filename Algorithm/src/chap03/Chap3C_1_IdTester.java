package chap03;

class Id{
	private static int counter = 0;
	private int id;
	
	public Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static int getCounter() {
		return counter;
	}
}

public class Chap3C_1_IdTester {

	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		Id c = new Id();
		
		System.out.println("a 아이디: " + a.getId());
		System.out.println("b 아이디: " + b.getId());
		System.out.println("c 아이디: " + c.getId());
		
		System.out.println("총 아이디 개수: " + Id.getCounter());

	}

}
