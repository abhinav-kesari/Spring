package springmvcsearch.model;

public class Search {

    private String q;

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public Search(String search) {
        this.q = search;
    }

    public Search() {
    }

    @Override
    public String toString() {
        return "Search{" +
                "q='" + q + '\'' +
                '}';
    }
}
