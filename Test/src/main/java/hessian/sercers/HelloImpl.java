package hessian.sercers;

import java.io.Serializable;

public class HelloImpl implements Hello,Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  public String helloStr = "Hello World";

  public String getHelloStr() {
    return helloStr;
  }
  public void setHelloStr(String helloStr) {
    this.helloStr = helloStr;
  }
  public String seeHello() {
    // TODO Auto-generated method stub
    return getHelloStr();
  }
  

}
