package rotateTwoDArr;

public class RotateTwoDNineArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		int tmparr[][] = new int[4][4];
		int count=1;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				arr[i][j]=count;
				count++;
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				tmparr[i][j]=arr[arr.length-1-j][i];
			}
		}
		System.out.println("------------------------------------------>");
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(" "+tmparr[i][j]);
			}
			System.out.println();
		}
	}

}
