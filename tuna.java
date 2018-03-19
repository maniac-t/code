import java.util.ArrayList;

final class tuna {
		String original;
		ArrayList<String> holder=new ArrayList<String>();
		ArrayList<String> lastOne=new ArrayList<String>();
		int base;
		tuna(String original,int base){
		this.original=original;
		this.base=base;
		}
		public  int to10(){
		  int sum=0;
		for(int i=0;i<original.length();i++){
			changer(original.charAt(i));
			sum+=Integer.parseInt(holder.get(i))*Math.pow(base,Math.abs(original.length()-1-i));
		}
		
		return sum;
		}
		public StringBuilder toAny(int sum,int base) {
			int rem;
			String Final=new String();
			//String it=new String();
			while (sum!=0) {
				rem=Math.floorMod(sum, base);
				sum/=base;
				lastOne.add(Integer.toString(rem));
			}
			System.out.println(lastOne);
			for(int i=0;i<lastOne.size();i++) {
				Final+=reverseReplace(Integer.parseInt(lastOne.get(i)));
			}
			StringBuilder New=new StringBuilder(Final);
			return New.reverse();
		}
		public void changer(char index) {
			if(Character.isLetter(index)) {
				holder.add(replace(index));
			}
			else holder.add(Character.toString(index));
		}
		public String replace(Character x) {
			if(x.equals('A'))return Integer.toString(10);
			else if(x.equals('B'))return Integer.toString(11);
			else if(x.equals('C'))return Integer.toString(12);
			else if(x.equals('D'))return Integer.toString(13);
			else if(x.equals('E'))return Integer.toString(14);
			else if(x.equals('F'))return Integer.toString(15);
			else {
				return Character.toString(x);
			}
}
		public String reverseReplace(int Rem) {
			String rem=Integer.toString(Rem);
			if(rem.equals("10"))return Character.toString('A');
			else if(rem.equals("11"))return Character.toString('B');
			else if(rem.equals("12"))return Character.toString('C');
			else if(rem.equals("13"))return Character.toString('D');
			else if(rem.equals("14"))return Character.toString('E');
			else if(rem.equals("15"))return Character.toString('F');
			else {
				return rem;
			}
		}
}	
		    
