class Publication {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Publication(String title) {
        this.title = title;
    }

    public String getDetails() {
        return "title=\"" + title + "\"";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    public String getSource() {
        return source;
    }
// write your code here


    @Override
    public String getDetails() {
        char ch = '"';
        return "title=\"" + super.getTitle() + ch + "," + " " + "source=\"" + getSource() + ch;
    }
}

class Article extends Publication {

    private String author;

    public String getAuthor() {
        return author;
    }

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here

    @Override
    public String getDetails() {
        char ch = '"';
        return "title=\"" + super.getTitle() + "\"" + "," + " " + "author=" + ch + getAuthor() + ch;
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public int getDaysToExpire() {
        return daysToExpire;
    }

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here

    @Override
    public String getDetails() {
        char ch = '"';
        return "title=\"" + super.getTitle() + "\"" + "," + " " + "daysToExpire=" + getDaysToExpire();
    }
}