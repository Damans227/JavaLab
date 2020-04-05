
public class ArrayDemo {

	public static void main(String[] args) {
	 int[] nums=new int[4]; // Declaration and instantiation of 1- D array
	 
	 // another way - int nums[]={8,12,76,54}
	 
	 nums[0]=8; // initialization of 1-D array
	 nums[1]=12;
	 nums[2]=76;
	 nums[3]=54;
	 
	 for(int i=0; i<4; i++){
		 
	 System.out.println(nums[i]);
	 }
	 
	 //2-D array
	 
	 int a[]= {1,2,3,4};
	 int b[]= {2,4,6,8}; //  if b[]={2,4,6} therevore number of columns are not same, so it becomes a jagged array. 
	 int c[]= {5,6,7,8};
	 
	 int d[][]= {{1,2,3,4},{2,4,6,8},{5,6,7,8}};
	 
	 System.out.println("*************");
	 
	for(int i=0; i<d.length;i++) {
		 for(int j=0;j<d[i].length;j++) {
	 System.out.print(d[i][j]);
	 
		 }  System.out.println();
	 
	 }

	}

}
