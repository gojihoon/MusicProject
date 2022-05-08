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
					+ " 6.가수별 검색 | 7.재생 목록 저장 | 8.재생 목록 확인 | 9.이용권 구매 | 10.입금 | 11.종료 |");
			s = sc.nextInt();
			if (s == 1) {
				ms.sign();
			}
			if (s == 2) {
				ms.login();
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
				ms.savePlaylist();
			}
			if (s == 8) {
				ms.playlist();
			}
			if (s == 9) {
				ms.deposit();// 입금
			}
			if (s == 10) {
				ms.pass();
			}
			if (s == 11) {
				System.out.println("종료");
				run = false;
			}
		}
		sc.close();
	}

}
