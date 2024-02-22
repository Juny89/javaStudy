package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		
		//얕은 복사(실제 값이 아닌 값을 바라보는 주소값을 복사하는 것이다
		//System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		//깊은 복사(실제 값을 복사하는 것이기 때문에, 바라보는 주소값도 다르게 된다)
		for(int i = 0; i < copyLibrary.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		//library를 수정하면 같은곳을 바라보는(얕은복사된) copyLibrary[0]도 함께 값이 달라진다
		//library[0].setAuthor("박완서");
		//library[0].setTitle("나목");
		
		
		/*원본 library객체와 copyLibrary객체를 비교하기위해 향상된 for문으로 출력*/
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}

		System.out.println("== copy library ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}
}
