package com.knoldus.Test_eMailValidation

import com.knoldus.eMailValidation.{EmailValidator, eMailLogin}
import org.mockito.Mockito.{mock, when}
import org.scalatest.flatspec._

class getUserId extends AsyncFlatSpec{
  val MockedValidation: EmailValidator = mock(classOf[EmailValidator])
  val emailId = new eMailLogin(MockedValidation)

  // Unit Test Cases for Email Validation

  "Email Id " should "be Valid" in {
    when(MockedValidation.isValid("Gupta@gmail.net")) thenReturn true
    val result = emailId.getEmailId("Gupta@gmail.net")
    assert(result == "yes")
  }

  "Email Id with wrong Recipient name " should "be invalid" in {
    when(MockedValidation.isValid("!!@Gupta@gmail.com")) thenReturn false
    val result = emailId.getEmailId("!!Gupta@gmail.com")
    assert(result == "no")
  }

  "Email Id without @ symbol" should "be invalid" in {
    when(MockedValidation.isValid("Guptagmail.com")) thenReturn false
    val result = emailId.getEmailId("Guptagmail.com")
    assert(result == "no")
  }

  "Email Id with wrong Domain name " should "be invalid" in {
    when(MockedValidation.isValid("Gupta@!gmail.com")) thenReturn false
    val result1 = emailId.getEmailId("Gupta@!gmail.com")
    assert(result1 == "no")
  }

  "Email Id with wrong Top-Level Domain name " should "be invalid" in {
    when(MockedValidation.isValid("Gupta@gmail.ccom")) thenReturn false
    val result1 = emailId.getEmailId("Gupta@gmail.ccom")
    assert(result1 == "no")
  }
}
