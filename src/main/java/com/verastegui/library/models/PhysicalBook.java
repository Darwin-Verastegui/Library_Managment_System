public class PhysicalBook extends Book {
    private String coverType;

    public PhysicalBook(String name, String author, float price, String coverType) {
        super(name, author, price);
        this.coverType = coverType;
    }

    public String getCoverType() {
        return this.coverType;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cover Type: " + this.coverType;
    }
}