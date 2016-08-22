package slidingWind;

public class MaxSlidingWindow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,-1,-3,5,3,6,7};
		int result[]=maxSlideChk(arr);
		for(int l=0;l<result.length;l++){
			System.out.println(""+result[l]);
		}
	}
	public static int[] maxSlideChk(int arr[]){
		int j,k;
		int largest=0;
		int arrtmp[]=new int[arr.length-2];
		for(int i=0;i<arr.length-2;i++){
			j=i+1;
			k=j+1;
			if(arr[i]>arr[j] && arr[i]>arr[k]){
				largest=arr[i];
			}
			else if(arr[j]>arr[i] && arr[j]>arr[k]){
				largest=arr[j];
			}
			else{
				largest=arr[k];
			}
			arrtmp[i]=largest;
		}
		return arrtmp;
	}

}
