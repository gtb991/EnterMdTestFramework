@GeoMakeOrders
Feature: Make orders on enter.online
  Background:
    Given User is on homepage

  Scenario: Add to cart from category cadou pentru ea
    When go to cadou pentru ea category
    And select Bobby Compact anti-theft product
    And select color to blue
    And add to cart
    And go to cart
    Then verify is in cart


  Scenario: Add to cart from toate categoriile
    When go to periferice
    And select PC si periferice
    And select tastaturi
    And select two option from filter
    And select and add to cart
    And go to see the cart
    Then verify selected product is in cart

    Scenario:Order products from home page
      When go to casti category
      And select a product
      And take a look to cart
      And place a order
#      And fill the delivery info
#      Then verify the success message