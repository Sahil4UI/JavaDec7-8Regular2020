import java.util.Random;

public class RandomNumberGeneration {
	public static void main(String[] args) {
		Random random = new Random();
		int rand=random.nextInt(10);
		System.out.println(rand);
	}
}
