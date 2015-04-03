package laboratory;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionShuff {
	
	public int useConcurrentHashMap(int length){
		ConcurrentHashMap<String,Boolean> strMap 
			= new ConcurrentHashMap<String,Boolean>();
		for(int i = 0,len = length; i< len; i++) {
			String str = String.valueOf(i);
			strMap.put(str, false);
		}		
		//strMap.put("5", true);
		//strMap.put("7", true);	
		Iterator<Map.Entry<String, Boolean>> it = strMap.entrySet().iterator();				
		//strMap.clear();				
		while(it.hasNext()){
			Map.Entry<String, Boolean> entry = it.next();
			if(entry.getValue()){
				System.out.println("delete : " + entry.getKey()+" , "+ entry.getValue());
				it.remove();
			} else {
				System.out.println("save : " + entry.getKey()+" , "+ entry.getValue());
			}			
		}
		
		//System.out.println(strMap.size());
		
		return strMap.size();
	}
	
	public int addOpration(int input) {
		int output = 10;
		return input += output; 
	}
	
}
