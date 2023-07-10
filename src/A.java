
public class A {
	A() {
		System.out.println("A생성자 호출");
	}

	public class B {
		B() {
			System.out.println("B 생성자 호출");
		}

		int field01;

//		static int field02;
		void method01() {
		}
//		static void method02() {}
	}

	static class C {
		C() {
			System.out.println("C생성자 호출");
		}

		int field01;
		static int field02;

		void method01() {
		}

		static void method02() {
		}
	}

	void method() {
		class D {
			D() {
				System.out.println("D생성자 호출");
			}

			int field01;

//			static int field02;
			void method01() {
			}
//			static void method02() {}
		}
		D d = new D();
		d.field01 = 3;
		d.method01();
	}
}
