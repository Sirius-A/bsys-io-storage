import Mode.{Read, Write}

/**
  * Created by fabio on 03.04.2017.
  */
object CommandLineDevice extends Device{
  override val memoryBus: MemoryBus = _

  override def run() = {
    memoryBus.mode match {
      case Write =>
      case Read => println(s"Mode: ${memoryBus.mode} Address: ${memoryBus.address} Data: ${memoryBus.data}")
    }
  }
}