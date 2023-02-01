import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string1("SSiiddhhaarrtthh");
		System.out.println(replace_space(" si d "));
		System.out.println(array());
		max();
		
		
		HashMap<String , Integer> test= new HashMap<String , Integer>();
		test.put("four", 1);
		test.put("three", 4);
		test.put("Two", 3);
		test.put("zero", 0);
		
		map(test);
		System.out.println(validate());

	}

	//Removing duplicates from the string
	public static void string1(String a) {
	LinkedHashSet<Character> as =new LinkedHashSet<Character>();
	
	for(int i=0;i<a.length();i++) {
		as.add(a.charAt(i));
	}
	String x="";
	Iterator<Character> i= as.iterator();
	while(i.hasNext()) {
		x=x+i.next();
	}
	System.out.println(x);
	}
	
	
	// Remove white spaces from a string.
	public static String replace_space(String a) {
		return a.replaceAll(" ", "");
		}
	
	
	// compare the arrays 
	public static boolean array() {
		int[] arr= new int[] {1,2,3,4,5};
		int[] arr1= new int[] {5,4,3,2,1};
		Arrays.sort(arr);
		Arrays.sort(arr1);
	
		return arr.equals(arr1);

		
		
	}
	
	// third max in an array
	public static void max() {
		int[] arr= new int[] {1,2,3,4,5,6,7};
		int max =0;
		int max2=0;
		int max3=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			if(max2<arr[i] & arr[i]!=max)
				max2=arr[i];
		}
	
		for(int i=0;i<arr.length;i++) {
			if(max3<arr[i] & arr[i]!=max & arr[i]!=max2)
				max3=arr[i];
		}
		System.out.println("3rd max in the array :"+max3);

	}
	
	
	// sorting a map w.r.t their value
	public static void map(HashMap<String , Integer> hm) {
		List<Map.Entry<String, Integer> > list =
	               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());	
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
			public int compare(Map.Entry<String, Integer> o1,
											Map.Entry<String, Integer> o2) {
				return (o1.getValue().compareTo(o2.getValue()));
			}
		}
		);
		
		HashMap<String , Integer> l= new HashMap<String , Integer>();
		for(Map.Entry<String , Integer> a:list) {
			l.put(a.getKey(), a.getValue());
		}
		System.out.println(l);
	}
	
	public static boolean validate() {
		char[] arr= new char[] { '(', ')', '[', '{', ']','}'};
		int right=0;
		int left=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='('   ||  arr[i]=='{'  || arr[i]=='[' ) {
				right++;
			}else {
				left++;
			}
		}
		if(right==left) {
			return true;
		}
		return false;
	}
	
	}


