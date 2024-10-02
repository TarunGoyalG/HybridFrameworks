package Multi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
	  String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
	  HashMap<String,List<String>>s=new HashMap<>();
	  for(String i:strs) {
		 char[] p = i.toCharArray();
		 Arrays.sort(p);
	  String st=new String(p);
	  if(s.containsKey(st)) {
		  s.get(st).add(i);
	  }else {
	ArrayList<String>sa=	  new ArrayList<>();
	sa.add(i);
	s.put(st, sa);
	  }
	  
	  
	  }
	System.out.println( new ArrayList<>(s.values()));
	

	
}

}

	
	

	
//
//HashMap<Character,Integer>map=new HashMap<>();
//for(char ch:j.toCharArray()) {
//	if(ch!=' ') {
//		map.put(ch, map.getOrDefault(ch,0)+1);
//	}
//}
//for(Map.Entry<Character, Integer> e:map.entrySet()) {
//	System.out.println(e.getKey()+" "+e.getValue());
//}
	

