import java.util.Arrays;
import java.util.List;

public class StreamImpl {
	public static void main(String[] args) {
		List<String> in = Arrays.asList(args);
		List<String> nums = in.subList(in.indexOf("start")+1, in.indexOf("stop"));
		System.out.println(nums.stream().mapToInt(Integer::parseInt).sum());
	}
}
