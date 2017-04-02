import java.time.LocalDate

import Mode._

/**
  * Created by fabio on 28.03.2017.
  */
class Storage extends Device{
  var storage = collection.mutable.Map[Int, LocalDate]()

  override def run(): Unit = {
    memoryBus.mode match {
      case Write => storage.put(memoryBus.address,memoryBus.date)
      case Read =>
    }

  }

  override val memoryBus: MemoryBus = _
}
