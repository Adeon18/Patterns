public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib{
    @Override
    public String listVideos() {
        return "This is an API request to list videos from Youtube. Wohooo!";
    }

    @Override
    public String getVideoInfo(int id) {
        return "This is an API request to get Youtube video information. :D";
    }

    @Override
    public String downloadVideo(int id) {
        return "This is an API request to download the Youtube video. Time to watch!";
    }
}
