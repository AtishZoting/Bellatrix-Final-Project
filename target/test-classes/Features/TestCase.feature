Feature: This is Cart feature

Scenario: With new user creation
  Given Click on home button
  When Click on product image
  And Click on add to cart button
  And Click on view cart
  Then Verify product title is correct or not
  Then Verify product price
  Then Verify Quantity
  Then Click on proceed to checkout
  Then Fill first name field
  And Last name field
  Then Click on company name
  Then Select country India 
  Then Enter address
  Then Enter streetAddress
  Then Enter pincode
  Then Get town name
  Then Get state name
  Then Get Phone number
  Then Get email address
  Then Click on account creation checkbox
  Then Click on place order
  Then Get message for order booked
  Then Verify Order number
  Then Verify date
  Then Verify price
  
 # Scenario: Existing user
  #Given Click on home button
  #When Click on product image
  #And Click on add to cart button
  #And Click on view cart
  #Then Verify product title is correct or not
  #Then Verify product price
  #Then Verify Quantity
  #Then Click on proceed to checkout
  #Then Verify login
  #Then Click on place order
  #Then Get message for order booked
  #Then Verify Order number
  #Then Verify date
 # Then Verify price
  
  