package prob03;

public class Money {

	private int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

	public Money add(Money other) {
		return new Money(this.amount + other.amount);
	}
	
	public Money minus(Money other) {
		return new Money(this.amount - other.amount);
	}
	
	public Money multiply(Money other) {
		return new Money(this.amount * other.amount);
	}
	
	public Money devide(Money other) {
		return new Money(this.amount / other.amount);
	}
    
}
