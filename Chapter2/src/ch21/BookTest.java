package ch21;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
//		for(int i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		for(Book book : library) {		//향상된 for문 library에 담겨있는 값을 전부 Book클래스 형식의 book객체에 순서대로 담는다
			System.out.println(book);	//객체의 주소값 출력
			book.showInfo();			//Book클래스 안에있는 showInfo()메소드로 책,저자 출력
		}
	}

}
