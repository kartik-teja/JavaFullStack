package week1_2;

public class Book {
	
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    @Override
    public String toString() {
        return "Book[name: "+getName()+", author:"+ getAuthor()+", price:"+getPrice()+", qtyInStock:"+getQtyInStock()+"]"; 
    }

    public static void main(String[] args) {
    	Author a = new Author("Charan","Charan@gmail.com",'M');
		Book b = new Book("Trignometry",a,78.50,50);
		
		System.out.print(b);
    }
}

