import java.util.Arrays;
import java.util.List;

public class ListConvert {
	public static void main(String[] args) {
		List<String> in = Arrays.asList(args);
		List<String> nums = in.subList(in.indexOf("start") + 1, in.indexOf("end"));
		int sum = 0;
		for(String s : nums) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
	}
}
