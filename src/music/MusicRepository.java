package music;

import java.util.ArrayList;
import java.util.List;

public class MusicRepository {
	static List<ClientDTO> clientList = new ArrayList<>();
	static List<MusicDTO> musicList = new ArrayList<>();
	static List<DealDTO> dealList = new ArrayList<>();
	static List<MusicDTO> playList = new ArrayList<>();

	boolean sign(ClientDTO client) {
		return clientList.add(client);
	}

	void saveDeal(DealDTO deal) {
		dealList.add(deal);
	}

	boolean signCheck(String clientId) { //중복체크
		boolean result = true;
		for (ClientDTO c : clientList) {
			if (clientId == c.getClientId()) {
				result = false;
			}
		}
		return result;
	}

	boolean login(String clientId, String clientPass) {
		boolean result = false;
		for (ClientDTO c : clientList) {
			if (clientId == c.getClientId() && clientPass == c.getClientPass()) {
				result = true;
			}
		}
		return result;
	}

	boolean songReg(MusicDTO music) {
		return musicList.add(music);
	}

	List<MusicDTO> pop() {
		return musicList;
	}

	MusicDTO sGenre(String Genre) {
		MusicDTO genre = null;
		for (MusicDTO m : musicList) {
			if (Genre == m.getGenre()) {
				return m;
			}
		}
		return genre;
	}

	MusicDTO sSinger(String Singer) {
		MusicDTO singer = null;
		for (MusicDTO m : musicList) {
			if (Singer == m.getSinger()) {
				return m;
			}
		}
		return singer;
	}

	boolean savePlaylist(Long songId) {
		boolean result = false;
		for (int i = 0; i < musicList.size(); i++) {
			if (songId == musicList.get(i).getSongId()) {
				playList.add(musicList.get(i));
				result = true;
			}
		}
		return result;
	}

	List<MusicDTO> playlist() {
		return playList;
	}

	String loginCheck(String clientId, String clientPass) {
		String id = null;
		for (int i = 0; i < clientList.size(); i++) {
			if (clientId == clientList.get(i).getClientId() && clientPass == clientList.get(i).getClientPass()) {
				return clientList.get(i).getClientId();
			}
		}
		return id;
	}

	ClientDTO deposit(String accountNumber, Long money) {
		ClientDTO client = null;
		for (int i = 0; i < dealList.size(); i++) {
			if (accountNumber == dealList.get(i).getAccountNumber()) {
				dealList.get(i).setDeposit(money);
				clientList.get(i).setBalance(money);
				return clientList.get(i);
			}
		}
		return client;
	}

	ClientDTO pass(String accountNumber) {
		ClientDTO client = null;
		for (int i = 0; i < dealList.size(); i++) {
			if (accountNumber == dealList.get(i).getAccountNumber()) {
				if (clientList.get(i).getBalance() >= 5000L) {
					clientList.get(i).setBalance(clientList.get(i).getBalance() - 5000L);
					clientList.get(i).setTicket(clientList.get(i).getTicket() + 1);
					return clientList.get(i);
				}
			}
		}
		return client;
	}
}
