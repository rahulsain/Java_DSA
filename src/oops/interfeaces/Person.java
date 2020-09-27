package oops.interfeaces;

public class Person implements YouTuber,Student{

	public static void main(String[] args) {
		Person ob = new Person();
		YouTuber obj = ob;
		obj.editVideo();
		obj.makeVideo();
		ob.study();
		ob.uploadVideo();
		
	}

	@Override
	public void editVideo() {
		System.out.println("i am too good in editing");
		
	}

	@Override
	public void study() {
		System.out.println("i am a biblophile");
		
	}

	@Override
	public void makeVideo() {
		System.out.println("i can make things happen");		
	}
	 public void uploadVideo() {
		System.out.println("upload a video person");
	}

}
