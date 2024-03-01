package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// float var1 = 3.14; 자바에서는 실수를 double타입으로 해석하기 때문 float타입으로 선언하려면 실수뒤에 f를 붙이기
		float var2 = 3.14f;
		double var3 = 3.14;
		
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		double var6 = 3e6;
		float var7 =3e6F;
		double var8 = 2e-3;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var823: " + var8);
	}

}
