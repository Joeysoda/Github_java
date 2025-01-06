/**
 * Description:
 * Date: 2025-01-06
 * Time: 18:46
 */
public class Adaptor {
    // 通用播放器接口
    public interface MediaPlayer {
        void play(String audioType, String fileName);
    }

    // 高级媒体播放器接口
    public interface AdvancedMediaPlayer {
        void playVlc(String fileName);
        void playMp4(String fileName);
    }

    // VLC 播放器
    public class VlcPlayer implements AdvancedMediaPlayer {
        @Override
        public void playVlc(String fileName) {
            System.out.println("Playing vlc file. Name: " + fileName);
        }

        @Override
        public void playMp4(String fileName) {
            // 什么都不做
        }
    }

    // MP4 播放器
    public class Mp4Player implements AdvancedMediaPlayer {
        @Override
        public void playVlc(String fileName) {
            // 什么都不做
        }

        @Override
        public void playMp4(String fileName) {
            System.out.println("Playing mp4 file. Name: " + fileName);
        }
    }

    public class MediaAdapter implements MediaPlayer {
        AdvancedMediaPlayer advancedMusicPlayer;

        public MediaAdapter(String audioType) {
            if (audioType.equalsIgnoreCase("vlc")) {
                advancedMusicPlayer = new VlcPlayer();
            } else if (audioType.equalsIgnoreCase("mp4")) {
                advancedMusicPlayer = new Mp4Player();
            }
        }

        @Override
        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("vlc")) {
                advancedMusicPlayer.playVlc(fileName);
            } else if (audioType.equalsIgnoreCase("mp4")) {
                advancedMusicPlayer.playMp4(fileName);
            }
        }
    }
    public class AudioPlayer implements MediaPlayer {
        MediaAdapter mediaAdapter;

        @Override
        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("mp3")) {
                System.out.println("Playing mp3 file. Name: " + fileName);
            } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
            } else {
                System.out.println("Invalid media. " + audioType + " format not supported");
            }
        }
    }
}
