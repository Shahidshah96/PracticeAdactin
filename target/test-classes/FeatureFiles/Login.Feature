Feature: 
  To validate login fucntionality of Adactin hotel page

  Scenario Outline: 
    To validate in login by valid username and invalid password

    Given user have to enter Adactin hotel login page
    When user have to enter the "<username>","<password>","<checkin>","<checkout>","<firstname>","<lastname>","<address>","<creditcard>","<cvv>"
    Then user have to be in valid credentials page
		And user have to get invalid checkin date message
    Examples: 
      | username     | password | checkin  | checkout | firstname | lastname | address                                                      | creditcard       | cvv |
      | Shahidshah96 | Q0J269   | 16/05/22 | 18/05/22 | Shahid    | Mohammed | Anugragha pg,10.mes 1st cross street,tambaram,chennai-600045 | 4018066152030303 | 306 |
      | Shahidshah96 | Q0J269   | 15/05/22 | 17/05/21 | nithish   | raja     | b2-154,ctc colony,kottur road,pollachi-642001                | 4017066352010253 | 567 |
