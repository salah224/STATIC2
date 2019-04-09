package static2;
class static1{
	static int count= 0;
    static1(){
		count++;
		System.out.println(count);
	}
}

public class static2 {
	public static void main(String[] args) {
		static1 c1 = new static1();
		static1 c2 = new static1();
		static1 c3 = new static1();
		
		new static1();
		
	}

}
