/**
  * Created by fabio on 28.03.2017.
  */
import java.time._
import java.util.Calendar

import Mode.Read

class MemoryBus {
  var address: Int = 0
  var date: LocalDate = LocalDate.now()
  var mode: Mode = Read

}

sealed trait Mode
object Mode {
  implicit object Read extends Mode
  implicit object Write extends Mode
}

