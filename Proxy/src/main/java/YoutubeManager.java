public class YoutubeManager {
    // I am to lazy to properly implement this, so here is just the psvm, but it still follows the diagram
    public static void main(String[] args) {
        ThirdPartyYoutubeLib youtubeConnectionClass = new ThirdPartyYoutubeClass();

        CachedYoutubeClass proxyClass = new CachedYoutubeClass(youtubeConnectionClass);
        // Prints
        System.out.println("First Occurrence: ");
        proxyClass.listVideos();
        proxyClass.getVideoInfo(0);
        proxyClass.downloadVideo(0);
        // Does not print
        System.out.println("Second Occurrence: ");
        proxyClass.listVideos();
        proxyClass.getVideoInfo(0);
        proxyClass.downloadVideo(0);
        // Prints
        System.out.println("Reset: ");
        proxyClass.resetCache();
        proxyClass.listVideos();
        proxyClass.getVideoInfo(0);
        proxyClass.downloadVideo(0);
        proxyClass.stopReset();
        // Does not print
        System.out.println("Third Occurrence: ");
        proxyClass.listVideos();
        proxyClass.getVideoInfo(0);
        proxyClass.downloadVideo(0);
    }
}
