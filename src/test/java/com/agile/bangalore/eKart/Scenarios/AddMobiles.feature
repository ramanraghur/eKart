Feature: Add Mobiles to Kart
  As a seller I want admin to add the mobiles into eKart so that, buyer can see the list of mobiles to buy and buy the intrested mobiles

  Scenario: Add Mobile to Kart
    Given I have 0 mobiles in eKart
    When I add a mobile
      | Mobile Name | Manufacture Date | Price | Desciprion     |
      | Samsung     | 02/04/2011       | 10000 | Android Mobile |
    Then the eKart should have 1 mobile
      | Mobile Name | Manufacture Date | Price | Desciprion     |
      | Samsung     | 02/04/2011       | 10000 | Android Mobile |

  Scenario: Add Mobiles to Kart
    Given I have 0 mobiles in eKart
    When I add a mobile
      | Mobile Name | Manufacture Date | Price | Desciprion     |
      | Samsung     | 02/04/2011       | 10000 | Android Mobile |
      | Nokia       | 02/04/2011       | 20000 | Windows Mobile |
    Then the eKart should have 1 mobile
      | Mobile Name | Manufacture Date | Price | Desciprion     |
      | Samsung     | 02/04/2011       | 10000 | Android Mobile |
      | Nokia       | 02/04/2011       | 20000 | Windows Mobile |
