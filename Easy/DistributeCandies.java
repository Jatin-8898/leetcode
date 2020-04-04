import java.util.*;
/*Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.

Example 1:
Input: candies = [1,1,2,2,3,3]
Output: 3
Explanation:
There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too. 
The sister has three different kinds of candies. 

Example 2:
Input: candies = [1,1,2,3]
Output: 2
Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1]. 
The sister has two different kinds of candies, the brother has only one kind of candies. 
*/
class DistributeCandies{
	public static void main(String[] args) {
		int[] a = {1,1,1,2,2,3};
		int ans = 	distributeCandies(a);
		System.out.println("THE SISTER TAKES 3 DIFF KINDS OF CANDIES: "+ ans);
	}

	/*The idea is to add the Candies in the hashset since hashset doesnt allows duplicate
	and then return the min of array/2 or the size of the hashset
	*/
	public static int distributeCandies(int[] candies) {
       Set<Integer> kinds = new HashSet<>();		
        
        for(int candy : candies){			
            kinds.add(candy);
        }
        System.out.println(kinds);
        return Math.min(candies.length/2, kinds.size());	//we want the min kinds of candies
    }
}