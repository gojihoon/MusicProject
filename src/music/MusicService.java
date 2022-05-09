package music;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class MusicService {
	MusicRepository mr = new MusicRepository();
	Scanner sc = new Scanner(System.in);
	static Long id = 0L;
	static Long songId = 0L;
	static Long Hits = 0L;

	void sign() {
		System.out.print("아이디:");
		String clientId = sc.next();
		boolean result = mr.signCheck(clientId); //중복체크
		if (result == true) {
			System.out.print("비밀번호:");
			String clientPass = sc.next();
			System.out.print("계좌번호(000-000):");
			String accountNumber = sc.next();
			ClientDTO client = new ClientDTO(++id, clientId, clientPass, 0L, accountNumber, 0L);
			result = mr.sign(client);
			if (result) {
				System.out.println("가입되었습니다.");
				DealDTO deal = new DealDTO(accountNumber, 0L, 0L);
				mr.saveDeal(deal);
			} else {
				System.out.println("가입에 실패하였습니다. 다시 입력해주세요.");
			}
		} else {
			System.out.println("아이디가 중복되었습니다. 다시 입력하세요.");
		}
		sc.nextLine();
	}

	void login() {
		System.out.print("아이디:");
		String clientId = sc.next();
		System.out.print("비밀번호:");
		String clientPass = sc.next();
		boolean result = mr.login(clientId, clientPass);
		if (result) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("로그인에 실패하였습니다.");
		}
		sc.nextLine();
	}

	void songReg() { //노래 등록
		System.out.print("노래 제목:");
		String songTitle = sc.nextLine();
		System.out.print("장르:");
		String genre = sc.nextLine();
		System.out.print("가수:");
		String singer = sc.nextLine();

		LocalDateTime dateTime = LocalDateTime.now();
		String date = dateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 HH:mm:ss"));

		MusicDTO music = new MusicDTO(++songId, songTitle, genre, singer, date, Hits);
		boolean result = mr.songReg(music);
		if (result) {
			System.out.println("노래가 등록되었습니다.");
		} else {
			System.out.println("노래등록에 실패하였습니다.");
		}
	}

	void pop() { //인기차트
		List<MusicDTO> musicList = mr.pop();
		for (MusicDTO m: musicList){
			System.out.println(m);
			}
		}

	void sGenre() { 
		System.out.print("장르:");
		String Genre = sc.next();
		MusicDTO genre = mr.sGenre(Genre);
		if (genre != null) {
			System.out.println(genre);
		} else {
			System.out.println("일치하는 장르가 없습니다.");
		}
		sc.nextLine();
	}

	void sSinger() {
		System.out.print("가수:");
		String Singer = sc.next();
		MusicDTO singer = mr.sSinger(Singer);
		if (singer != null) {
			System.out.println(singer);
		} else {
			System.out.println("일치하는 가수가 없습니다.");
		}
		sc.nextLine();
	}

	void savePlaylist() {
		System.out.print("저장할 노래 번호:");
		Long songId = sc.nextLong();
		boolean result = mr.savePlaylist(songId);
		if (result) {
			System.out.println("플레이리스트에 저장되었습니다.");
		} else {
			System.out.println("저장에 실패하였습니다.");
		}
		sc.nextLine();
	}

	void playlist() {
		List<MusicDTO> playList = mr.playlist();
		for (MusicDTO m : playList) {
			System.out.println(m);
		}
	}

	void deposit() {
		System.out.print("아이디:");
		String clientId = sc.next();
		System.out.print("비밀번호:");
		String clientPass = sc.next();
		String id = mr.loginCheck(clientId, clientPass);
		if (id != null) {
			System.out.print("계좌번호:");
			String accountNumber = sc.next();
			System.out.print("입금할 금액:");
			Long money = sc.nextLong();
			ClientDTO client = mr.deposit(accountNumber, money);
			if (client != null) {
				System.out.println(client);
			} else {
				System.out.println("입금에 실패하였습니다.");
			}
		} else {
			System.out.println("로그인에 실패하였습니다.");
		}
		sc.nextLine();
	}

	void pass() {
		System.out.print("아이디:");
		String clientId = sc.next();
		System.out.print("비밀번호:");
		String clientPass = sc.next();
		String id = mr.loginCheck(clientId, clientPass);
		if (id != null) {
			System.out.print("계좌번호: ");
			String accountNumber = sc.next();
			ClientDTO client = mr.pass(accountNumber);
			if (client != null) {
				System.out.println("이용권이 구매되었습니다.");
				System.out.println(client);
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else {
			System.out.println("로그인에 실패하였습니다.");
		}
		sc.nextLine();
	}
}
