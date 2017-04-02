import java.time.LocalDate

import Mode._

/**
  * Created by fabio on 28.03.2017.
  */
class Storage extends Device{
  private val storage = collection.mutable.Map[Int, Int]()

  override def run(): Unit = {
    memoryBus.mode match {
      case Write => storage.put(memoryBus.address, memoryBus.data)
      case Read => memoryBus.data = memoryBus.address
    }

  }

  override val memoryBus: MemoryBus = _
}
