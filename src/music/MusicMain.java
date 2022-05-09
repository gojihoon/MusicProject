package music;

import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MusicService ms = new MusicService();
		boolean run = true;
		int s = 0;
		while (run) {
			System.out.println("| 1.회원 가입 | 2.로그인 | 3.노래 등록 | 4.인기 차트 | 5.장르별 검색 |"
					+ " 6.가수별 검색 | 7.재생 목록 저장 | 8.재생 목록 확인 | 9.입금 | 10.이용권 구매 | 11.종료 |");
			System.out.print(">");
			s = sc.nextInt();
			if (s == 1) {
				ms.sign(); //회원가입
			}
			if (s == 2) {
				ms.login(); //로그인
			}
			if (s == 3) {
				ms.songReg();// 노래 등록 songRegistration
			}
			if (s == 4) {
				ms.pop();// 인기 차트 조회
			}
			if (s == 5) {
				ms.sGenre();// 장르별 검색
			}
			if (s == 6) {
				ms.sSinger();// 가수별 검색
			}
			if (s == 7) {
				ms.savePlaylist(); //플레이리스트 저장
			}
			if (s == 8) {
				ms.playlist(); //플레이리스트 확인
			}
			if (s == 9) {
				ms.deposit();// 입금
			}
			if (s == 10) {
				ms.pass(); // 이용권 구매
			}
			if (s == 11) {
				System.out.println("종료");
				run = false;
			}
		}
		sc.close();
	}

}
