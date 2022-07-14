package scalaMusic

import javax.sound.sampled.{AudioInputStream, AudioSystem}
import java.io.File

import com.googlecode.scala.sound.sampled._

object AttemptTwo extends App {
  val file = new File("song.mid")
  val stream: AudioInputStream = AudioSystem.getAudioInputStream(file)
  using(SourceDataLine(stream)) {
    line => {
      line.open(stream)
      line.start()
      var myData = new Array[Byte](1024)
      val numBytesToRead = 1024
      var numBytesRead = stream.read(myData, 0, numBytesToRead)
      stream.
      while (numBytesRead > 0) {
        line.write(myData, 0, numBytesRead);
        numBytesRead = stream.read(myData, 0, numBytesToRead)
      }
      line.drain()
      line.stop()
    }
  }
}
