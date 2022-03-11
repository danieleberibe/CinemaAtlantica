public class News {
    private int idNews;
    private String tipoNews;


    public News(int idNews2, String tipoNews2) {
        idNews2 = idNews;
        tipoNews2 = tipoNews;
    }

    public int getIdNews() {
        return this.idNews;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
    }

    public String getTipoNews() {
        return this.tipoNews;
    }

    public void setTipoNews(String tipoNews) {
        this.tipoNews = tipoNews;
    }
}