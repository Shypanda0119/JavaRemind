package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);
	}

}
