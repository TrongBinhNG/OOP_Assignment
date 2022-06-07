
public class Arithmetic {
	public static void main (String args[]) {
		int data[]= {78,65,78,21,93,45,33,55,22,81};
		int sum = 0;
		for (int i =0;i<data.length;i++) {
			sum = sum + data[i];
		}
		float avg = 0;
		float d = (float)sum;
		avg = d/data.length;
		System.out.println(" Sum "+ sum);
		System.out.println(" Average "+ avg);
	}
}
