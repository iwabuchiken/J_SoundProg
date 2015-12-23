import java.util.Locale;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg;
		msg = String.format(Locale.JAPAN, "[%s : %d] %s", Thread
				.currentThread().getStackTrace()[1].getFileName(), Thread
				.currentThread().getStackTrace()[1].getLineNumber(), 
				new Test().getClass().getName());

		System.out.println(msg);
		
	}

}
