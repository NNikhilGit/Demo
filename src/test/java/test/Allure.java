package test;

import org.testng.annotations.Test;

import com.google.gson.annotations.SerializedName;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;

public class Allure {
  @Test(priority=0,description="test")

  @Description
  public void f() {
  }
}
