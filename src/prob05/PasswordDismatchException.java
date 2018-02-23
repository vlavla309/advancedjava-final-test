package prob05;

public class PasswordDismatchException extends Exception {

	public PasswordDismatchException() {
		super("비밀번호가 일치 하지 않습니다.");
	}
}
