package music;

import java.util.ArrayList;
import java.util.List;

public class MusicRepository {
	static List<ClientDTO> clientList = new ArrayList<>();
	static List<MusicDTO> musicList = new ArrayList<>();
	static List<DealDTO> dealList = new ArrayList<>();

	boolean sign(ClientDTO client) {
		return clientList.add(client);
	}

	boolean signCheck(String clientId) {
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

	void pop() {

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
