package org.knoldus.Database
import org.knoldus.USERS.USERS
import scala.concurrent.Future
trait Database[User] {
  def CreateUser(userDetails: User): Any

  def UpdateUser(id: Int, name: String): Any

  def DeleteUser(id: Int): Any
}
