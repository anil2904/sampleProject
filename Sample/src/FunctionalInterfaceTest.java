import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class FunctionalInterfaceTest {

	public static void main(String[] args) throws ParseException {
		/*//Interface1 i1= (String s)-> "Hi"+s;
	    //System.out.println(i1.method1("anil"));
		List<String> list = new ArrayList<String>();

		list.add("a");
		list.add("b");
		list.add("cz");
		list.add("d"); 
		list.stream().forEach(s->System.out.println(s));
		list.forEach(s->System.out.println(s));
	    
	        
	        List<String> productPriceList2 =list.stream()
	                                     .filter(s -> s.contains("a"))// filtering data  
	                                     .map(s->s)        // fetching price  
	                                    -> .collect(Collectors.toList()); // collecting as list  
	        System.out.println(productPriceList2);  */
		
		/*String dateString = "2015-07-16 17:07:21";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // use SimpleDateFormat to define how to PARSE the INPUT
        Date date = sdf.parse(dateString);*/
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date());
        System.out.println(date);
        

//Wed Nov 11 12:00:00 EST 1992
	}

}
