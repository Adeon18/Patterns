public interface ThirdPartyYoutubeLib {
    String listVideos();
    String getVideoInfo(int id);
    String downloadVideo(int id);
}
