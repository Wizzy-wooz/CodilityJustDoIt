package Iterations

import Codility.Iterations.BinaryGap
import org.scalatest._

class BinaryGapSpec extends FlatSpec with Matchers {
    time("test N1 run "){
    it should "return 0 as max sequence of consecutive zeros" in {
      BinaryGap.findForNumber(0) should be(0)
      BinaryGap.findForNumber(1) should be(0)
    }
    }

    time("test N2 run ") {
      it should "return 1 as max sequence of consecutive zeros" in {
        BinaryGap.findForNumber(7) should be(0)
      }
    }

  //ScalaMeter?
  def time[T](str: String)(thunk: => T): T = {
    print(str + "... ")
    val t1 = System.currentTimeMillis
    val x = thunk
    val t2 = System.currentTimeMillis
    println((t2 - t1) + " msecs")
    x
  }
}
