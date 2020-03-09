import io.gatling.core.Predef._
import io.gatling.http.Predef._
import pea.app.gatling.PeaSimulation

class testcase_demo extends PeaSimulation{

  override val description: String =
    """
      | 测试demo
    """.stripMargin

  setUp(scenario("测试demo")
    .exec(http("测试demo接口")
      .get("")
    ).inject(constantUsersPerSec(30) during(2))
  ) .protocols(http.baseUrl("http://www.baidu.com"))
}
