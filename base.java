import java.util.*;
public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       Scanner n=new Scanner(System.in);
	       String toConvert=n.nextLine();
	       int from=n.nextInt();
	       int to=n.nextInt();
	       tuna object=new tuna(toConvert,from);
	       int sum=object.to10();
	       System.out.println(object.toAny(sum, to));
	       
	       }

}
