Feature: 测试现货下单

  Scenario Outline: 登录测试
    Given 输入用户名、密码
      | username | password   |  originplace   | brandname   | supplyNumber1  | nCV  | nCV02  | aDV  | aDV02  | rS  | rS02  | tM  | tM02  | aSH  | aSH02  |
      | <user>   | <password> |  <originplace> | <brandname> |<supplyNumber1> |<nCV> |<nCV02> |<aDV> |<aDV02> |<rS> |<rS02> |<tM> |<tM02> |<aSH> |<aSH02> |
    When 点击登录

    When 点击【现货搜索】

    Given 输入下单信息

    Then 下单成功


  Examples:
    | user        | password | originplace  | brandname | supplyNumber1  | nCV   | nCV02  | aDV  | aDV02  | rS  | rS02  | tM  | tM02  |aSH  | aSH02  |
    | 15221423096 | 123456   |     山西      |  原煤     |      99999     | 1234  | 5678   | 12.34| 34.43  | 4.6 | 6.43  | 22.8| 38.54 |  43  |   49   |
    | 15221423096 | 123456   |     太原      |  朝鲜煤   |      88888     | 4321  | 7432   | 32   | 22.11  | 1.6  |  6    | 29.8| 8.54 |  3   |   50   |
