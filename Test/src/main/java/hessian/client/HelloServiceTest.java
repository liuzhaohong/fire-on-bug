package hessian.client;

import hessian.sercers.Hello;

import com.caucho.hessian.client.HessianProxyFactory;

public class HelloServiceTest {

  public static void main(String[] args) throws Exception {
    String url = "http://localhost:8080/Test/index.jsp";
    HessianProxyFactory factory = new HessianProxyFactory();
    Hello hello = (Hello) factory.create(Hello.class, url);
    System.out.println("远程调用结果: " + hello.seeHello());
  }
}
