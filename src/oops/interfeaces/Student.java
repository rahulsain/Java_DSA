package oops.interfeaces;

public abstract interface Student {
	public void study();
	default public void uploadVideo() {
		System.out.println("upload a video student");
	}
}
