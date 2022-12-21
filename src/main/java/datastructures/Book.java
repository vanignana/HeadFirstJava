package datastructures;

public class Book {
    private String title;
    public Book(String t){
        title = t;
    }


        public boolean equals(Object aBook) {
            Book other = (Book) aBook;
            return title.equals(other.getTitle());
        }


    public String getTitle() {
        return title;
    }

    public int hashCode(){
            return title.hashCode();
        }

        public int compareTo(Book tree){
            return title.compareTo(tree.getTitle());
        }
    public String toString(){
        return title;
    }

}
