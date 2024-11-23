public class RemoveElement {
	public static int RemoveElement(int [] nums,int val) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[count]=nums[i];
				count++;
			}
			else {
				continue;
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		int nums[]= {3,2,2,3};
		int val=3;
		int result=RemoveElement.RemoveElement(nums,val);
		System.out.print("After removing element:");
		for(int i=0;i<result;i++) {
			System.out.print(nums[i]);
		}

	}

}
