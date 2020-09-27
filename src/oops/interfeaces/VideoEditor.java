package oops.interfeaces;

public interface VideoEditor {
	public void editVideo();
	default public void uploadVideo() {
		System.out.println("upload a video youtuber");
	}
}
