package example

import org.specs2.specification.core.Fragments
import org.specs2.specification.create.{DefaultFragmentFactory => ff}

object Hello extends Greeting with App with org.specs2.specification.dsl.FragmentsDsl{
  val fragments = List.range(1, 10000).map(x => ff.text(s"Fragment #$x"))
  Fragments(fragments: _*)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
