class Publication {



    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return String.format("%s %s", getType(), getDetails());
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return "Publication:";
    }

    public String getDetails() {

        return String.format("%s", getTitle());
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    @Override
    public String getType() {
        return "Newspaper";
    }


    @Override
    public String getDetails() {

        return String.format("(source - %s): %s", source, super.getTitle());
    }

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getType() {
        return "Article";
    }


    @Override
    public String getDetails() {

        return String.format("(author - %s): %s", author, super.getTitle());
    }

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getType() {
        return "Announcement";
    }


    @Override
    public String getDetails() {

        return String.format("(days to expire - %s): %s", daysToExpire, super.getTitle());
    }

}

//class Main{
//    public static void main(String[] args) {
//        Newspaper n = new Newspaper("Football results", "Sport news");
//        System.out.println(n.getType());
//        System.out.println(n.getDetails());
//        System.out.println(n.getInfo());
//    }
//}