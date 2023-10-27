package Structural_Pattern.Bridge;

public class YouTubeVideo extends Video {
    public YouTubeVideo(VideoProcessor processor) {
        super(processor);
    }

    @Override
    public void play(String videoFile) {
        processor.process(videoFile);
    }
}
