class Solution {
    public int solution(String num_str) {
        int[] arr = new int[num_str.length()]; 
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(num_str.charAt(i)); 
            
            sum += arr[i];
        }
        return sum;
    }
}
