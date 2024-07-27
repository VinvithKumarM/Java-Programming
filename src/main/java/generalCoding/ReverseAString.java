package generalCoding;

public class ReverseAString {
	public void reverse(String str){
		String s = "  abc  def\t";

		s = s.strip();

		System.out.println(s);
		if(str== null || str.isEmpty()){
			throw new IllegalArgumentException("Not a valid input");
		}
		StringBuilder sb = new StringBuilder();
		for (int i=str.length()-1; i>=0; i--){
			sb.append(str.charAt(i));
		}
		System.out.println("Revered String : "+sb);
	}
	

}
