package example

import eu.timepit.refined.api.Refined
import eu.timepit.refined.collection._
import eu.timepit.refined.string._

package object db {
  type DatabaseLogin = String Refined NonEmpty
  type DatabasePassword = String Refined NonEmpty
  type DatabaseUrl = String Refined Uri
  type NonEmptyString = String Refined NonEmpty
}
