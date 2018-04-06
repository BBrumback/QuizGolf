
public class WhileLoops {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(!args[i].equals("start")) {i++;}
		i++;
		while(!args[i].equals("stop")) { sum += Integer.parseInt(args[i]); i++;}
		System.out.println(sum);
	}
}
