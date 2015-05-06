
package klotski;
import java.applet.Applet;
import java.applet.AudioClip;
public class Sound {
    public static final AudioClip winner = 
            Applet.newAudioClip(Sound.class.getResource("winner.wav"));
}
