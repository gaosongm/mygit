package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	public static void main(String[] args) {
		String str = "pk_user in (select cuserid from sm_user where pk_org in ('0001A110000000000A2Y','0001A110000000002DQ9')) AND tempstyle in ('单据模板','查询模板') AND pk_user in ('0001A11000000000288Y','0001A110000000002DNJ')";
	    String[] values = str.split("AND");	
	    String[] result = null;
	    
	    Map<String,String[]> map = new HashMap<String,String[]>();
	    
	    
	    Pattern p = Pattern.compile("\'.*\'");
	    Matcher m = p.matcher(values[0]);
	    List<String> list = new ArrayList<String>();
	    int index = 0;
	    String pk = null;
	    while(m.find()){
	    	pk = m.group(0);
	    	list.add(pk.replace("\'", ""));
//	    	index++;
	    }
	    System.out.println(list);
		
	}

}
