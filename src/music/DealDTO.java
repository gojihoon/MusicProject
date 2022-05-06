package music;

public class DealDTO {
	private String accountNumber;// 계좌번호
	private Long deposit;// 입 금
	private Long withdraw;// 출 금

	public DealDTO(String accountNumber, Long deposit, Long withdraw) {
		this.accountNumber = accountNumber;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getDeposit() {
		return deposit;
	}

	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}

	public Long getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(Long withdraw) {
		this.withdraw = withdraw;
	}

	@Override
	public String toString() {
		return "DealDTO [accountNumber=" + accountNumber + ", deposit=" + deposit + ", withdraw=" + withdraw + "]";
	}

}
