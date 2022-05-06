package music;

public class MusicMain {

	public static void main(String[] args) {
		System.out.println("| 1.회원 가입 | 2.로그인 | 3.인기 차트 " + "| 4.장르별 검색 | 5.가수별 검색 | 6.재생 목록 저장 "
				+ "| 7.재생 목록 확인 | 8.이용권 구매 | 9.음악 구매 | 10.종료 |");
		MusicService ms = new MusicService();
		boolean run = true;
		int s = 0;
		while (run) {
			if (s == 1) {
				ms.sign();
			}
			if (s == 2) {
				ms.login();
			}
			if (s == 3) {
				ms.songReg();//노래등록 songRegistration
			}
			if (s == 4) {
				ms.pop();//인기 차트 조회
			}
			if (s == 5) {
				ms.sGenre();//장르별 검색
			}
			if (s == 6) {
				ms.sSinger();//가수별 검색
			}
			if (s == 7) {
				ms.savePlaylist();
			}
			if (s == 8) {
				ms.playlist();
			}
			if (s == 9) {
				ms.pass();
			}
			if (s == 10) {
				ms.buyMusic();
			}
			if (s == 11) {
				System.out.println("종료");
				run = false;
			}
		}
	}

}
