package boomNumber;

public class BoomNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12;
		double tmp=(num/2)+1;
		double n = (Math.log(tmp)/Math.log(2));
		int i=0;double j=0;
		if(n%2==0){
			i=(int)n;
		}
		else{
			j=n+1;
			i=(int)j;
		}
		int exp = (int) Math.pow(2, i);
		int barStarter=exp-1;
		int resNum=num-barStarter;
		byte[] binary = new byte[32];
		int index = 0; 
		int copyOfInput = resNum; 
		while (copyOfInput > 0) { 
			binary[index++] = (byte) (copyOfInput % 2); 
			copyOfInput = copyOfInput / 2; 
			}
		
		for(int k=0;k<binary.length;k++){
			if(binary[k]==0){
				binary[k]=2;
			}
			else{
				binary[k]=3;
			}
		}
		
		for(int k=i-1;k>=0;k--){
			System.out.print(binary[k]);
		}

		
		
		
	}

}
