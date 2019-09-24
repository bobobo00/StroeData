import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 测试表格存储数据
 * ORM思想：对象关系映射
 * @author dell
 *
 */
public class TestCollection {
	public static void mapInList() {
		Map<String,Object> row1=new HashMap<>();
		row1.put("id", 1001);
		row1.put("姓名","张三");
		row1.put("薪水", 20000);
		row1.put("入职日期", "2018.5.5");
		
		Map<String,Object> row2=new HashMap<>();
		row2.put("id", 1002);
		row2.put("姓名","李四");
		row2.put("薪水", 30000);
		row2.put("入职日期", "2008.5.5");
		
		Map<String,Object> row3=new HashMap<>();
		row3.put("id", 1003);
		row3.put("姓名","王五");
		row3.put("薪水", 33000);
		row3.put("入职日期", "2005.5.5");
		
		List<Map<String,Object>> list=new ArrayList<>();
		list.add(row1);
		list.add(row2);
		list.add(row3);
		
		for(Map<String,Object> row:list) {
			Set<String> set=row.keySet();
			System.out.print("|");
			for(String key:set) {
				System.out.print(key+":"+row.get(key)+"|");
			}
			System.out.println();
			System.out.print("-----------------------------------------------");
			System.out.println();
		}
		
	}
	
	public static void storeInList() {
		List<Emp> list=new ArrayList<>();
		list.add(new Emp(1001,"张三",2000.0,"2018.5.3"));
		list.add(new Emp(1002,"李四",3000.0,"2015.5.3"));
		list.add(new Emp(1003,"王五",5000.0,"2008.5.3"));
		for(Emp temp:list) {
			System.out.println(temp);
		}
		
	}
	public static void main(String[] args) {
		mapInList();
		System.out.println();
		storeInList();
	}

}
class Emp{
	int id;
	String name;
	Double salay;
	String date;
	
	public Emp(int id, String name, Double salay, String date) {
		super();
		this.id = id;
		this.name = name;
		this.salay = salay;
		this.date = date;
	}
	
	public String toString() {
		String str="| id:"+id+" | 薪水:"+salay+" | 姓名:"+name+" | 入职日期:"+date+"|";
		return str;
	}
	
	
}
