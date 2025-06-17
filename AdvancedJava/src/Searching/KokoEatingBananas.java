package Searching;

public class KokoEatingBananas {

	public int KokoEatingSpeed(int[] piles, int h) {
		int low = 1;
		int high = getMax(piles);
		int result = high;
		
		while(low<=high) {
			int mid = low + (high - low)/2;
			
			if(isCanFinish(piles, h, mid)) {
				result = mid;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return result;
	
	}
	
	boolean isCanFinish(int[] piles, int h, int k) {
		int hours = 0;
		for(int pile : piles) {
			hours += Math.ceil((double)pile/k);
		}
		return hours <= h;
	}
	
	int getMax(int[] piles) {
	    int max = Integer.MIN_VALUE;
	    for (int pile : piles) {
	        max = Math.max(max, pile);
	    }
	    return max;
	}

	public static void main(String[] args) {
		KokoEatingBananas obj = new KokoEatingBananas();
		int[] pil = {3,6,7,11};
		int h = 8;
		int speed = obj.KokoEatingSpeed(pil, h);
		System.out.println("Minimum speed Koko should eat: " + speed);
	}
}
