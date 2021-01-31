package com.knoldus.eMailValidation

class eMailLogin (validEmail: EmailValidator){
  val VerifiedEmail = "yes"
  val UnVerifiedEmail = "no"
  def getEmailId(email  :String) :String = {
    if(validEmail.isValid(email)) {
      println("Valid Email Id")
      VerifiedEmail
    }
    else {
      println("InValid Email Id")
      UnVerifiedEmail
    }
  }

}
