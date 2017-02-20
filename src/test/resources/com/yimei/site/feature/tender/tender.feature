#Feature: 发布招标
#  Scenario Outline: 测试发布招标
#    Given 输入用户名、密码
#      | username | password   | tendercode  | tendername | tenderunits  | capitalsettlement | margins  |purchase_title   | receiving_unit  |purchase_quantity  | delivery_unit  | ncv  | rs  | adv  | adv02  |tm  | purchaseamount  |
#      | <username>   | <password> | <tendercode>|<tendername>|<tenderunits> |<capitalsettlement>|<margins> |<purchase_title> |<receiving_unit> |<purchase_quantity>|<delivery_unit> |<ncv> |<rs> |<adv> |<adv02> |<tm> |<purchaseamount>|
#
#    When 点击登录
#
#    And 点击【阳光采购】模块
#
#    Then 点击【发布招标】按钮
#
#    Given 输入招标基本信息
#
#    Then 点击提交按钮，发布成功
#  Examples:
#    | username        | password | tendercode  | tendername | tenderunits | capitalsettlement | margins |  purchase_title  |receiving_unit | purchase_quantity| delivery_unit| ncv  | rs  | adv |adv02|tm | purchaseamount  |
#    | 15221423096     | 123456   |ZB201605180001| 测试自动化  | 测试自动化   |      一票结算      |    99   | 测试自动化测试自动化|    瑞茂通      |         99       |    易煤网     | 3456 |5.76 | 43  | 24  |28 |       99        |
