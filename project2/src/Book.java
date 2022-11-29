public class Book {
    String title;
    int qPages;
    int price;

    public Book(String title, int qPages, int price) {
        this.title = title;
        this.qPages = qPages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getqPages() {
        return qPages;
    }

    public void setqPages(int qPages) {
        this.qPages = qPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printOutBookClass() {
        System.out.println("title : " + title + " quantity of pages : " + qPages + " price : " + price);
    }
}
