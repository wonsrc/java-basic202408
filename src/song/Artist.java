package song;

import java.io.Serializable;
import java.util.Set;

public class Artist  implements Serializable {
    private String artistName;
    private Set<String> songList;

    public Artist(String artistName, Set<String> songList) {
        this.artistName = artistName;
        this.songList = songList;
    }

    public boolean  addSong(String songName) {
        // Set의 add는 객체 추가 성공 여부를 리턴.
        return this.songList.add(songName);
    }

    public String getName() {
        return artistName;
    }


    public Set<String> getSongList() {
        return songList;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }
}
