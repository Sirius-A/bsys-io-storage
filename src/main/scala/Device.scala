/**
  * Created by fabio on 28.03.2017.
  */

abstract class Device {
  val memoryBus: MemoryBus

  abstract def run()

}
