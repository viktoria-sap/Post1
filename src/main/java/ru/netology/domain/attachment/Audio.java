package ru.netology.domain.attachment;

public class Audio {
    private String title;
    private String artist;
    private String url;

    private int id;
    private int ownerId;
    private int duration;
    private int lyricsId;
    private int albumId;
    private int genreId;
    private int date;
    private int noSearch;
    private int isHq;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(int lyricsId) {
        this.lyricsId = lyricsId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getNoSearch() {
        return noSearch;
    }

    public void setNoSearch(int noSearch) {
        this.noSearch = noSearch;
    }

    public int getIsHq() {
        return isHq;
    }

    public void setIsHq(int isHq) {
        this.isHq = isHq;
    }

}
