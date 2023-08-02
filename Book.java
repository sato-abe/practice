public class Book extends TangibleAsset{
	private String isbn;
	public Book (String name, int price, String Color,String isbn){
		Super (name, price, color);
		this.isbn = isbn;
	}
	public String getIsbn(){return this.isbn;}
}
