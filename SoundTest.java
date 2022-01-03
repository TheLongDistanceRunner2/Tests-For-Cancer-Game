package testy;

import game.operator.Game;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import structure.Sound;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SoundTest {
    private volatile Clip clip;
    private String name = "";
    private InputStream is;

    @Given("There is sound with name {string}")
    public void there_is_sound_with_name(String s1) {
        this.name = s1;
    }

    @Given("There is variable clip")
    public void there_is_variable_clip() {
        this.is = Game.class.getResourceAsStream("/sound/" + name);

        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(is));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Sound.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Sound.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sound.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Then("I set setFramePosition to {int}")
    public void i_set_set_frame_position_to(Integer int1) {
        clip.setFramePosition(int1);
    }

    @Then("Start the clip")
    public void start_the_clip() {
        clip.start();
    }
}
