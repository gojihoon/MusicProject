package music;

public class ClientDTO {
	private Long id;// 회원고유번호
	private String clientId;// 아이디
	private String clientPass;// 비밀번호
	private Long balance;// 잔액
	private String accountNumber;// 계좌번호
	private Long ticket;// 이용권

	public ClientDTO(Long id, String clientId, String clientPass, Long balance, String accountNumber, Long ticket) {
		this.id = id;
		this.clientId = clientId;
		this.clientPass = clientPass;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.ticket = ticket;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientPass() {
		return clientPass;
	}

	public void setClientPass(String clientPass) {
		this.clientPass = clientPass;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getTicket() {
		return ticket;
	}

	public void setTicket(Long ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "ClientDTO [id=" + id + ", clientId=" + clientId + ", clientPass=" + clientPass + ", balance=" + balance
				+ ", accountNumber=" + accountNumber + ", ticket=" + ticket + "]";
	}

}