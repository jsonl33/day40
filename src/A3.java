
public class A3 {

	int field01;
	void method01() {
	}
	
	static int field02;
	static void method02() {
	}
	
	class B{
		void method01() {
			field01=10;
			method01();
			
			field02=20;
			method02();
		}
	}
}
