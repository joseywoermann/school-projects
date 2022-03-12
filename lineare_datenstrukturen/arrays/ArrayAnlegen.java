public class ArrayAnlegen {
	
	int[] wuerfelsimulation;
	
	public ArrayAnlegen() {
		wuerfelsimulation = new int[30];
	}
	
	public void main() {
		for (int i = 0; i < 30; i++) {
			wuerfelsimulation[i] = (int)(Math.random() * 7);
		}
		
		for (int j = 0; j < 30; j++) {
			System.out.println(wuerfelsimulation[j]);
		}
	}
}	
