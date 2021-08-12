package org.knoldus.bootstarp
import org.knoldus.Database.Database
import scala.collection.mutable
import org.knoldus.USERS.USERS

class Main extends Database[USERS] {
  val MainData: mutable.Map[Int, USERS] = mutable.Map()

  //----------------------------------------------CREATE--------------
  override def CreateUser(USERS: USERS): Any = {

    MainData += USERS.id -> USERS

    println(MainData)
  }

  //--------------------------------------------------------DELETE USER--------
  override def DeleteUser(id: Int): Any = {

    if (MainData(id).name.nonEmpty) {
      MainData -= id
    }

  }
  //--------------------------------------------------------UPDATE------------

  override def UpdateUser(newid: Int, newName: String): Any = {

    val newUser = USERS(newid, newName)
    MainData += newid -> newUser


    println(MainData)
  }
}