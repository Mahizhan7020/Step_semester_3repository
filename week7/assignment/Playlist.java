class Playlist {
    private String[] songs;
    private int count;
    Playlist(int size){
        songs=new String[size];
        count=0;
    }
    public void addSong(String song){
        if(count<songs.length) songs[count++]=song;
    }
    public String[] getSongs(){
        String[] copy=new String[count];
        System.arraycopy(songs,0,copy,0,count);
        return copy;
    }
    public int getSongCount(){
        return count;
    }
}
