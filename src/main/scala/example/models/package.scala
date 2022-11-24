package example

import eu.timepit.refined.api.Refined
import eu.timepit.refined.collection._
import eu.timepit.refined.{W, string}

package object models {
  type LanguageCode = String Refined string.MatchesRegex[W.`"^[a-z]{2}$"`.T]
  type ProductName = String Refined NonEmpty
  type ProductId = java.util.UUID // String Refined Uuid
}
