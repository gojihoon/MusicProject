package music;

import java.util.Comparator;

public class ComparatorMusicDTO implements Comparator<MusicDTO> {

	@Override
	public int compare(MusicDTO o1, MusicDTO o2) {
		int result = 1;
		if (o1.getHits() >= o2.getHits()) {
			result = -1;
		}
		return result;
	}

}
