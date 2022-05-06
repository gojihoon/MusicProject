package music;

public class MusicDTO {
	private Long songId;// 노래 고유 번호
	private String songTitile;// 노래제목
	private String genre;// 장르
	private String singer;// 가수
	private String date;// 노래 등록 시간
	private Long Hits;

	public MusicDTO(Long songId, String songTitile, String genre, String singer, String date, Long hits) {
		this.songTitile = songTitile;
		this.genre = genre;
		this.singer = singer;
		this.songId = songId;
		this.date = date;
		Hits = hits;
	}

	public String getSongTitile() {
		return songTitile;
	}

	public void setSongTitile(String songTitile) {
		this.songTitile = songTitile;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Long getSongId() {
		return songId;
	}

	public void setSongId(Long songId) {
		this.songId = songId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getHits() {
		return Hits;
	}

	public void setHits(Long hits) {
		Hits = hits;
	}

	@Override
	public String toString() {
		return "MusicDTO [songTitile=" + songTitile + ", genre=" + genre + ", singer=" + singer + ", songId=" + songId
				+ ", date=" + date + ", Hits=" + Hits + "]";
	}

}