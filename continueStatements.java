public class continueStatements {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
			// If the number is 2
			// skip and continue
			if (i == 2)
				continue;

			System.out.print(i + " ");
		}
    }
}
