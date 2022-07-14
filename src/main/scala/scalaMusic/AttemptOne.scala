package scalaMusic

//import com.musicdsl.domain.{Eighth, Half, MusicEntity, Quarter}
//import com.musicdsl.factory.NoteFactory._
//import com.musicdsl.factory.RestFactory.Rest
//import com.musicdsl.midi.MidiMusicEntitySequence.MidiMusicEntitySequence
import javax.sound.midi.{MidiSystem, Receiver}


object AttemptOne {
  // Creates a song based on the `functional` scala list style
//  val song: List[MusicEntity] =
//    (C4 :: D4 :: E4                :: C4 :: Nil).repeat
//      . ++ ((E4 :: F4 :: (G4 during Half)        :: Nil).repeat)
//      . ++ ((G4 :: A4.octaveUp   :: G4 :: F4 :: Nil). ++ ((E4 :: C4 :: Nil).during(Quarter)).during(Eighth).repeat)
//      . ++ ((C4 :: G4.octaveDown :: (C4 during Half) :: Nil).repeat)
//
//  // Creates the same song based on the constructor scala list style
//  val song2 =
//    List(C, D, E,          C).repeat ++
//      List(E, F, G during Half).repeat ++
//      (List(G, A.octaveUp, G, F) ++ (List(E, C) during Quarter) during Eighth).repeat ++
//      List(C, G.octaveDown, C during Half).repeat
//
//  // Small demo for using rests as well
//  val song3 = List(C, Rest, D, Rest, E).during(Half)
//
//  // Small demo for possibilities of midi
//  song.toMidi.play()
//  //  song.octaveUp.toMidi.writeFile()
//
//  val receiver: Receiver = MidiSystem.getReceiver
//  receiver.send
}
