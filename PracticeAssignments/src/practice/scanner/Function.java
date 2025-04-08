package practice.scanner;

public class Function {
	int n;
	public Function(int n){
		this.n=n;
		doFunction1(n);
		
	}
	public void doFunction1(int a) {
		for(int i =1;i<=10;i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
	
	public boolean checkPrime(int n) {
//		boolean flag=true;
		
		for(int i =2;i<n/2;i++) {
			if(n%i==0) return false;
		}
		return true;
		
	}
}
