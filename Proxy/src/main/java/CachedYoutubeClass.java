public class CachedYoutubeClass implements ThirdPartyYoutubeLib{
    private ThirdPartyYoutubeLib service;
    // Let this be a string for demonstration purposes
    private String cachedVideoList;
    private String cachedVideoInfo;
    private String cachedVideo;

    private boolean reset = false;

    public CachedYoutubeClass(ThirdPartyYoutubeLib thirdPartyYoutubeLib) {
        this.service = thirdPartyYoutubeLib;
    }

    public void resetCache() {
        reset = true;
    }

    public void stopReset() {
        reset = false;
    }

    @Override
    public String listVideos() {
        if (cachedVideoList == null || reset) {
            cachedVideoList = service.listVideos();
            System.out.println("Video List Reset");
        }
        return cachedVideoList;
    }

    @Override
    public String getVideoInfo(int id) {
        if (cachedVideoInfo == null || reset) {
            cachedVideoInfo = service.getVideoInfo(id);
            System.out.println("Video Info Reset");
        }
        return cachedVideoInfo;
    }

    @Override
    public String downloadVideo(int id) {
        if (cachedVideo == null || reset) {
            cachedVideo = service.downloadVideo(id);
            System.out.println("Video Reset");
        }
        return cachedVideo;
    }
}
