package missingsymbol {

  package object p  {
    type Container = String
  }

}


package missingsymbol.p {
  class Test extends Container.Nested

  object Container {
    trait Nested
  }
}
