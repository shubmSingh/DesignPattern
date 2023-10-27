package Structural_Pattern.Bridge;

public class Main {
    public static void main(String[] args) {
        Video ytVideo = new YouTubeVideo(new HD4KProcessor());
        ytVideo.play("abc.mp4");
        Video netflixVide = new NetflixVideo(new HDProcessor());
        ytVideo.play("xyz.vid");
    }
}
