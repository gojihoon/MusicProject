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
		String clientId = sc.next();
		String clientPass = sc.next();
		String accountNumber = sc.next();
		boolean result = mr.signCheck(clientId);
		if (result == true) {
			ClientDTO client = new ClientDTO(++id, clientId, clientPass, 0L, accountNumber, 0L);
			result = mr.sign(client);
			if (result) {
				System.out.println("가입되었습니다.");
			} else {
				System.out.println("가입에 실패하였습니다. 다시 입력해주세요.");
			}
		} else {
			System.out.println("아이디가 중복되었습니다. 다시 입력하세요.");
		}
	}

	void login() {
		String clientId = sc.next();
		String clientPass = sc.next();
		boolean result = mr.login(clientId, clientPass);
		if (result) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("로그인에 실패하였습니다.");
		}
	}

	void songReg() {
		sc.nextLine();
		String songTitle = sc.nextLine();
		String genre = sc.nextLine();
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

	void pop() {
		List<MusicDTO> musicList = mr.pop();
		for(int i = 0; i<musicList.size(); i++) {
			for(int j=i+1; j<musicList.size(); j++) {
				if(musicList.get(i).getHits() < musicList.get(j).getHits()){
					Long temp = musicList.get(j).getHits();
					musicList.get(j).getHits() = musicList.get(i).getHits();
					musicList.get(i).getHits() = temp;
				}
			}
		}
	}

	void sGenre() {

	}

	void sSinger() {

	}

	void savePlaylist() {

	}

	void playlist() {

	}

	void pass() {

	}

	void buyMusic() {

	}
}
